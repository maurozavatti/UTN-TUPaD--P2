package Relaciones1a1.Ejercicio1;


public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // lado opuesto de la asociación

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public Pasaporte getPasaporte() { return pasaporte; }

    // Mantener la bidireccionalidad de forma segura
    public void setPasaporte(Pasaporte p) {
        // Evitar bucles y estados inconsistentes
        if (this.pasaporte == p) return;

        // Desvincular el anterior
        Pasaporte anterior = this.pasaporte;
        this.pasaporte = p;

        if (anterior != null && anterior.getTitular() == this) {
            anterior.setTitular(null); // corta el vínculo del otro lado
        }
        if (p != null && p.getTitular() != this) {
            p.setTitular(this); // asegura la relación en el otro lado
        }
    }

    @Override
    public String toString() {
        return "Titular{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}
