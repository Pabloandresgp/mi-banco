package datos;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
import javax.persistence.PersistenceContext;
import models.ejecutivo;

@Stateless
public class ejecutivoDAOimp implements ejecutivoDAO {
    
    @PersistenceContext(unitName = "EJECUTIVO_PU")
    EntityManager em;

    @Override
    public List<ejecutivo> findAllejecutivos() {
        return em.createNamedQuery("ejecutivo.findAll").getResultList();
    }
    
    @Override
    public List<ejecutivo> findAllejecutivos(String filtro) {
        return em.createNamedQuery("ejecutivo.findAll").getResultList();
    }

    @Override
    public ejecutivo findejecutivoByrut(ejecutivo ejecutivo) {
        return em.find(ejecutivo.class, ejecutivo.getRut());
    }

    @Override
    public void insertContact(ejecutivo ejecutivo) {
        em.persist(ejecutivo);
    }
    @Override
    public void updateContact(ejecutivo ejecutivo) {
        em.merge(ejecutivo);
    }

    @Override
    public void deleteContact(ejecutivo ejecutivo) {
        em.remove(em.merge(ejecutivo));
    }
    
}
