package test;

import javax.persistence.*;
import models.ejecutivo;


public class testejecutivo {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EJECUTIVO_PU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        ejecutivo e = new ejecutivo("19176335.1", "pablo", "garcia", "123456");
        em.persist(e);
        tx.commit();
        em.close();
        
    }
    
}
