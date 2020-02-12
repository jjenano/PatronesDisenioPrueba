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
public abstract class Decorador extends Orden {
    public abstract String Descripcion();  
    public abstract double CobroTotal();
}
