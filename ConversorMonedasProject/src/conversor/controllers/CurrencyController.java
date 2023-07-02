package conversor.controllers;

import conversor.exceptions.IllegalCurrencyException;
import conversor.models.Currency;
import conversor.models.Exchanger;
import javax.swing.JOptionPane;

/**
 * Clase Controldora de Currency.
 * 
 * Esta clase contiene los procesos relacionados con las monedas.
 * 
 * @author Luigi Salcedo
 */
public class CurrencyController 
{
    public static boolean addCurrency(String value, String name, String code)
    {
        code = code.toUpperCase();
        if(existCurrency(code)){
            JOptionPane.showMessageDialog(null, 
                    "Ya se encuentra registrada una moneda con el código: " + code,
                    "Error en la creación de la moneda.",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        Currency currency;
        try{
            currency = new Currency(value, name, code);
        }catch(IllegalCurrencyException e){
            JOptionPane.showMessageDialog(null,
                    "Error: " + e.getMessage(),
                    "Error al crear la moneda",
                    JOptionPane.ERROR_MESSAGE
                    );
            return false;
        }
        Exchanger.getInstance().getCurrencies().put(currency.getCode(), currency);
        JOptionPane.showMessageDialog(null, "Moneda creada correctamente.");
        return true;
    }
    
    public static Currency searchCurrency(String code)
    {
        return Exchanger.getInstance().getCurrencies().get(code);
    }
    
    public static boolean existCurrency(String code)
    {
        return searchCurrency(code) != null;
    }
    
    public static boolean modifyCurrency(String value, String name, String code)
    {
        if(value.startsWith("-") || name.isEmpty() || code.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Alguno de los datos no entrada no son valido.", 
                    "Error con los datos de entrada.",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        Currency currency = searchCurrency(code);
        try{
            currency.setUSDValue(value);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, 
                    "El formato del valor no es valido",
                    "Error de formato",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        currency.setName(name);
        JOptionPane.showMessageDialog(null, "Moneda modificado correctamente.");
        return true;
    }
    
    public static String Convert(String originCode, String destineCode, float originAmout)
    {
        Currency origin = searchCurrency(originCode);
        Currency destine = searchCurrency(destineCode);
        
        return destine.exchangeFrom(origin, originAmout).toString();
    }
}
