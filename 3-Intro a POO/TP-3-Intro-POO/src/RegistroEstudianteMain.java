
public class RegistroEstudianteMain {

    public static void main(String[] args) {
        RegistroEstudiantes alum = new RegistroEstudiantes();
        
        alum.setNombre("Mauro");
        alum.setApellido("Zavatti");
        alum.setCurso("Programacion");
        alum.setCalificacion(7.5);
        
        alum.mostrarInfo();
        
        alum.subirCalificacion(1.5);
        
        alum.bajarCalificacion(3);
        
        System.out.println("\nInformacion final del estudiante:");
        alum.mostrarInfo();
        
    }
    
}
