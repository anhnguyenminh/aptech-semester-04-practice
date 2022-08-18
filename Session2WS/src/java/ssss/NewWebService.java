/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssss;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import model.Student;

/**
 *
 * @author Admin
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    private EntityManager em;

    public NewWebService() {
        Persistence.createEntityManagerFactory("dddddd").createEntityManager();
    }

    @WebMethod(operationName = "findAll")
    public List<Student> findAll() {
        return em.createQuery("select a from Student a").getResultList();
    }

    @WebMethod(operationName = "findByRollNo")
    public Student findByRollNo(String roll) {
        return em.find(Student.class, roll);
    }

    @WebMethod(operationName = "delete")
    public boolean delete(String roll) {
        Student sv = em.find(Student.class, roll);
        em.getTransaction().begin();
        em.remove(sv);
        em.getTransaction().commit();

        return true;
    }

    @WebMethod(operationName = "addNew")
    public boolean addNew(Student sv) {
        em.getTransaction().begin();
        em.persist(sv);
        em.getTransaction().commit();

        return true;
    }

    @WebMethod(operationName = "update")
    public boolean update(Student sv) {
        em.getTransaction().begin();
        em.merge(sv);
        em.getTransaction().commit();

        return true;
    }

}
