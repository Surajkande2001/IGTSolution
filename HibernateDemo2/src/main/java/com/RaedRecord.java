package com;

 

import java.util.Iterator;
import java.util.List;

 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 

public class RaedRecord {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        List emp = session.createQuery("from IGTEmployee").list();
        Iterator i = emp.iterator();

        while(i.hasNext()) {

           IGTEmployee e = (IGTEmployee)i.next();
            System.out.println(e.getUid());
            System.out.println(e.getName());
            System.out.println(e.getAge());
          System.out.println(e.getSalary());
            System.out.println(e.getDesign());
        }

    }
}