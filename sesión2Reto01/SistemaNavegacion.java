package sesión2Reto01;

import java.util.concurrent.Callable;

public class SistemaNavegacion implements Callable<String>{
    @Override
    public String call() throws Exception{
        Thread.sleep(1200); //simula procesamiento
        return "Navegación: trayectoria corregida con éxito. ";
    }

    
}
