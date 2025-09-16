package Relaciones1a1.Ejercicio1;

import java.time.LocalDate;

public class Pasaporte {
    private String numero;
    private LocalDate fechaEmision;

    // Composición: el Pasaporte crea/posee su Foto
    private Foto foto;

    // Asociación 1↔1 con Titular (bidireccional)
    private Titular titular;

    public Pasaporte(String numero, LocalDate fechaEmision, String img, String formato, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(img, formato); // composición 1→1
        setTitular(titular);                // establece la asociación
    }

    public String getNumero() { return numero; }
    public LocalDate getFechaEmision() { return fechaEmision; }
    public Foto getFoto() { return foto; }
    public Titular getTitular() { return titular; }

    // Mantener bidireccionalidad con Titular
    public void setTitular(Titular t) {
        if (this.titular == t) return;

        Titular anterior = this.titular;
        this.titular = t;

        if (anterior != null && anterior.getPasaporte() == this) {
            anterior.setPasaporte(null);
        }
        if (t != null && t.getPasaporte() != this) {
            t.setPasaporte(this);
        }
    }

    @Override
    public String toString() {
        return "Pasaporte{numero='" + numero + "', fechaEmision=" + fechaEmision +
               ", foto=" + foto + ", titular=" + (titular != null ? titular.getNombre() : "null") + "}";
    }
}
