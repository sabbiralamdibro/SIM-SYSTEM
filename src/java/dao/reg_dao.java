/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Regisreation;
import entity.User;
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
public class reg_dao {
        public List<Regisreation> getAllRegisreationnew() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        Query query = s.createQuery("from Regisreation");
        List<Regisreation> regList = query.list();
        s.close();
        return regList;
    }
        public Regisreation add2Regisreationnew(Regisreation reg) {
        reg.setFirstName(reg.getFirstName());
        reg.setLastName(reg.getFirstName());
        reg.setEmail(reg.getEmail());
        reg.setAddress(reg.getAddress());
        reg.setCourseName(reg.getCourseName());
        reg.setGender(reg.getGender());
        reg.setPhone(reg.getPhone());
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        s.save(reg);
        s.getTransaction().commit();
        s.close();
        return reg;

    }

    public List<Regisreation> getRegisreationByIDnew(int regid) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        Query q = s.createQuery(" from Regisreation where regid=?");
        q.setParameter(0, regid);
        List<Regisreation> regList = q.list();
//        s.getTransaction().commit();
//        s.close();
        if (regList.size() > 0) {
            return regList;
        } else {
            throw new NotFoundException("Regisreation with id " + regid + " not found");
        }

    }
        public void deleteREGISTRationInfonew(int regid) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        Query q = s.createQuery("delete from Regisreation where regid=?");
        q.setParameter(0, regid);
        q.executeUpdate();
        s.getTransaction().commit();

        s.close();

    }
      
        
        public Regisreation updateRegisreationnew(Regisreation reg) {
        if (reg.getRegid()<= 0) {
            return null;
        }
       
        reg.setFirstName(reg.getFirstName());
        reg.setLastName(reg.getFirstName());
        reg.setEmail(reg.getEmail());
        reg.setAddress(reg.getAddress());
        reg.setCourseName(reg.getCourseName());
        reg.setGender(reg.getGender());
        reg.setPhone(reg.getPhone());
        
        
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session s=sf.openSession();
        s.beginTransaction();
        s.update(reg);
        s.getTransaction().commit();
        s.close();
        return reg;
        

    }
    
}
