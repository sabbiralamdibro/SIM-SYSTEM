/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
public class User_dao {
        public List<User> getAllUsersnew() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        Query query = s.createQuery("from User");
        List<User> uList = query.list();
        s.close();
        return uList;
    }
        public User add2Usersnew(User user) {
        user.setUsername(user.getUsername());
        user.setUemail(user.getUemail());
        user.setUpassword(user.getUpassword());
        user.setUroleid(user.getUroleid());
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        s.save(user);
        s.getTransaction().commit();
        s.close();
        return user;

    }

    public List<User> getUser2ByIDnew(int uid) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        Query q = s.createQuery(" from User where uid=?");
        q.setParameter(0, uid);
        List<User> uList = q.list();
//        s.getTransaction().commit();
//        s.close();
        if (uList.size() > 0) {
            return uList;
        } else {
            throw new NotFoundException("User with id " + uid + " not found");
        }

    }
        public void deleteUserInfonew(int uid) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        Query q = s.createQuery("delete from User where uid=?");
        q.setParameter(0, uid);
        q.executeUpdate();
        s.getTransaction().commit();

        s.close();

    }
      
        
        public User updateUsernew(User user) {
        if (user.getUid()<= 0) {
            return null;
        }
       
        user.setUsername(user.getUsername());
        user.setUemail(user.getUemail());
        user.setUpassword(user.getUpassword());
        user.setUroleid(user.getUroleid());
        
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session s=sf.openSession();
        s.beginTransaction();
        s.update(user);
        s.getTransaction().commit();
        s.close();
        return user;
        

    }
    
}
