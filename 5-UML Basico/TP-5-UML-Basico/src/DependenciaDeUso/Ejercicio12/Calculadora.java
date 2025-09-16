/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DependenciaDeUso.Ejercicio12;

/**
 *
 * @author Mauro
 */
public class Calculadora {
    // Dependencia de uso
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto para " + impuesto.getContribuyente());
        System.out.println("Monto del impuesto: $" + impuesto.getMonto());
        double total = impuesto.getMonto() * 1.21; // por ejemplo, con IVA del 21%
        System.out.println("Total con IVA: $" + total);
    }
}
