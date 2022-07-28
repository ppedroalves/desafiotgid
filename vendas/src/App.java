import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import model.ItemVenda;
import model.Produto;
import model.Usuario;
import model.Venda;



public class App {
    public static void main(String[] args) throws Exception {
       Usuario usuario1 = new Usuario("Garcia", "11144455566", "garcia@mail.com");
       Usuario usuario2 = new Usuario("Fernandes", "66644433312", "fernandes@mail.com");
       Usuario usuario3 = new Usuario("Miguel", "14467895432", "miguel@mail.com");

       Produto produto1 = new Produto("Computador",   1500.0);
       Produto produto2 = new Produto("Mouse",  35.0);
       Produto produto3 = new Produto("Teclado",  45.50);
       Produto produto4 = new Produto("Cadeira",   2000.0);
       List<Produto> produtos = Arrays.asList(produto1, produto2, produto3, produto4);

       Venda venda = new Venda(usuario1, Arrays.asList(
         new ItemVenda(produto1, 1),
         new ItemVenda(produto3,  1)
       ));

       Venda venda1 = new Venda(usuario2, Arrays.asList(
        new ItemVenda(produto1, 2),
        new ItemVenda(produto2,  1),
        new ItemVenda(produto3,  2),
        new ItemVenda(produto4,  1)
      ));

      Venda venda2 = new Venda(usuario3, Arrays.asList(
        new ItemVenda(produto2, 1),
        new ItemVenda(produto3,  1)
      ));
      List<Venda> vendas = Arrays.asList(venda, venda1, venda2);




      int escolha = menu();
      do{
        switch(escolha){
          case 1:
            vendas.stream()
            .forEach(v -> v.fecharVenda());
             escolha = menu();
            break;
          case 2:
            produtos.stream()
            .forEach(System.out::print);
            escolha = menu();
            break;
        }
      }while(escolha != 0);
      

        
    }

    private static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nO que voce deseja fazer?");
        System.out.println("1 - Relatorio de vendas");
        System.out.println("2 - Mostrar produtos");
        System.out.println("0 -Sair");
        int escolha = sc.nextInt();
        return escolha;
    }


}
