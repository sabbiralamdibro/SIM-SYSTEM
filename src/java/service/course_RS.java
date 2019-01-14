/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.course_Dao;
import entity.Course;
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
@Path("/courses")
public class course_RS {
    course_Dao dao = new course_Dao();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Course> get2Course() {
        List<Course> listofCourse = dao.getAllCoursenew();
        return listofCourse;
    }
   @GET
    @Path("/{cid}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Course> getCoursesByIDnew(@PathParam("cid") int cid) {
        return dao.getCourseByIDnew(cid);

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Course add2Course(Course c) {
        return dao.add2Coursenew(c);
    }
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Course update2Course(Course c) {
        return dao.updateCourseew(c);
        
    }
    @DELETE
    @Path("/{cid}")
    @Produces(MediaType.APPLICATION_JSON)
    public void delete2Course(@PathParam("cid") int cid) {
        dao.deleteCourseInfonew(cid);
        

    }
    
}