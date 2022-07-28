package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Usuario usuario;
    private LocalDate dataVenda;
    private List<ItemVenda> itens = new ArrayList<>();

    public Venda(){

    }

    public Venda(Usuario usuario, List<ItemVenda> itens) {
        this.usuario = usuario;
        this.dataVenda = LocalDate.now();
        this.itens = itens;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public LocalDate getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }
    public List<ItemVenda> getItens() {
        return itens;
    }
    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    public void fecharVenda(){
        Double total = totalizar();
        atualizarEstoque();
        System.out.println("==============================================");
        System.out.println("Compra feita por " + this.usuario.getNome() + " no dia " + this.dataVenda);
        this.itens.stream()
                    .map(item -> "\n\nItem: " + item.getProduto().getDescricao() + ", valor: " + item.getProduto().getValorCompra() + ", quantidade: " + item.getQuantidade()
                    )
                    .forEach(System.out::println);
        System.out.println("\n\n O valor da compra ficou em R$" + total);
    }

    private void atualizarEstoque() {
        for(ItemVenda item : itens){
            Integer novoEstoque = item.getProduto().getQuantidadeEstoque() - item.getQuantidade();
            item.getProduto().setQuantidadeEstoque(novoEstoque);
        }
    }


    public Double totalizar(){
        return itens.stream()
             .map(item -> item.getProduto().getValorCompra() * item.getQuantidade())
             .reduce(0.0,(ac, n) -> ac + n);

    }


    



    
}
