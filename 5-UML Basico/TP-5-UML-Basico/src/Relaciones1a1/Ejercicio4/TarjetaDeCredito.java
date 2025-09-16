/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relaciones1a1.Ejercicio4;

import java.time.LocalDate;
/**
 *
 * @author Mauro
 */
public class TarjetaDeCredito {
    private String numero;
    private LocalDate fechaVencimiento;
    private Cliente cliente;   // Asociación bidireccional
    private Banco banco;       // Agregación

    public TarjetaDeCredito(String numero, LocalDate fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
        cliente.setTarjeta(this); // vínculo bidireccional
    }

    public String getNumero() {
        return numero;
    }
    
    
    
    @Override
    public String toString() {
        return "TarjetaDeCredito{" +
                "numero='" + numero + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                ", cliente=" + cliente.getNombre() +
                ", banco=" + banco.getNombre() +
                '}';
    }
}
