package tp.introjava.zavatti;

import java.util.Scanner;

class TPIntroJavaConsigna8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1;
        int num2;
        double division;
        
        System.out.println("Ingrese el primer numero: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = input.nextInt();
        
        division = num1 / num2;
        System.out.println("El restultado de la division entera es: " + division);
        
        division = (double) num1 / num2;
        System.out.println("El restultado de la division double es: " + division);
 
    }
}
