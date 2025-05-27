package sesión2Reto01;

import java.util.concurrent.Callable;

public class SistemaComunicaciones  implements Callable<String>{
    @Override
    public String call() throws Exception{
        Thread.sleep(500);
        return "Comunicaciones: enlace con estación terrestre establecido.";
    }
    
}
