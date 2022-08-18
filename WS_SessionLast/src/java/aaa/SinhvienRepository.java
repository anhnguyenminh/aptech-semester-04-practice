/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SinhvienRepository {

    public List<Sinhvien> findAll() {
        return Arrays.asList(
                new Sinhvien("R001", "Tien"),
                new Sinhvien("R002", "Hoa")
        );
    }

    public void addNew(Sinhvien sv) {
        System.out.println("them moi sinh vien " + sv);
    }

    public void update(Sinhvien sv) {
        System.out.println("update sinh vien " + sv);
    }

    public void xoa(String roll) {
        System.out.println("xoa sinh vien theo roll: " + roll);
    }

    public Sinhvien findDetails(String roll) {
        return new Sinhvien(roll, "ho va ten sinh vien, hehe");
    }
}
