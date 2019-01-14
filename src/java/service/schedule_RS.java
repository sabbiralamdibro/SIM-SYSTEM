/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.schedule_dao;
import entity.Schedule;
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
@Path("/schedules")
public class schedule_RS {
schedule_dao dao = new schedule_dao();
    
         @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Schedule> get2Schedule() {
        List<Schedule> listofSchedule = dao.getAllSchedule();
        return listofSchedule;
    }
   @GET
    @Path("/{schid}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Schedule> getScheduleByID(@PathParam("schid") int schid) {
        return dao.getScheduleByIDnew(schid);

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Schedule add2Schedule(Schedule s) {
        return dao.addSchedule(s);
    }
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Schedule update2Schedule(Schedule s) {
        return dao.updateSchedule(s);
        
    }
    @DELETE
    @Path("/{schid}")
    @Produces(MediaType.APPLICATION_JSON)
    public void delete2Schedule(@PathParam("schid") int schid) {
        dao.deleteSchedule(schid);
        

    }
  
}

