package Produto;

public abstract class AcrescimoDecorator extends Pizza {

    protected Pizza pizza;

    @Override
    public abstract String getDescricao();

    @Override
    public abstract double getPreco();

}
