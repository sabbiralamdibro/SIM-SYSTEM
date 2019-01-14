/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Schedule;
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
public class schedule_dao {
public List<Schedule> getAllSchedule() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        Query query = s.createQuery("from Schedule");
        List<Schedule> scList = query.list();
        s.close();
        return scList;
    }
        public Schedule addSchedule(Schedule sh) {
        sh.setScheduleName(sh.getScheduleName());

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        s.save(sh);
        s.getTransaction().commit();
        s.close();
        return sh;

    }

    public List<Schedule> getScheduleByIDnew(int schid) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        Query q = s.createQuery(" from Schedule where schid=?");
        q.setParameter(0, schid);
        List<Schedule> rList = q.list();
//        s.getTransaction().commit();
//        s.close();
        if (rList.size() > 0) {
            return rList;
        } else {
            throw new NotFoundException("schedule with id " + schid + " not found");
        }

    }
        public void deleteSchedule(int schid) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        Query q = s.createQuery("delete from Schedule where schid=?");
        q.setParameter(0, schid);
        q.executeUpdate();
        s.getTransaction().commit();

        s.close();

    }
      
        
        public Schedule updateSchedule(Schedule r) {
        if (r.getSchid()<= 0) {
            return null;
        }
       
        r.setScheduleName(r.getScheduleName());

        
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session s=sf.openSession();
        s.beginTransaction();
        s.update(r);
        s.getTransaction().commit();
        s.close();
        return r;
        

    }
    
}
