package sesión2;

public class MiPrimerHilo extends Thread{

    //Lo que sea que esté en el método run()
    //se ejecutará de manera concurrente

    @Override //-->sobreescribiendo el comportamiento del metodo 
    public void run(){
        for(int i=0; i<1000; i++){
            System.out.println("=>"+ i);
        }
    }
    
}
