/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesclientwebjsp.servlet;

import com.mycompany.moviesclientwebjsp.services.Exception_Exception;
import com.mycompany.moviesclientwebjsp.services.MoviesWebService;
import com.mycompany.moviesclientwebjsp.services.MoviesWebService_Service;
import com.mycompany.moviesclientwebjsp.services.Moviestvshow;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Base64;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.rpc.soap.SOAPFaultException;

/**
 *
 * @author dishi
 */
@MultipartConfig(maxFileSize = 16177215)
@WebServlet(urlPatterns = {"/SOAPClientServlet"})
public class AddUpdateServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, DatatypeConfigurationException, Exception_Exception {
        response.setContentType("text/html;charset=UTF-8");

        // read parameters from jsp
        String title = request.getParameter("title");
        String genre = request.getParameter("genre");
        String description = request.getParameter("description");
        String director = request.getParameter("director");
        String producer = request.getParameter("producer");
        String episode = request.getParameter("episode");
        String season = request.getParameter("season");
        String episodeTitle = request.getParameter("episodeTitle");
        String category = request.getParameter("category");
        String duration = request.getParameter("duration");
        String image = request.getParameter("img");
        
        //build date
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
        XMLGregorianCalendar now
                = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
        
        //build movies object
        Moviestvshow obj = new Moviestvshow();
        obj.setCategory(category);
        obj.setDataPublished(now);
        obj.setDescription(description);
        obj.setDirector(director);
        if (duration.isEmpty() || duration == null) {
            obj.setDuration(0);
        } else {
            obj.setDuration(Integer.parseInt(duration));
        }
        if(episode.isEmpty() || episode == null) {
            obj.setEpisodeNo(0);
        } else {
            obj.setEpisodeNo(Integer.parseInt(episode));
        }
        obj.setEpisodeTitle(episodeTitle);
        obj.setGenre(genre);
        obj.setProducer(producer);
        if (season.isEmpty() || season == null) {
            obj.setSeasonNo(0);
        } else {
        obj.setSeasonNo(Integer.parseInt(season));
        }
        obj.setTitle(title);
        
        Part part = request.getPart("img");
        if (part!=null) {
            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            InputStream filecontent = part.getInputStream();
            byte[] buffer = new byte[(int) part.getSize()];
            int read = 0;
            while ((read = filecontent.read(buffer)) != -1) {
                bytes.write(buffer, 0, read);
            }
            obj.setThumbnail(buffer);
        }
        String buttonName = request.getParameter("add");
        System.out.println(buttonName+"dishita");
        MoviesWebService_Service services = new MoviesWebService_Service();
        MoviesWebService port = services.getMoviesWebServicePort();
        List<Moviestvshow> totalList = port.findAll();
         
        try {
            if (buttonName == null || buttonName.isEmpty()) {
                for (Moviestvshow movie : totalList) {
                    if(obj.getTitle().equalsIgnoreCase(movie.getTitle())) {
                        int id = movie.getContentId();
                        obj.setContentId(id);
                    }
                }
                port.updateContent(obj);
                List<Moviestvshow> movieList = port.findAll();
                request.setAttribute("movieList", movieList);
            } else {
                port.addContent(obj);
                List<Moviestvshow> movieList = port.findAll();
                request.setAttribute("movieList", movieList);
            }
        } catch (Exception ex) {
            List<Moviestvshow> movieList = port.findAll();
            request.setAttribute("movieList", movieList);
            request.setAttribute("error", ex.getMessage());
            RequestDispatcher rd=request.getRequestDispatcher("/display.jsp");
            rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            processRequest(request, response);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(AddUpdateServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception_Exception ex) {
            Logger.getLogger(AddUpdateServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
            PrintWriter out = response.getWriter();
            out.write("test123");
            RequestDispatcher rd=request.getRequestDispatcher("/DisplayServlet");
            rd.forward(request, response);
            //
        }  catch (DatatypeConfigurationException ex) {
            Logger.getLogger(AddUpdateServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception_Exception ex) {
            Logger.getLogger(AddUpdateServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
 

}
