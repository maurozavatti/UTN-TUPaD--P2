
package Universidad;

public class Curso {
    private final String codigo;
    private String nombre;
    private Profesor profesor; // 1 profesor responsable

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    // Asigna/cambia profesor sincronizando ambos lados
    public void setProfesor(Profesor p) {
        if (this.profesor == p) return; // nada que hacer

        Profesor anterior = this.profesor;
        this.profesor = p;

        if (anterior != null) {
            anterior.removeCursoInternal(this); // quitar de la lista del profesor anterior (sin recursión)
        }
        if (p != null) {
            p.addCursoInternal(this); // agregar a la lista del nuevo profesor (sin recursión)
        }
    }

    public void mostrarInfo() {
        String prof = (profesor == null) ? "(sin profesor)" : profesor.getNombre();
        System.out.println("Curso{codigo='" + codigo + "', nombre='" + nombre + "', profesor=" + prof + "}");
    }
}
