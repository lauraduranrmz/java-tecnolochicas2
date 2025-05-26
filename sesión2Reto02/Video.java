package sesión2Reto02;

public class Video extends MaterialCurso{

    private int duracion; // en minutos

    public Video(String titulo, String autor, int duracion){
        super(titulo, autor);
        this.duracion = duracion;
    }

    public int getDuracion(){
        return duracion;
    }

    @Override
    public void mostrarDetalle(){
        System.out.println("Video: "+ titulo + "- Autor: "+autor+ "- Duranción: "+ duracion + "min");
        
    }
    
}
