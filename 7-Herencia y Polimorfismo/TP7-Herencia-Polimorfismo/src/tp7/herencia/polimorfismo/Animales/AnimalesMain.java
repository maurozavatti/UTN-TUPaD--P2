package tp7.herencia.polimorfismo.Animales;

import java.util.ArrayList;

public class AnimalesMain {
    public static void main(String[] args) {

        // Lista de animales
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Michi"));
        animales.add(new Vaca("Lola"));

        // Mostrar comportamiento con polimorfismo
        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();

            // Clasificación usando instanceof
            if (a instanceof Perro) {
                System.out.println("→ Es un perro.\n");
            } else if (a instanceof Gato) {
                System.out.println("→ Es un gato.\n");
            } else if (a instanceof Vaca) {
                System.out.println("→ Es una vaca.\n");
            }
        }
    }
}
