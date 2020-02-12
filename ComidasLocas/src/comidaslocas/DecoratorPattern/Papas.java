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
public class Papas extends Decorador{
    Orden orden;
    
    public Papas(Orden orden) 
    {     
        this.orden = orden;   
    }
    
    public String Descripcion() 
    {  
        return orden.Descripcion() + ", Papas de 5.50";   
    }   
    
    @Override
    public double CobroTotal() 
    {     
        return 5.50 + orden.CobroTotal();   
    }
}
