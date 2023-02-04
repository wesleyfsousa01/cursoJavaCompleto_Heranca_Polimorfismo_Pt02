package entidades;

public class ProdutoImportado extends Produto{
    private Double valorFrete;

    public ProdutoImportado(String name, Double preco, Double valorFrete) {
        super(name, preco);
        this.valorFrete = valorFrete;
    }

    public Double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(Double valorFrete) {
        this.valorFrete = valorFrete;
    }

    @Override
    public String etiqueta() {
        return getNome() +" $"+ getPreco() +" (Valor do frete: $" +getValorFrete() +")";
    }
}
