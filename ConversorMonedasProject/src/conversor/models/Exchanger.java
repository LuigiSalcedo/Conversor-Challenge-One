package conversor.models;

import conversor.exceptions.IllegalCurrencyException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Luigi Salcedo
 */
public class Exchanger 
{
    private HashMap<String, Currency> currencies;
    private static Exchanger exchanger;
    
    private Exchanger(){
        currencies = new HashMap<>();
    }
    
    public HashMap<String, Currency> getCurrencies()
    {
        return currencies;
    }
    
    /**
     * Método para obtención de la instancia del Exchanger.
     * 
     * Este método sirve para obtener la misma instancia con los datos utilizando
     * el patrón Singletton.
     * 
     * @return la instancia del conversor.
     */
    public static Exchanger getInstance()
    {
        if(exchanger == null)
        {
            exchanger = new Exchanger();
            try
            {
                ArrayList<Currency> list = new ArrayList();
                list.add(new Currency("4168", "Peso Colombiano", "COP"));
                list.add(new Currency("1", "Dólar", "USD"));
                list.add(new Currency("0.92", "Euro", "EUR"));
                list.add(new Currency("0.79", "Libra", "GBP"));
                list.add(new Currency("144.3", "Yen", "YEN"));
                list.add(new Currency("1316.3", "Won", "WON"));
                list.forEach(currency -> exchanger.currencies.put(currency.getCode(), currency));
            }
            catch(IllegalCurrencyException e)
            {
                System.exit(0);
            }
        }
        return exchanger;
    }
}
