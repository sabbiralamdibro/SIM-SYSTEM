/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Role;
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
public class role_dao {

     public List<Role> getAllRolesnew() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        Query query = s.createQuery("from Role");
        List<Role> uList = query.list();
        s.close();
        return uList;
    }
        public Role add2Rolenew(Role r) {
        r.setRoleName(r.getRoleName());

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        s.save(r);
        s.getTransaction().commit();
        s.close();
        return r;

    }

    public List<Role> getRoleByIDnew(int roleid) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        Query q = s.createQuery(" from Role where roleid=?");
        q.setParameter(0, roleid);
        List<Role> rList = q.list();
//        s.getTransaction().commit();
//        s.close();
        if (rList.size() > 0) {
            return rList;
        } else {
            throw new NotFoundException("Role with id " + roleid + " not found");
        }

    }
        public void deleteRoleinfonew(int roleid) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        Query q = s.createQuery("delete from Role where roleid=?");
        q.setParameter(0, roleid);
        q.executeUpdate();
        s.getTransaction().commit();

        s.close();

    }
      
        
        public Role updateRolenew(Role r) {
        if (r.getRoleid()<= 0) {
            return null;
        }
       
        r.setRoleName(r.getRoleName());

        
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session s=sf.openSession();
        s.beginTransaction();
        s.update(r);
        s.getTransaction().commit();
        s.close();
        return r;
        

    }
    
}
