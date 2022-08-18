
package eeeee;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eeeee package. 
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

    private final static QName _AddNewResponse_QNAME = new QName("http://ssss/", "addNewResponse");
    private final static QName _DeleteResponse_QNAME = new QName("http://ssss/", "deleteResponse");
    private final static QName _FindByRollNo_QNAME = new QName("http://ssss/", "findByRollNo");
    private final static QName _Student_QNAME = new QName("http://ssss/", "student");
    private final static QName _FindByRollNoResponse_QNAME = new QName("http://ssss/", "findByRollNoResponse");
    private final static QName _UpdateResponse_QNAME = new QName("http://ssss/", "updateResponse");
    private final static QName _Delete_QNAME = new QName("http://ssss/", "delete");
    private final static QName _FindAll_QNAME = new QName("http://ssss/", "findAll");
    private final static QName _AddNew_QNAME = new QName("http://ssss/", "addNew");
    private final static QName _FindAllResponse_QNAME = new QName("http://ssss/", "findAllResponse");
    private final static QName _Update_QNAME = new QName("http://ssss/", "update");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eeeee
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindByRollNoResponse }
     * 
     */
    public FindByRollNoResponse createFindByRollNoResponse() {
        return new FindByRollNoResponse();
    }

    /**
     * Create an instance of {@link AddNewResponse }
     * 
     */
    public AddNewResponse createAddNewResponse() {
        return new AddNewResponse();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link FindByRollNo }
     * 
     */
    public FindByRollNo createFindByRollNo() {
        return new FindByRollNo();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link AddNew }
     * 
     */
    public AddNew createAddNew() {
        return new AddNew();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssss/", name = "addNewResponse")
    public JAXBElement<AddNewResponse> createAddNewResponse(AddNewResponse value) {
        return new JAXBElement<AddNewResponse>(_AddNewResponse_QNAME, AddNewResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssss/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByRollNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssss/", name = "findByRollNo")
    public JAXBElement<FindByRollNo> createFindByRollNo(FindByRollNo value) {
        return new JAXBElement<FindByRollNo>(_FindByRollNo_QNAME, FindByRollNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Student }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssss/", name = "student")
    public JAXBElement<Student> createStudent(Student value) {
        return new JAXBElement<Student>(_Student_QNAME, Student.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByRollNoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssss/", name = "findByRollNoResponse")
    public JAXBElement<FindByRollNoResponse> createFindByRollNoResponse(FindByRollNoResponse value) {
        return new JAXBElement<FindByRollNoResponse>(_FindByRollNoResponse_QNAME, FindByRollNoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssss/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssss/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssss/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNew }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssss/", name = "addNew")
    public JAXBElement<AddNew> createAddNew(AddNew value) {
        return new JAXBElement<AddNew>(_AddNew_QNAME, AddNew.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssss/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssss/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

}
