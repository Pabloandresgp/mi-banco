package models;

import javax.persistence.*;

@Entity

@NamedQueries({
    @NamedQuery(name = "ejecutivo.findAll", query = "SELECT e FROM ejecutivo e ORDER BY e.rut")
})

public class ejecutivo {
    
    @Id
    @Column (name = "rut")
    private String rut;
    private String nombre;
    private String apellido;
    private String clave;

    public ejecutivo() {
    }

    public ejecutivo(String rut, String nombre, String apellido, String clave) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
    }

    /**
     * @return the rut
     */
    public String getRut() {
        return rut;
    }

    /**
     * @param rut the rut to set
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "ejecutivo{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", clave=" + clave + '}';
    }
    
}
