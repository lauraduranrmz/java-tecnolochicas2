package sesión2reto02;

public class TareaProfesional implements Runnable{
    private String nombreProfesional;
    private RecursoMedico recurso;

    public TareaProfesional(String nombreProfesional, RecursoMedico recurso){
        this.nombreProfesional = nombreProfesional;
        this.recurso = recurso;
    }

    @Override
    public void run(){
        recurso.usar(nombreProfesional);
    }
    
}
