/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relaciones1a1.Ejercicio2;


public class CelularMain {
    
        public static void main(String[] args) {
        Bateria b1 = new Bateria("Samsung-123", 4500);
        Usuario u1 = new Usuario("Mauro", "40555666");
        Celular c1 = new Celular("111222333", "Samsung", "S23", b1, u1);

        System.out.println(c1);
        System.out.println(u1.getCelular());
    }
}
