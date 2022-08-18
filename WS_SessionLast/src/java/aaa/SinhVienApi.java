/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa;

import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Admin
 */
@Path("sinhviens")
public class SinhVienApi {

    private SinhvienRepository repository = new SinhvienRepository();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Sinhvien> getAlll() {
        return repository.findAll();
    }

    @Path("/{roll}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Sinhvien getOneOne(@PathParam("roll") String roll) {
        return repository.findDetails(roll);
    }

    @Path("/{roll}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public String xoa(@PathParam("roll") String roll) {
        repository.xoa(roll);

        return "da xoa" + roll;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String addNew(Sinhvien sv) {
        repository.addNew(sv);

        return "Them moi" + sv;
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public String update(Sinhvien sv) {
        repository.update(sv);

        return "Update" + sv;
    }
    
}
