package aplicacao;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        System.out.print("Entre com o número de produtos: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("Product #"+(i+1) +" dados: ");

            System.out.print("Comum, usado ou importado (C/U/I): ");
            char tipoProduto = sc.next().charAt(0);

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            if(tipoProduto == 'C'){
                produtos.add(new Produto(nome,preco));
            } else if (tipoProduto == 'U') {
                System.out.print("Data de fabricação (DD/MM/YYYY): ");
                LocalDate dataDeFabricacao = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                produtos.add(new ProdutoUsado(nome,preco,dataDeFabricacao));
            } else if (tipoProduto == 'I') {
                System.out.print("Valor do frete: ");
                double frete = sc.nextDouble();
                produtos.add(new ProdutoImportado(nome,preco,frete));
            }

        }

        System.out.println("ETIQUETAS:");
        for (Produto p: produtos){
            System.out.println(p.etiqueta());
        }
    }
}
