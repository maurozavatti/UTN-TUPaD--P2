/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DependenciaDeCreacion.Ejercicio13;

/**
 *
 * @author Mauro
 */
public class GeneradorQR {
    // Dependencia de creación: genera un nuevo objeto CodigoQR
    public CodigoQR generar(String valor, Usuario usuario) {
        return new CodigoQR(valor, usuario);
    }
}
