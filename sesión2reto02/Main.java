package sesión2reto02;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando acceso a la sala de cirugía...");

        RecursoMedico salaCirugia = new RecursoMedico("Sala de cirugía");

        //Crear tareas para varios profesionales
        Runnable draSanchez = new TareaProfesional(	"Dra. Sanchez", salaCirugia);
        Runnable drGomez = new TareaProfesional("Dr. Gómez", salaCirugia);
        Runnable drLopez = new TareaProfesional("Dr. López", salaCirugia);
        Runnable drRamirez = new TareaProfesional("Dr. Ramírez", salaCirugia);
        Runnable draCastro = new TareaProfesional("Dra. Castro", salaCirugia);

        ExecutorService executor = Executors.newFixedThreadPool(4);

        //Ejecutar las tareas
        executor.execute(draSanchez);
        executor.execute(drGomez);
        executor.execute(drLopez);
        executor.execute(drRamirez);
        executor.execute(draCastro);

        executor.shutdown();
    }
    
}
