package com.project1.DemoHybernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("project started");
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Stu st = new Stu();
        st.setId(101);
        st.setName("Karan");
        System.out.println(st);
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(st);
        tx.commit();
        System.out.println(st);
    }
}
