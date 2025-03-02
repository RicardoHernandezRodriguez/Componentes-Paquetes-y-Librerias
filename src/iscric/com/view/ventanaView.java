package iscric.com.view;

import javax.swing.*;
import utilidad.window;

/**
 * Clase que representa una ventana en la interfaz gráfica.
 * 
 * Extiende JFrame y permite la creación de múltiples ventanas con distintos constructores.
 * Además, contiene métodos que permiten crear una ventana secundaria relacionada con la ventana principal.
 */
public class ventanaView extends JFrame {
    
    // Atributos para almacenar las dimensiones y la posición de la ventana
    private int alto, largo, x, y;

    /**
     * Constructor para la ventana principal.
     * Crea una ventana con el tamaño y título proporcionados y la centra en la pantalla.
     * 
     * @param alto Altura de la ventana.
     * @param largo Ancho de la ventana.
     * @param titulo Título de la ventana.
     */
    public ventanaView(int alto, int largo, String titulo) {
        this.setSize(largo, alto);  // Establecer el tamaño de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Cerrar la aplicación al cerrar la ventana
        this.setTitle(titulo);  // Establecer el título de la ventana
        this.setLocationRelativeTo(null);  // Centrar la ventana en la pantalla
        this.setVisible(true);  // Hacer la ventana visible
        
        // Guardar las dimensiones y posición de la ventana
        this.alto = this.getHeight();
        this.largo = this.getWidth();
        this.x = this.getX();
        this.y = this.getY();
    }
    
    /**
     * Constructor para la creación de una ventana secundaria.
     * La nueva ventana se posiciona automáticamente a la derecha de la ventana principal.
     * 
     * @param titulo Título de la ventana secundaria.
     * @param primaryView Referencia a la ventana principal.
     */
    public ventanaView(String titulo, ventanaView primaryView) {
        // Calcular la nueva posición para la ventana secundaria
        int newX = primaryView.getX() + primaryView.getWidth();  // Posicionar a la derecha de la ventana principal
        int newY = primaryView.getY();  // Mantener la misma altura
        int height = primaryView.getHeight();  // Mantener la misma altura

        // Crear la ventana secundaria utilizando la clase `window`
        window ventanaSecundaria = new window(titulo, newX, newY, height);
        ventanaSecundaria.loadComponets();  // Cargar los componentes de la nueva ventana
    }
}
