package conversor.models;

import java.math.BigDecimal;

/**
 * Interface Moneda: Representación del comportamiento de moneda.
 * 
 * Esta interfaz representa los comportamiento de moneda con respecto al USD,
 * toda moneda podrá convertirse a USD y convertir de USD a si misma, así misma.
 * 
 * @author Luigi Salcedo
 */
public interface Convertible 
{
    /**
     * Método de comportamiento de moneda.
     * 
     * Este método convierte la moneda que lo invoque en USD
     * 
     * @param amount cantidad esta moneda a convertir a USD
     * @return valor de la moneda en dolares estado unidenses
     */
    public BigDecimal toUSD(float amount);
    
    /**
     * Método de comporamiento de moneda.
     * 
     * Este método convierte de USD a la moneda que lo invoque
     * 
     * @param amount cantidad de USD para convertir a esta moneda
     * @return el valor de la moneda que lo invoque 
     */
    public BigDecimal fromUSD(float amount);
}
