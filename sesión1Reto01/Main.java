package sesión1Reto01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void mostrarOrdenes(List<? extends OrdenProduccion> lista) {
        for (OrdenProduccion orden : lista) {
            orden.mostrarResumen();
        }
    }

    public static void procesarPersonalizadas(List<? super OrdenPersonalizada> lista, int costoAdicional) {
        System.out.println("\n Procesando órdenes personalizadas...");
        for (Object obj : lista) {
            if (obj instanceof OrdenPersonalizada) {
                ((OrdenPersonalizada) obj).aplicarCostoAdicional(costoAdicional);
            }
        }
    }

    public static void contarOrdenes(List<OrdenProduccion> todas) {
        int masa = 0, personalizadas = 0, prototipos = 0;
        for (OrdenProduccion orden : todas) {
            if (orden instanceof OrdenMasa) masa++;
            else if (orden instanceof OrdenPersonalizada) personalizadas++;
            else if (orden instanceof OrdenPrototipo) prototipos++;
        }

        System.out.println("\n Resumen total de órdenes:");
        System.out.println("Producción en masa: " + masa);
        System.out.println("Personalizadas: " + personalizadas);
        System.out.println(" Prototipos: " + prototipos);
    }

    public static void main(String[] args) {
        List<OrdenMasa> ordenesMasa = Arrays.asList(
            new OrdenMasa("A123", 500),
            new OrdenMasa("A124", 750)
        );

        List<OrdenPersonalizada> ordenesPersonalizadas = Arrays.asList(
            new OrdenPersonalizada("P456", 100, "ClienteX"),
            new OrdenPersonalizada("P789", 150, "ClienteY")
        );

        List<OrdenPrototipo> ordenesPrototipo = Arrays.asList(
            new OrdenPrototipo("T789", 10, "Diseño"),
            new OrdenPrototipo("T790", 5, "Pruebas")
        );

        System.out.println("Órdenes registradas:");
        mostrarOrdenes(ordenesMasa);

        System.out.println("\nÓrdenes registradas:");
        mostrarOrdenes(ordenesPersonalizadas);

        System.out.println("\nÓrdenes registradas:");
        mostrarOrdenes(ordenesPrototipo);

        procesarPersonalizadas(new ArrayList<>(ordenesPersonalizadas), 200);

        List<OrdenProduccion> todas = new ArrayList<>();
        todas.addAll(ordenesMasa);
        todas.addAll(ordenesPersonalizadas);
        todas.addAll(ordenesPrototipo);

        contarOrdenes(todas);
    }
}
