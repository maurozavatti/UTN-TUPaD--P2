package tp.introjava.zavatti;

import java.util.Scanner;


public class TPIntroJavaConsigna5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Ingresa el primer numero: ");
        num1 = input.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        num2 = input.nextInt();
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        
        System.out.println("Suma = " + suma);
        System.out.println("Resta = " + resta);
        System.out.println("Multiplicacion = " + multiplicacion);
        System.out.println("Division = " + division);
        
    }
}
