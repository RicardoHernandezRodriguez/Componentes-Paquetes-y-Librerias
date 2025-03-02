package iscric.com;



import iscric.com.controller.ventanaController;
import iscric.com.view.ventanaView;

/**
 * Clase principal que inicia la aplicación.
 * 
 * Esta clase crea dos ventanas: una ventana principal y una secundaria.
 * Luego, instancia un controlador para manejar la relación entre ambas ventanas.
 * 
 */
public class Main {
    public static void main(String[] args) {
        // Crear la ventana principal con tamaño inicial 400x600
        ventanaView primaryView = new ventanaView(600, 500, "Primera Ventana");

        // Crear la segunda ventana basada en la primera (ubicada al lado derecho)
        ventanaView secondaryView = new ventanaView("Segunda Ventana", primaryView);

        // Se crea el controlador para manejar eventos de redimensionamiento
        new ventanaController(primaryView, secondaryView);
    }
}
