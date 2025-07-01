package Produto;

public class PizzaFrango extends Pizza {

    public PizzaFrango() {
        this.descricao = "Deliciosa pizza de frango";
        this.preco = 19;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }
}
