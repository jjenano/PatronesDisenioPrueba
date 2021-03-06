/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comidaslocas.DecoratorPattern;

/**
 *
 * @author Jorge
 */
public class Hamburgesa extends Decorador{
    Orden orden;
    
    public Hamburgesa(Orden orden) 
    {     
        this.orden = orden;   
    }
    
    public String Descripcion() 
    {  
        return orden.Descripcion() + ", Hamburgesa de 10.0";   
    }   
    
    @Override
    public double CobroTotal() 
    {     
        return 10.0 + orden.CobroTotal();   
    }
}
