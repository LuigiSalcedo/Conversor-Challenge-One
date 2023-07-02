package conversor;

import conversor.views.ConversorApp;

/**
 * Clase Main: Ejecución principal.
 * 
 * Clase contenedora del método main, cuya unica función es instanciar la vista
 * principal.
 * 
 * @author Luigi Salcedo
 */
public class Main 
{
    public static void main(String[] args) 
    {
        ConversorApp app = new ConversorApp();
        app.setVisible(true);
    }    
}
