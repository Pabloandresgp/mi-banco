package web;

import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.ejecutivo;
import servicio.ejecutivoservice;


@WebServlet(name = "mibancoservlet", urlPatterns = {"/"})
public class mibancoservlet extends HttpServlet {
    
    @Inject
    ejecutivoservice ejecutivoService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String accion  = request.getServletPath();
        switch(accion){
            case "/insert":
                insertarjecutivo(request, response);
                break;
            case "/delete":
                eliminarjecutivo(request, response);
                break;
        }
        listarejecutivos(request, response);
       
        
       
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       goGet(request, response);
}
    protected void listarejecutivos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       String filtro = request.getParameter("filtro");
        if (filtro == null) filtro = "";
        List<ejecutivo> ejecutivos = ejecutivoService.listaejecutivos(filtro);
        request.setAttribute("filtro", filtro);
        request.setAttribute("ejecutivos", ejecutivos);
        request.getRequestDispatcher("/listadoejecutivos.jsp").forward(request, response);
    }
protected void insertarejecutivos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String rut = request.getParameter("rut");
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String clave = request.getParameter("clave");
            
            ejecutivo e = new ejecutivo(rut, nombre, apellido, clave);
            ejecutivoService.registrarejecutivo(e);
            
            request.setAttribute("mensaje","Se agrego correctamente el ejecutivo");
   
    }
protected void eliminarejecutivos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
}

    private void insertarjecutivo(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); 
        
        
    }

    private void eliminarjecutivo(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
