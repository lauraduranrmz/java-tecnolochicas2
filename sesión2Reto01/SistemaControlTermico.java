package sesión2Reto01;

import java.util.concurrent.Callable;
public class SistemaControlTermico implements Callable <String>{

    @Override
    public String call() throws Exception{
        Thread.sleep(800);
        return "Control térmico: temperatura estable (22°C).";
    }

    
}
