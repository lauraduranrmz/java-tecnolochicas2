package sesión3Reto02;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Sucursal> sucursales = List.of(
            new Sucursal("Centro", List.of(
                new Encuesta("Laura", "El tiempo de espera fue largo", 2),
            new Encuesta ("Carolina", null, 5)
            )),
              new Sucursal("Norte", List.of(
                        new Encuesta("Oscar", "La atención fue buena, pero la limpieza puede mejorar", 3),
                        new Encuesta("Raul", null, 4)
                )),
                new Sucursal("Sur", List.of(
                        new Encuesta("Eduardo", null, 2),
                        new Encuesta("Iris", "No encontré el medicamento que necesitaba", 1)
                ))
        );
        sucursales.stream()
            .flatMap(sucursal -> 
                sucursal.getEncuestas().stream()
                    .filter(encuesta -> encuesta.getCalificacion() <= 3)
                    .flatMap(encuesta -> 
                        encuesta.getComentario()
                            .map(comentario -> 
                                "Sucursal " + sucursal.getNombre() +
                                ": Seguimiento a paciente con comentario: \"" + comentario + "\""
                            )
                            .stream()
                    )
            )
            .forEach(System.out::println);
    }
}
