/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comidaslocas;


import StrategyPattern.Strategy;
import comidaslocas.DecoratorPattern.*;



/**
 *
 * @author Jorge
 */
public class ComidasLocas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * orden con descuento
         */
        Orden ordenFinal = new Pedido();  
        ordenFinal = new Hamburgesa(ordenFinal);
        ordenFinal = new Papas(ordenFinal);
        ordenFinal = new Soda(ordenFinal);
        System.out.println(Strategy.CalcularCobro(ordenFinal));     
        
        /**
         * orden sin descuento
         */
        ordenFinal = new Pedido();  
        ordenFinal = new Hamburgesa(ordenFinal);
        ordenFinal = new Papas(ordenFinal);
        //ordenFinal = new Soda(ordenFinal);
        System.out.println(Strategy.CalcularCobro(ordenFinal));    
    }
    
}
