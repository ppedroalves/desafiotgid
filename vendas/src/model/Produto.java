package model;



public class Produto {
    
    private String descricao;
    private Double valorCompra;

    


    public Produto(String descricao, Double valorCompra) {
        this.descricao = descricao;

        this.valorCompra = valorCompra;
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
        return "Produto: \n Descricao=" + descricao + ", valorCompra="
                + valorCompra + "\n\n";
    }

    

}
