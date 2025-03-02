package iscric.com.controller;

import iscric.com.view.ventanaView;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/**
 * Controlador que gestiona la relación entre dos ventanas.
 * Este controlador se encarga de actualizar el tamaño de la ventana principal 
 * cada vez que la ventana secundaria cambia su tamaño.
 */
public class ventanaController {
    private ventanaView secondaryView;  // Ventana secundaria

    /**
     * Constructor del controlador.
     * Vincula la ventana secundaria con la principal para que 
     * la ventana principal se ajuste dinámicamente al tamaño de la ventana secundaria.
     *
     * @param primaryView   Referencia a la ventana principal.
     * @param secondaryView Referencia a la ventana secundaria.
     */
    public ventanaController(ventanaView primaryView, ventanaView secondaryView) {
        this.secondaryView = secondaryView;

        // Agregar un evento para actualizar el tamaño de la ventana principal cuando la secundaria cambie de tamaño
        this.secondaryView.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                // Ajusta la ventana principal al tamaño de la ventana secundaria
                primaryView.setSize(secondaryView.getWidth(), secondaryView.getHeight());
            }
        });
    }
}
