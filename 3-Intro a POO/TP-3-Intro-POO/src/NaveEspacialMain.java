
public class NaveEspacialMain {
      public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        
        nave.setNombre("Endurance");
        nave.setCombustible(50);
        
        nave.mostrarEstado();
        
        nave.avanzar(30);
        nave.recargarCombustible(40);
        nave.avanzar(30); 
        nave.mostrarEstado();  
    }
        
}
