/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Course;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;
import util.NotFoundException;

/**
 *
 * @author SAM
 */
////*    private Integer cid;
//     private String courseName;
//     private Integer courseHours;
//     private Double fees;
//     private String batchName;
//     private Integer module;
//     private String schedule;*/
public class course_Dao {
 public List<Course> getAllCoursenew() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        Query query = s.createQuery("from Course");
        List<Course> cList = query.list();
        s.close();
        return cList;
    }
        public Course add2Coursenew(Course c) {
        c.setCourseName(c.getCourseName());
        c.setCourseHours(c.getCourseHours());
        c.setFees(c.getFees());
        c.setBatchName(c.getBatchName());
        c.setModule(c.getModule());
        c.setSchedule(c.getSchedule());
      
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        s.save(c);
        s.getTransaction().commit();
        s.close();
        return c;

    }

    public List<Course> getCourseByIDnew(int cid) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        Query q = s.createQuery(" from Course where cid=?");
        q.setParameter(0, cid);
        List<Course> cList = q.list();
//        s.getTransaction().commit();
//        s.close();
        if (cList.size() > 0) {
            return cList;
        } else {
            throw new NotFoundException("Course with id " + cid + " not found");
        }

    }
        public void deleteCourseInfonew(int cid) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        Query q = s.createQuery("delete from Course where cid=?");
        q.setParameter(0, cid);
        q.executeUpdate();
        s.getTransaction().commit();

        s.close();

    }
      
        
        public Course updateCourseew(Course c) {
        if (c.getCid()<= 0) {
            return null;
        }
       
        c.setCourseName(c.getCourseName());
        c.setCourseHours(c.getCourseHours());
        c.setFees(c.getFees());
        c.setBatchName(c.getBatchName());
        c.setModule(c.getModule());
        c.setSchedule(c.getSchedule());
       SessionFactory sf=HibernateUtil.getSessionFactory();
        Session s=sf.openSession();
        s.beginTransaction();
        s.update(c);
        s.getTransaction().commit();
        s.close();
        return c;
        

    }
}
