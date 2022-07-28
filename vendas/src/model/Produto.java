package model;



public class Produto {
    
    private String descricao;
    private Double valorCompra;
    private Integer quantidadeEstoque;



    public Produto(String descricao, Double valorCompra) {
        this.descricao = descricao;
        this.valorCompra = valorCompra;
        this.quantidadeEstoque = 10;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
   
    public Double getValorCompra() {
        return valorCompra;
    }
    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    @Override
    public String toString() {
        return "\n\nProduto{" +
                "descricao='" + descricao + '\'' +
                ", valorCompra=" + valorCompra +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }
}
