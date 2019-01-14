/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.reg_dao;
import entity.Regisreation;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author SAM
 */
@Path("/registration")
public class registration_RS {
    reg_dao dao = new reg_dao();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Regisreation> get2Regisreation() {
        List<Regisreation> listofRegisreation = dao.getAllRegisreationnew();
        return listofRegisreation;
    }
   @GET
    @Path("/{regid}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Regisreation> getRegisreationByIDnew(@PathParam("regid") int regid) {
        return dao.getRegisreationByIDnew(regid);

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Regisreation add2Regisreation(Regisreation reg) {
        return dao.add2Regisreationnew(reg);
    }
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Regisreation update2Regisreation(Regisreation reg) {
        return dao.updateRegisreationnew(reg);
        
    }
    @DELETE
    @Path("/{regid}")
    @Produces(MediaType.APPLICATION_JSON)
    public void delete2Regisreation(@PathParam("regid") int regid) {
        dao.deleteREGISTRationInfonew(regid);
        

    }
    
}
