
package Produto;


public class BordaReiqueijao extends AcrescimoDecorator{

private double valorBorda = 8.5;

public BordaReiqueijao(Pizza pizza){
    this.pizza = pizza;
}
    
@Override
public String getDescricao(){
    return this.pizza.getDescricao()+"Borda recheada de reiqueijao";
}

@Override 
public double getPreco(){
    return this.pizza.getPreco()+valorBorda;
}
    
}
