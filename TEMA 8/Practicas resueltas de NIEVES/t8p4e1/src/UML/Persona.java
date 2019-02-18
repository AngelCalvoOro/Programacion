
package UML;

import java.time.LocalDate;

public class Persona {
    //Persona = trabajador

    //Atributos
    private String dni;
    private String nss;
    private String nombreApellidos;
    private String direccion;
    private String telefono;
    private Character sexo;
    private Character estadoCivil;
    private LocalDate fechaAlta;
    private String numeroEmpleado;

    //Relaciones
    private Contrato c;
    private Departamento d;
    //Si trabaja en el departamento de gestión tendrá un usuario informático
    private Usuario u;

    //Métodos
    public Persona(){}

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

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
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

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Character getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(Character estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String nEmpleado) {
        this.numeroEmpleado = nEmpleado;
    }

    public Contrato getC() {
        return c;
    }

    public void setC(Contrato c) {
        this.c = c;
    }

    public Departamento getD() {
        return d;
    }

    public void setD(Departamento d) {
        this.d = d;
        // Bidireccionalidad
        d.setListaPersonas(this);
    }

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }
    
    @Override
    public String toString()
    {
        String datos = "DNI: " + this.getDni();
        datos += "  " + "NSS: " + this.getNss() + "\n";
        datos += "Nombre y apellidos: " + this.getNombreApellidos() + "\n";
        datos += "Dirección: " + this.getDireccion() + "\n";
        datos += "Telefono: " + this.getTelefono() + "\n";
        datos += "Sexo: " + this.getSexo();
        datos += "  " + "Estado civil: " + this.getEstadoCivil() + "\n";
        datos += "Contrato: " + this.getC().getDescripcion() + "\n";
        datos += "Departamento: " + this.getD().getNombre() + "\n";
        if (this.getU() != null)
        {
            datos += "\t" + "Usuario: " + this.getU().getNombre();
            datos += "\t" + "Contraseña: " + this.getU().getContraseña() + "\n";
        }

        datos += "Fecha de alta: " + this.getFechaAlta() + "\n";
        datos += "Número del empleado: " + this.getNumeroEmpleado() + "\n \n";
        return datos;
    }
}
