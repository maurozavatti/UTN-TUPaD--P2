/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relaciones1a1.Ejercicio5;

/**
 *
 * @author Mauro
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;  // composición
    private Propietario propietario; // asociación bidireccional

    public Computadora(String marca, String numeroSerie, String modeloPM, String chipset, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPM, chipset); // composición
        this.propietario = propietario;
        if (propietario != null) propietario.setComputadora(this);
    }

    public String getMarca() { return marca; }
    public String getNumeroSerie() { return numeroSerie; }
    public PlacaMadre getPlacaMadre() { return placaMadre; }
    public Propietario getPropietario() { return propietario; }

    @Override
    public String toString() {
        return "Computadora{marca='" + marca + "', numeroSerie='" + numeroSerie 
                + "', placaMadre=" + placaMadre 
                + ", propietario=" + propietario.getNombre() + "}";
    }
}
