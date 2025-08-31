/*
    1. Registro de Estudiantes
    a. Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación.
    Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos).
    Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir calificaciones.
*/

public class RegistroEstudiantes {
     private String nombre;
     private String apellido;
     private String curso;
     private double calificacion;
    
     
    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para apellido
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Getter y Setter para curso
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Getter y Setter para calificación
    public double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
     
     
     
    
     
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + 
                   "\nApellido: " + apellido +
                   "\nCurso: " + curso +
                   "\nCalificacion: " + calificacion);
    }
    
    public void subirCalificacion(double puntos){
        calificacion += puntos;
        if(calificacion == 10){
        calificacion = 10;
        }
        System.out.println("La nueva calificacion es: " + calificacion);
    }
    
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) {
            calificacion = 0; 
        }
        System.out.println("La calificacion ha bajado. Nueva calificacion: " + calificacion);
    }
}
