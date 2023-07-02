package conversor.exceptions;

/**
 * Clase de Excepción IllegalCurrencyExcepcion.
 * 
 * Clase represetación de exepción respecto a las monedas creadas.
 * 
 * @author Luigi Salcedo
 */
public class IllegalCurrencyException extends Exception
{
    public IllegalCurrencyException(String message) 
    {
        super("Error de moneda: " + message);
    }
}
