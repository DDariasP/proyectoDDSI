package Modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.NamedNativeQueries;
import org.hibernate.annotations.NamedNativeQuery;

@Entity
@Table(name = "SOCIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Socio.findAll", query = "SELECT s FROM Socio s"),
    @NamedQuery(name = "Socio.findByNumeroSocio", query = "SELECT s FROM Socio s WHERE s.numeroSocio = :numeroSocio"),
    @NamedQuery(name = "Socio.findByNombre", query = "SELECT s FROM Socio s WHERE s.nombre = :nombre"),
    @NamedQuery(name = "Socio.findByDni", query = "SELECT s FROM Socio s WHERE s.dni = :dni"),
    @NamedQuery(name = "Socio.findByFechaNacimiento", query = "SELECT s FROM Socio s WHERE s.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Socio.findByTelefono", query = "SELECT s FROM Socio s WHERE s.telefono = :telefono"),
    @NamedQuery(name = "Socio.findByCorreo", query = "SELECT s FROM Socio s WHERE s.correo = :correo"),
    @NamedQuery(name = "Socio.findByFechaEntrada", query = "SELECT s FROM Socio s WHERE s.fechaEntrada = :fechaEntrada"),
    @NamedQuery(name = "Socio.findByCategoria", query = "SELECT s FROM Socio s WHERE s.categoria = :categoria")})
@NamedNativeQueries({
    @NamedNativeQuery(name = "Socio.PorCategoria", query = "SELECT * FROM SOCIO S WHERE S.categoria = :categoria", resultClass = Socio.class)})

public class Socio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numeroSocio")
    private String numeroSocio;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "dni")
    private String dni;
    @Column(name = "fechaNacimiento")
    private String fechaNacimiento;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @Column(name = "fechaEntrada")
    private String fechaEntrada;
    @Basic(optional = false)
    @Column(name = "categoria")
    private Character categoria;
    @ManyToMany(mappedBy = "socios")
    private Set<Actividad> actividades = new HashSet<Actividad>();

    public Socio() {
    }

    public Socio(String numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public Socio(String numeroSocio, String nombre, String dni, String fechaEntrada, Character categoria) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.dni = dni;
        this.fechaEntrada = fechaEntrada;
        this.categoria = categoria;
    }

    public Socio(String numeroSocio, String nombre, String dni, String fechaNac, String telefono, String correo, String fechaEntrada, Character categoria) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNac;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaEntrada = fechaEntrada;
        this.categoria = categoria;
    }

    public String getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(String numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad(String fecha) {
        String[] hoy = fecha.split("/");
        int diaH = Integer.parseInt(hoy[0]);
        int mesH = Integer.parseInt(hoy[1]);
        int anyoH = Integer.parseInt(hoy[2]);

        String[] nac = this.fechaNacimiento.split("/");
        int diaN = Integer.parseInt(nac[0]);
        int mesN = Integer.parseInt(nac[1]);
        int anyoN = Integer.parseInt(nac[2]);

        int edad = anyoH - anyoN;
        if (mesH <= mesN) {
            if (mesH == mesN && diaH >= diaN) {
                edad++;
            }
        } else {
            edad++;
        }
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Character getCategoria() {
        return categoria;
    }

    public void setCategoria(Character categoria) {
        this.categoria = categoria;
    }

    @XmlTransient
    public Set<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(Set<Actividad> actividades) {
        this.actividades = actividades;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroSocio != null ? numeroSocio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Socio)) {
            return false;
        }
        Socio other = (Socio) object;
        if ((this.numeroSocio == null && other.numeroSocio != null) || (this.numeroSocio != null && !this.numeroSocio.equals(other.numeroSocio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Socio[ numeroSocio=" + numeroSocio + " ]";
    }

    public String mostrar() {
        String str = String.format("%-6s %-30s %-9s %-10s %-9s %-32s %-10s %9c", numeroSocio, nombre, dni, fechaNacimiento, telefono, correo, fechaEntrada, categoria);
        return str;
    }

}
