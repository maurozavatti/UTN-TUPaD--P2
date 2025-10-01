
package Universidad;

public class Main {
    public static void main(String[] args) {
        // 1) Crear al menos 3 profesores y 5 cursos.
        Profesor p1 = new Profesor("P001", "Ana Torres", "Matemática");
        Profesor p2 = new Profesor("P002", "Luis Pérez", "Programación");
        Profesor p3 = new Profesor("P003", "Carla Gómez", "Física");

        Curso c1 = new Curso("MATE1", "Álgebra I");
        Curso c2 = new Curso("PROG1", "Programación I");
        Curso c3 = new Curso("FIS1",  "Física I");
        Curso c4 = new Curso("PROG2", "Programación II");
        Curso c5 = new Curso("MATE2", "Cálculo I");

        // 2) Agregar profesores y cursos a la universidad.
        Universidad uni = new Universidad("UNLaR");
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3) Asignar profesores a cursos usando asignarProfesorACurso(...).
        uni.asignarProfesorACurso("MATE1", "P001"); // Álgebra I -> Ana
        uni.asignarProfesorACurso("MATE2", "P001"); // Cálculo I -> Ana
        uni.asignarProfesorACurso("PROG1", "P002"); // Programación I -> Luis
        uni.asignarProfesorACurso("PROG2", "P002"); // Programación II -> Luis
        uni.asignarProfesorACurso("FIS1",  "P003"); // Física I -> Carla

        // 4) Listar cursos con su profesor y profesores con sus cursos.
        System.out.println();
        uni.listarCursos();
        System.out.println();
        uni.listarProfesores();

        // 5) Cambiar el profesor de un curso y verificar sincronización.
        System.out.println("\n-- Cambio de profesor: PROG2 pasa de Luis (P002) a Carla (P003) --");
        uni.asignarProfesorACurso("PROG2", "P003");
        uni.listarCursos();
        System.out.println();
        uni.listarProfesores();

        // 6) Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("\n-- Eliminar curso MATE1 --");
        uni.eliminarCurso("MATE1");
        uni.listarCursos();
        System.out.println();
        uni.listarProfesores();

        // 7) Remover un profesor y dejar profesor = null en sus cursos.
        System.out.println("\n-- Eliminar profesor P002 (Luis) --");
        uni.eliminarProfesor("P002");
        uni.listarCursos(); // cursos PROG1 (de Luis) debe quedar con profesor = null
        System.out.println();
        uni.listarProfesores();

        // 8) Reporte: cantidad de cursos por profesor.
        System.out.println();
        uni.reporteCantidadCursosPorProfesor();
    }
}
