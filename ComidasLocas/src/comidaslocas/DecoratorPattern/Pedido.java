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
public class Pedido extends Orden{
    
    public Pedido() 
    {     
        description = "Su pedido es: \n";    
    }   
    
    @Override
    public double CobroTotal()
    {     
        return 0.0;   
    }
}
