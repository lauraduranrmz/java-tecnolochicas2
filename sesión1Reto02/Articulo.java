package sesión2Reto02;

public class Articulo extends MaterialCurso{
    private int palabras;

    public Articulo(String titulo, String autor, int palabras){
        super(titulo, autor);
        this.palabras = palabras;
    }

    @Override
    public void mostrarDetalle(){
        System.out.println("Artículo: "+ titulo + " - Autor: "+ autor + " - Palabras: " + palabras);
        
    }
    
}
