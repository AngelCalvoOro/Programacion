
package clase;

import java.time.LocalDate;
import java.util.Date;


public class Trabajador {
    
    private  String dni;
    private  String nss;
    private  String nombre;
    private  String apellido;
    private  String direccion;
    private  String telefono;
    private  String sexo;
    private  String estadoCivil;
    private  LocalDate fechaAlta;
    private  String n_emple;

    private Departamento departamento;
    private Contrato contrato;

    public Trabajador() {
    }
    
    

    public Trabajador(String dni, String nss, String nombre, String apellido, String direccion, String telefono, String sexo, String estadoCivil, LocalDate fechaAlta, String n_emple, Departamento departamento, Contrato contrato) {
        this.dni = dni;
        this.nss = nss;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.fechaAlta = fechaAlta;
        this.n_emple = n_emple;
        this.departamento = departamento;
        this.contrato = contrato;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getN_emple() {
        return n_emple;
    }

    public void setN_emple(String n_emple) {
        this.n_emple = n_emple;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    
    

}
