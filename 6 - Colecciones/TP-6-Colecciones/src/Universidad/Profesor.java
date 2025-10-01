
package Universidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Profesor {
       private final String id;
    private String nombre;
    private String especialidad;
    private final List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public List<Curso> getCursos() { return Collections.unmodifiableList(cursos); }

    // ---- API pública (sincroniza ambos lados) ----
    public void agregarCurso(Curso c) {
        if (c == null) return;
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
        if (c.getProfesor() != this) {
            c.setProfesor(this); // sincroniza lado Curso (quita de profesor anterior si aplica)
        }
    }

    public void eliminarCurso(Curso c) {
        if (c == null) return;
        if (cursos.remove(c)) {
            if (c.getProfesor() == this) {
                c.setProfesor(null); // sincroniza lado Curso
            }
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("  (sin cursos asignados)");
            return;
        }
        for (Curso c : cursos) {
            System.out.println("  - " + c.getCodigo() + " | " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor{id='" + id + "', nombre='" + nombre + "', especialidad='" + especialidad
                + "', cursos=" + cursos.size() + "}");
    }

    // ---- Helpers internos para evitar recursión ----
    void addCursoInternal(Curso c) {
        if (c != null && !cursos.contains(c)) cursos.add(c);
    }
    void removeCursoInternal(Curso c) {
        cursos.remove(c);
    }
}
