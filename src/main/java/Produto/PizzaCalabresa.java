package Produto;

public class PizzaCalabresa extends Pizza {

    public PizzaCalabresa() {
        this.descricao = "Deliciosa pizza de calabresa";
        this.preco = 25;
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
