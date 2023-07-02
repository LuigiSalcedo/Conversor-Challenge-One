package conversor.models;

import conversor.exceptions.CurrencyFormatException;
import conversor.exceptions.CurrencyPriceException;
import conversor.exceptions.IllegalCurrencyException;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Clase Moneda.
 * 
 * Representación de las monedas dentro del programa.
 * 
 * @author Luigi Salcedo
 */
public class Currency implements Convertible
{
    private BigDecimal USDValue;
    private String name;
    private String code;
    
    public Currency(String USDValue, String name, String code) throws IllegalCurrencyException
    {
        USDValue = USDValue.replace(",", ".");
        try
        {
            this.USDValue = new BigDecimal(USDValue);
        }catch(NumberFormatException e){
            throw new CurrencyFormatException("Formato de moneda no valido.");
        }
        if(this.USDValue.floatValue() < 0)
        {
            throw new CurrencyPriceException("Precio de moneda no valido.");
        }
        this.name = name;
        this.code = code;
    }
    
    public String getName() 
    {
        return name;
    }
    
    public String getCode()
    {
        return code;
    }
    
    public String getValue()
    {
        return USDValue.toString();
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setUSDValue(String USDValue)
    {
        this.USDValue = new BigDecimal(USDValue);
    }
    
    @Override
    public String toString()
    {
        return code + " - " + name;
    }
    
    @Override
    public BigDecimal toUSD(float amout)
    {
        return new BigDecimal(String.valueOf(amout)).divide(USDValue, 4, RoundingMode.HALF_UP);
    }
    
    @Override
    public BigDecimal fromUSD(float amout)
    {
        return USDValue.multiply(new BigDecimal(String.valueOf(amout)));
    }
    
    /**
     * Método de Moneda convertir entre dos monedas.
     * 
     * Este método convierte de una moneda a otra utilizando su precio de dolar de por medio.
     * 
     * @param currency objeto contenedor de la otra moneda.
     * @param amout cantidad de la otra moneda.
     * @return conversión final.
     */
    public BigDecimal exchangeFrom(Currency currency, float amout)
    {
        BigDecimal currencyToUSD = currency.toUSD(amout);
        return this.fromUSD(currencyToUSD.floatValue());
    }
    
    /**
     * Método convierte la información de una moneda a String para ser escrita
     * dentro del archivo para ser almacenado.
     * 
     * @return información formateada para guardar en archivo.
     */
    public String toData()
    {
        return USDValue.toString() + ";" + name + ";" + code;
    }
    
    /**
     * Método para obtener instancias de monedas a partir de la información
     * formateada para ser guardada en un archivo.
     * 
     * @param str String con la informació del archivo.
     * @return instancia de moneda.
     */
    public static Currency parse(String str)
    {
        try
        {
            String [] data = str.split(";");
            return new Currency(data[0], data[1], data[2]);
        }
        catch(IllegalCurrencyException e)
        {
            return null;
        }
    }
    
}
