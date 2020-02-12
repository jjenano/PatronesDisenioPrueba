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
public class Soda extends Decorador{
    Orden orden;
    
    public Soda(Orden orden) 
    {     
        this.orden = orden;   
    }
    
    public String Descripcion() 
    {  
        return orden.Descripcion() + ", Soda de 3.50";   
    }   
    
    @Override
    public double CobroTotal() 
    {     
        return 3.50 + orden.CobroTotal();   
    }
}
