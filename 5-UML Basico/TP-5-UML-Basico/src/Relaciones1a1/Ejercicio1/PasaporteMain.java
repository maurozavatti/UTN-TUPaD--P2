package Relaciones1a1.Ejercicio1;

import java.time.LocalDate;

public class PasaporteMain {
        public static void main(String[] args) {
        Titular t = new Titular("Mauro Zavatti", "40545665");

        Pasaporte p = new Pasaporte(
                "AR-1234567",
                LocalDate.of(2025, 1, 10),
                "mauro.png",
                "PNG",
                t
        );

        System.out.println(p);
        System.out.println(t);
        System.out.println("¿Bidireccional? t.getPasaporte() == p => " + (t.getPasaporte() == p));
    }

}
