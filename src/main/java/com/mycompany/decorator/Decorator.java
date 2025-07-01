
package com.mycompany.decorator;

import Produto.BordaReiqueijao;
import Produto.MassaIntergral;
import Produto.Pizza;
import Produto.PizzaQueijo;


public class Decorator {

    public static void main(String[] args) {
        System.out.println("Criar uma pizza de queijo");
        Pizza pizzaQueijo = new PizzaQueijo();
        System.out.println("Produto -->" +pizzaQueijo.getDescricao()+
                "Valor R$"+pizzaQueijo.getPreco());
        
        System.out.println("");
        System.out.println("Adicionar borda de reiquijao");
        Pizza pizzaQueijoBorda = new BordaReiqueijao(pizzaQueijo);
        System.out.println("Produto -->"+pizzaQueijoBorda.getDescricao()+
                "valor R$"+pizzaQueijoBorda.getPreco());
        
        System.out.println("");
        System.out.println("Adiciona Massa Integral");
        Pizza pizzaQueijoBordaMassaIntegral = new MassaIntergral(pizzaQueijoBorda);
        System.out.println("Produto -->"+pizzaQueijoBordaMassaIntegral.getDescricao()+
                "valor R$"+pizzaQueijoBordaMassaIntegral.getPreco());
        
    }
}
