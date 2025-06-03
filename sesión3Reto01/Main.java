package sesión3Reto01;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        List<Pedido> pedidos = Arrays.asList(
            new Pedido("Juan", "domicilio", "555-1234"),
            new Pedido("Ana", "local", "555-9999"),
            new Pedido("Luis", "domicilio", null),
            new Pedido("María", "domicilio", "555-5678")

            );

            pedidos.stream()
            .filter(p -> "domicilio".equalsIgnoreCase(p.tipoEntrega()))
            .map(Pedido::getTelefono)
            .filter(Optional::isPresent) // solo los que tienen número
            .map(Optional::get) // obtener el número directamente
            .map(tel -> "Confirmación enviada al número: " + tel)
            .forEach(System.out::println);
    }
    
}
