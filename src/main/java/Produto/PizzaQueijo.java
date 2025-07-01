package Produto;

public class PizzaQueijo extends Pizza {

    public PizzaQueijo() {
        this.descricao = "Deliciosa pizza de queijo";
        this.preco = 22;
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
