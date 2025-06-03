package panaderia;

import java.util.concurrent.Callable;

public class Panadero implements Callable<Void>{
//void con mayuscula

@Override
public Void call(){

    try{
         //cada panadero va a calcular cuántos panes puede hacer
int cantidad = (int) (Math.random()* 5) +1; //1-5

    System.out.println("👩‍🍳 puede hacer "+ cantidad+ " panes");

    for(int i =1; i<= cantidad; i++){

        //calculando un indice aleatorio del arreglo catalogo (0 - tamaño del arreglo)
        int indice = (int) (Math.random() * Panaderia.catalogo.length);

        String pan = Panaderia.catalogo[indice]; // cocinando un pan

        //duerme x milisegundos al hilo de ejecución
        Thread.sleep(0);

        //depositamos el pan en la canasta de la panaderia

        Panaderia.canasta.add(pan);
    }

    }catch (InterruptedException ex){

    }
    //cada panadero va a calcular cuántos panes puede hacer
    
    return null;
}
    
    
}
