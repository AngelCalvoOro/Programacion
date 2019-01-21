package UML;

import java.util.ArrayList;

public class Curso {
    
    private String curso;
    private ArrayList<Persona> listaAlumnos;

    public Curso(String curso) {
        this.curso = curso;
        // La bidireccionalidad no es obligatoria
        this.listaAlumnos = new ArrayList();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public ArrayList<Persona> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(Persona al) {
        this.listaAlumnos.add(al);
    }
    
    public void borrarAlumno(Persona al){
        this.listaAlumnos.remove(al);
    }
    
}
