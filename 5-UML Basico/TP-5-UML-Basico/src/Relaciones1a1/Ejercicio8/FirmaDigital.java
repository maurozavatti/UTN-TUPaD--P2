/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relaciones1a1.Ejercicio8;

/**
 *
 * @author Mauro
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario; // agregación

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital{codigoHash='" + codigoHash + "', fecha='" + fecha +
                "', usuario=" + usuario + "}";
    }
}
