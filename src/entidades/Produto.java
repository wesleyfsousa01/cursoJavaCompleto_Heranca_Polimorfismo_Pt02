package entidades;

public class Produto {
    private String nome;
    private Double preco;

    public Produto(String name, Double preco) {
        this.nome = name;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String etiqueta(){
        return getNome() + getPreco();
    }

    @Override
    public String toString() {
        return getNome() +" $"+getPreco();
    }
}
