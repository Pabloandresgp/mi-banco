
package servicio;

import java.util.List;
import models.ejecutivo;

public interface ejecutivoservice {
    
    public List<ejecutivo> listaejecutivos();
    public List<ejecutivo> listaejecutivos(String filtro);
    public ejecutivo encontrarejecutivoPorrut(ejecutivo ejecutivo);
    public void registrarejecutivo(ejecutivo ejecutivo);
    public void modificarejecutivo(ejecutivo ejecutivo);
    public void eliminarejecutivo(ejecutivo ejecutivo);
    
    
}
