
public class GallinaMain {
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina();
        Gallina gallina2 =  new Gallina();
        
        //Lomejor aqui seria crear un constructor en la Clase gallina, pero por le momento lo dejo asi
        /*
           public Gallina(int idGallina, int edad, int huevosPuestos) {
                this.idGallina = idGallina;
                this.edad = edad;
                this.huevosPuestos = huevosPuestos;
            }
        */
        
        gallina1.setIdGallina(1);
        gallina1.setEdad(4);
        gallina1.setHuevosPuestos(20);
        
        gallina2.setIdGallina(2);
        gallina2.setEdad(5);
        gallina2.setHuevosPuestos(15);

        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        System.out.println("----- Simulación -----");
       
        
        gallina1.envejecer(5);
        gallina1.ponerHuevos(6);
        
        gallina2.envejecer(7);
        gallina2.ponerHuevos(3);
        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
    }
}
