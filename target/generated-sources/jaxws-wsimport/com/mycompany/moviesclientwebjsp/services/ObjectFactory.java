
package com.mycompany.moviesclientwebjsp.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.moviesclientwebjsp.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://services.javamovies.mycompany.com/", "Exception");
    private final static QName _AddContent_QNAME = new QName("http://services.javamovies.mycompany.com/", "addContent");
    private final static QName _DeleteContent_QNAME = new QName("http://services.javamovies.mycompany.com/", "deleteContent");
    private final static QName _FindAll_QNAME = new QName("http://services.javamovies.mycompany.com/", "findAll");
    private final static QName _FindContent_QNAME = new QName("http://services.javamovies.mycompany.com/", "findContent");
    private final static QName _NonexistentEntityException_QNAME = new QName("http://services.javamovies.mycompany.com/", "NonexistentEntityException");
    private final static QName _AddContentResponse_QNAME = new QName("http://services.javamovies.mycompany.com/", "addContentResponse");
    private final static QName _DeleteContentResponse_QNAME = new QName("http://services.javamovies.mycompany.com/", "deleteContentResponse");
    private final static QName _Moviestvshow_QNAME = new QName("http://services.javamovies.mycompany.com/", "moviestvshow");
    private final static QName _UpdateContentResponse_QNAME = new QName("http://services.javamovies.mycompany.com/", "updateContentResponse");
    private final static QName _UpdateContent_QNAME = new QName("http://services.javamovies.mycompany.com/", "updateContent");
    private final static QName _FindAllResponse_QNAME = new QName("http://services.javamovies.mycompany.com/", "findAllResponse");
    private final static QName _FindContentResponse_QNAME = new QName("http://services.javamovies.mycompany.com/", "findContentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.moviesclientwebjsp.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Moviestvshow }
     * 
     */
    public Moviestvshow createMoviestvshow() {
        return new Moviestvshow();
    }

    /**
     * Create an instance of {@link AddContentResponse }
     * 
     */
    public AddContentResponse createAddContentResponse() {
        return new AddContentResponse();
    }

    /**
     * Create an instance of {@link DeleteContentResponse }
     * 
     */
    public DeleteContentResponse createDeleteContentResponse() {
        return new DeleteContentResponse();
    }

    /**
     * Create an instance of {@link NonexistentEntityException }
     * 
     */
    public NonexistentEntityException createNonexistentEntityException() {
        return new NonexistentEntityException();
    }

    /**
     * Create an instance of {@link FindContent }
     * 
     */
    public FindContent createFindContent() {
        return new FindContent();
    }

    /**
     * Create an instance of {@link AddContent }
     * 
     */
    public AddContent createAddContent() {
        return new AddContent();
    }

    /**
     * Create an instance of {@link DeleteContent }
     * 
     */
    public DeleteContent createDeleteContent() {
        return new DeleteContent();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link FindContentResponse }
     * 
     */
    public FindContentResponse createFindContentResponse() {
        return new FindContentResponse();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link UpdateContent }
     * 
     */
    public UpdateContent createUpdateContent() {
        return new UpdateContent();
    }

    /**
     * Create an instance of {@link UpdateContentResponse }
     * 
     */
    public UpdateContentResponse createUpdateContentResponse() {
        return new UpdateContentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.javamovies.mycompany.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.javamovies.mycompany.com/", name = "addContent")
    public JAXBElement<AddContent> createAddContent(AddContent value) {
        return new JAXBElement<AddContent>(_AddContent_QNAME, AddContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.javamovies.mycompany.com/", name = "deleteContent")
    public JAXBElement<DeleteContent> createDeleteContent(DeleteContent value) {
        return new JAXBElement<DeleteContent>(_DeleteContent_QNAME, DeleteContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.javamovies.mycompany.com/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.javamovies.mycompany.com/", name = "findContent")
    public JAXBElement<FindContent> createFindContent(FindContent value) {
        return new JAXBElement<FindContent>(_FindContent_QNAME, FindContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonexistentEntityException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.javamovies.mycompany.com/", name = "NonexistentEntityException")
    public JAXBElement<NonexistentEntityException> createNonexistentEntityException(NonexistentEntityException value) {
        return new JAXBElement<NonexistentEntityException>(_NonexistentEntityException_QNAME, NonexistentEntityException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddContentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.javamovies.mycompany.com/", name = "addContentResponse")
    public JAXBElement<AddContentResponse> createAddContentResponse(AddContentResponse value) {
        return new JAXBElement<AddContentResponse>(_AddContentResponse_QNAME, AddContentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.javamovies.mycompany.com/", name = "deleteContentResponse")
    public JAXBElement<DeleteContentResponse> createDeleteContentResponse(DeleteContentResponse value) {
        return new JAXBElement<DeleteContentResponse>(_DeleteContentResponse_QNAME, DeleteContentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Moviestvshow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.javamovies.mycompany.com/", name = "moviestvshow")
    public JAXBElement<Moviestvshow> createMoviestvshow(Moviestvshow value) {
        return new JAXBElement<Moviestvshow>(_Moviestvshow_QNAME, Moviestvshow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.javamovies.mycompany.com/", name = "updateContentResponse")
    public JAXBElement<UpdateContentResponse> createUpdateContentResponse(UpdateContentResponse value) {
        return new JAXBElement<UpdateContentResponse>(_UpdateContentResponse_QNAME, UpdateContentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.javamovies.mycompany.com/", name = "updateContent")
    public JAXBElement<UpdateContent> createUpdateContent(UpdateContent value) {
        return new JAXBElement<UpdateContent>(_UpdateContent_QNAME, UpdateContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.javamovies.mycompany.com/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindContentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.javamovies.mycompany.com/", name = "findContentResponse")
    public JAXBElement<FindContentResponse> createFindContentResponse(FindContentResponse value) {
        return new JAXBElement<FindContentResponse>(_FindContentResponse_QNAME, FindContentResponse.class, null, value);
    }

}
