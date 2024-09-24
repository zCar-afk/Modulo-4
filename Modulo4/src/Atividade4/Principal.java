package Atividade4;
import java.util.ArrayList;
public class Principal {

	public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Tablet", 2500.00));
        produtos.add(new Produto("Notebook", 3000.00));
        produtos.add(new Produto("Computador", 15000.00));
        produtos.add(new Produto("Televisão", 4300.00));
        produtos.add(new Produto("Rádio", 800.00));

        try {
            String MaisCaro = encontrarProdutoMaisCaro(produtos);
            System.out.println("Produto mais caro: " + MaisCaro);
        } catch (Exception e) {
            System.out.println("Não Há");
        }
    }

    public static String encontrarProdutoMaisCaro(ArrayList<Produto> produtos) throws Exception {
        if (produtos.isEmpty()) {
            throw new Exception("Erro: A lista de produtos está vazia.");
        }

        Produto MaisCaro = produtos.get(0);


        for (Produto produto : produtos) {
            if (produto.getPreco() > MaisCaro.getPreco()) {
                MaisCaro = produto;
            }
        }

        return MaisCaro.getNome();
    }
}