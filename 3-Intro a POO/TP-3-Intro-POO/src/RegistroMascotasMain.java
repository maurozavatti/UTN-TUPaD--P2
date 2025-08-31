
import java.util.Scanner;


public class RegistroMascotasMain {
    public static void main(String[] args) {
        RegistroMascotas mascota = new RegistroMascotas();
        
        mascota.setNombre("Polo");
        mascota.setEspecie("Perro");
        mascota.setEdad(1);
        
        mascota.mostrarInfo();
        
        int tiempo;
        Scanner input = new Scanner(System.in);
        System.out.print("Cuanto tiempo paso?(anios): ");
        tiempo = Integer.parseInt(input.nextLine()); 
        
        mascota.cumplirAnios(tiempo);
        
        System.out.println("\nInformación actualizada:");
        mascota.mostrarInfo();

        
    }
    
}
