package Produto;

public class MassaIntergral extends AcrescimoDecorator {

    private double valorMassaIntergral = 5;

    public MassaIntergral(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescricao() {
        return this.pizza.getDescricao() + "Massa Intergral";

    }

    @Override
    public double getPreco() {
        return this.pizza.getPreco() + valorMassaIntergral;
    }
}
