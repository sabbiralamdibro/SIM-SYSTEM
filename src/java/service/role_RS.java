/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.role_dao;
import entity.Role;
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
@Path("/roles")
public class role_RS {
role_dao dao = new role_dao();
    
         @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Role> get2Roles() {
        List<Role> listofRole = dao.getAllRolesnew();
        return listofRole;
    }
   @GET
    @Path("/{roleid}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Role> getRoles2ByIDnew(@PathParam("roleid") int roleid) {
        return dao.getRoleByIDnew(roleid);

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Role add2Role(Role rr) {
        return dao.add2Rolenew(rr);
    }
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Role update2Role(Role ro) {
        return dao.updateRolenew(ro);
        
    }
    @DELETE
    @Path("/{roleid}")
    @Produces(MediaType.APPLICATION_JSON)
    public void delete2Role(@PathParam("roleid") int roleid) {
        dao.deleteRoleinfonew(roleid);
        

    }
  
}

