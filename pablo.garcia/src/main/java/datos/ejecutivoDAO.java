package datos;

import java.util.List;
import models.ejecutivo;

public interface ejecutivoDAO {
    public List<ejecutivo> findAllejecutivos();
    public List<ejecutivo> findAllejecutivos(String filtro);
    public ejecutivo findejecutivoByrut(ejecutivo ejecutivo);
    public void insertContact(ejecutivo ejecutivo);
    public void updateContact(ejecutivo ejecutivo);      
    public void deleteContact(ejecutivo ejecutivo);
    
}
