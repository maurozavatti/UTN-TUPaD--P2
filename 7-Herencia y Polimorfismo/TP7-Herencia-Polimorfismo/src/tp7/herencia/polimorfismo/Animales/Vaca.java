package tp7.herencia.polimorfismo.Animales;

public class Vaca extends Animal {

    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Muuuuu.");
    }
}
