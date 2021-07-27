package servicio;

import datos.ejecutivoDAO;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import models.ejecutivo;

@Stateless
public class ejecutivoserviceimp implements ejecutivoservice{
    
    @Inject
    private ejecutivoDAO ejecutivoDAO;

    @Override
    public List<ejecutivo> listaejecutivos() {
        return ejecutivoDAO.findAllejecutivos();
        
    }
    
    @Override
    public List<ejecutivo> listaejecutivos(String filtro) {
        return ejecutivoDAO.findAllejecutivos(filtro);
        
    }

    @Override
    public ejecutivo encontrarejecutivoPorrut(ejecutivo ejecutivo) {
       return ejecutivoDAO.findejecutivoByrut(ejecutivo);
    }

    @Override
    public void registrarejecutivo(ejecutivo ejecutivo) {
        ejecutivoDAO.insertContact(ejecutivo);
    }

    @Override
    public void modificarejecutivo(ejecutivo ejecutivo) {
        ejecutivoDAO.updateContact(ejecutivo);
    }

    @Override
    public void eliminarejecutivo(ejecutivo ejecutivo) {
        ejecutivoDAO.deleteContact(ejecutivo);
    }
    
}
