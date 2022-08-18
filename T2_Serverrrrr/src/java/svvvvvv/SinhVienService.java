/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package svvvvvv;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import model.SinhVien;

/**
 *
 * @author duynn
 */
@WebService(serviceName = "SinhVienService")
public class SinhVienService {

    private EntityManager em;

    public SinhVienService() {
        em = Persistence.createEntityManagerFactory("T2_ServerPU").createEntityManager();
    }

    @WebMethod(operationName = "findAll")
    public List<SinhVien> findAll() {
        return em.createQuery("select a from SinhVien a")
                .getResultList();
    }

    @WebMethod(operationName = "findByRollNo")
    public SinhVien findByRollNo(String roll) {
        return em.find(SinhVien.class, roll);
    }

    @WebMethod(operationName = "delete")
    public boolean delete(String roll) {
        //insert , update, xoa la phai co transaction
        SinhVien sv = em.find(SinhVien.class, roll);
        em.getTransaction().begin();
        em.remove(sv);
        em.getTransaction().commit();

        return true;
    }

    @WebMethod(operationName = "addNew")
    public boolean addNew(SinhVien sv) {
        //insert , update, xoa la phai co transaction
        em.getTransaction().begin();
        em.persist(sv);
        em.getTransaction().commit();

        return true;
    }

    @WebMethod(operationName = "update")
    public boolean update(SinhVien sv) {
        //insert , update, xoa la phai co transaction
        em.getTransaction().begin();
        em.merge(sv);
        em.getTransaction().commit();

        return true;
    }
}
