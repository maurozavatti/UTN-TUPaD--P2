/*
    2. Registro de Mascotas
    a. Crear una clase Mascota con los atributos: nombre, especie, edad.
    Métodos requeridos: mostrarInfo(), cumplirAnios().
    Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y verificar los cambios.
 */
public class RegistroMascotas {
    private String nombre;
    private String especie;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + 
                   "\nEspecie: " + especie +
                   "\nEdad: " + edad 
                   );
    }
    
    public void cumplirAnios(int tiempo){
        edad += tiempo;
        System.out.println(nombre + " cumplió " + tiempo + " años.");
    }
    
}
