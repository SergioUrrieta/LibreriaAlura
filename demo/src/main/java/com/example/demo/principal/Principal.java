package com.example.demo.principal;




import com.example.demo.model.DatosLibro;
import com.example.demo.model.DatosRespuesta;
import com.example.demo.service.ConsumoApi;
import com.example.demo.service.ConvierteDatos;

import java.util.Scanner;

public class Principal {

    private static final String URL_BASE = "https://gutendex.com/books/?search=";

    private final Scanner scanner = new Scanner(System.in);
    private final ConsumoApi consumoApi = new ConsumoApi();
    private final ConvierteDatos conversor = new ConvierteDatos();

    public void mostrarMenu() {
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("""
                    
                    ===============================
                    📚 LITERALURA - MENÚ PRINCIPAL
                    ===============================
                    1 - Buscar libro por título
                    0 - Salir
                    ===============================
                    """);

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1 -> buscarLibroPorTitulo();
                    case 0 -> System.out.println("👋 Hasta luego, lector profesional.");
                    default -> System.out.println("⚠️ Opción inválida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ Ingresa un número válido.");
            }
        }
    }

    private void buscarLibroPorTitulo() {
        System.out.println("🔎 Ingresa el título del libro:");
        String titulo = scanner.nextLine();

        String json = consumoApi.obtenerDatos(URL_BASE + titulo.replace(" ", "+"));
        DatosRespuesta respuesta = conversor.convertir(json, DatosRespuesta.class);

        if (respuesta.results().isEmpty()) {
            System.out.println("❌ No se encontró ningún libro.");
            return;
        }

        DatosLibro libro = respuesta.results().get(0);

        System.out.println("""
                
                📖 LIBRO ENCONTRADO
                ---------------------------
                Título: %s
                Idioma: %s
                Descargas: %d
                Autor: %s
                ---------------------------
                """.formatted(
                libro.title(),
                libro.languages().isEmpty() ? "N/A" : libro.languages().get(0),
                libro.numeroDescargas(),
                libro.authors().isEmpty() ? "N/A" : libro.authors().get(0).name()
        ));
    }
}
