/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern;

import comidaslocas.DecoratorPattern.Orden;

/**
 *
 * @author Jorge
 */
public abstract class Strategy extends Orden{
    public abstract String Descripcion();  
    public abstract double CobroTotal();
    private Orden orden;
       
    public static String CalcularCobro (Orden orden)
    {
        Strategy calculadora = ((orden.CobroTotal() < 19.0) ? new CobroSinDescuento(orden) : new CobroDescuento(orden));
        return calculadora.Descripcion() + " $ " + calculadora.CobroTotal();
    }
}
