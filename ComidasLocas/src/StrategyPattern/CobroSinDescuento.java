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
public class CobroSinDescuento extends Strategy{
    Orden orden;
    
    public CobroSinDescuento(Orden orden) 
    {     
        this.orden = orden;   
    }
    
    public String Descripcion() 
    {  
        return " \n El cobro se realizara sin descuento \n" + orden.Descripcion() ;   
    }   
    
    @Override
    public double CobroTotal() 
    {     
        return orden.CobroTotal();   
    }
}
