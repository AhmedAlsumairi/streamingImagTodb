package com.imag;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class ImagaeSave
{
     public void save(Student student )
    {
       Configuration config=new Configuration().configure("com/imag/hibernate.cfg.xml");
       SessionFactory factory=config.buildSessionFactory();
       Session session=factory.openSession();
       Integer i=(Integer)session.save(student);
      session.beginTransaction().commit();
      System.out.println(i);
      session.close();
	  
    }
   public List<Student> get()
    {
    	Configuration config=new Configuration().configure("com/imag/hibernate.cfg.xml");
        SessionFactory factory=config.buildSessionFactory();
        Session session=factory.openSession();
        String hql="from com.imag.Student";
        Query query=session.createQuery(hql); 
        List<Student> studentlist= query.list();
        session.close();
        
        
     return studentlist;
    }
public Student get(Integer id) {
	Configuration config=new Configuration().configure("com/imag/hibernate.cfg.xml");
    SessionFactory factory=config.buildSessionFactory();
    Session session=factory.openSession();
    Student student=(Student)session.get(Student.class,id); 
    session.close();
	return student;
}
}











