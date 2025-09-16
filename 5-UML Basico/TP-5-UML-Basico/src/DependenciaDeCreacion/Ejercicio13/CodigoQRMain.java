/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DependenciaDeCreacion.Ejercicio13;

/**
 *
 * @author Mauro
 */
public class CodigoQRMain {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Mauro Zavatti", "mauro@exaplemail.com");

        GeneradorQR generador = new GeneradorQR();
        CodigoQR codigo = generador.generar("QR-ABC-123", usuario);

        System.out.println(codigo);
    }
}
