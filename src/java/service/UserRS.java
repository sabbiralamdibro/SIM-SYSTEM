/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.User_dao;
import entity.User;
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
@Path("/usersdetails")
public class UserRS {
     User_dao dao = new User_dao();
    
         @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> get2Usernew() {
        List<User> listofUser = dao.getAllUsersnew();
        return listofUser;
    }
   @GET
    @Path("/{uid}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getUser2ByIDnew(@PathParam("uid") int uid) {
        return dao.getUser2ByIDnew(uid);

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User add2Users(User user) {
        return dao.add2Usersnew(user);
    }
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public User update2User(User user) {
        return dao.updateUsernew(user);
        
    }
    @DELETE
    @Path("/{uid}")
    @Produces(MediaType.APPLICATION_JSON)
    public void delete2Users(@PathParam("uid") int uid) {
        dao.deleteUserInfonew(uid);
        

    }
  
}
