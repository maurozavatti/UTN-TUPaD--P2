/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DependenciaDeUso.Ejercicio12;

/**
 *
 * @author Mauro
 */
public class ImpuestoMain {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Mauro Zavatti", "20-40545665-3");
        Impuesto impuesto = new Impuesto(10000, contribuyente);

        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
    }
}
