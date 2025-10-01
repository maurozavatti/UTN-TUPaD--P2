
package Universidad;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
        private final String nombre;
    private final List<Profesor> profesores = new ArrayList<>();
    private final List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) profesores.add(p);
    }
    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) if (p.getId().equalsIgnoreCase(id)) return p;
        return null;
    }
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) if (c.getCodigo().equalsIgnoreCase(codigo)) return c;
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c == null || p == null) {
            System.out.println("No se pudo asignar. Curso o Profesor inexistente.");
            return;
        }
        c.setProfesor(p); // usa la lógica de sincronización de Curso
    }

    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c == null) return;
        // Romper relación con profesor si existe
        if (c.getProfesor() != null) {
            c.setProfesor(null);
        }
        cursos.remove(c);
    }

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p == null) return;
        // Dejar profesor = null en todos sus cursos
        // Copiamos la lista para evitar ConcurrentModification
        List<Curso> copia = new ArrayList<>(p.getCursos());
        for (Curso c : copia) {
            c.setProfesor(null);
        }
        profesores.remove(p);
    }

    public void listarProfesores() {
        System.out.println("=== Profesores ===");
        if (profesores.isEmpty()) { System.out.println("(sin profesores)"); return; }
        for (Profesor p : profesores) {
            p.mostrarInfo();
            p.listarCursos();
        }
    }

    public void listarCursos() {
        System.out.println("=== Cursos ===");
        if (cursos.isEmpty()) { System.out.println("(sin cursos)"); return; }
        for (Curso c : cursos) c.mostrarInfo();
    }

    public void reporteCantidadCursosPorProfesor() {
        System.out.println("=== Reporte: cantidad de cursos por profesor ===");
        if (profesores.isEmpty()) { System.out.println("(sin profesores)"); return; }
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + " -> " + p.getCursos().size() + " curso(s)");
        }
    }
}
