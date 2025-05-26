package sesión2;
//en este caso, la clase main funciona como el hilo principal

public class Main {
    public static void main(String[] args) {

        //si heredamos de Thread
        MiPrimerHilo primerHilo = new MiPrimerHilo();

        //si usamos runnable 
        MiSegundoHilo segundoHiloRunnable = new MiSegundoHilo();
        Thread segundoHilo = new Thread(segundoHiloRunnable);
        primerHilo.start();
        segundoHilo.start();
    }
    
}
