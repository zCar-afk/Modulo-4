package Atividade6;

import java.util.ArrayList;


public class Filtragem {

    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<>();

        palavras.add("Ney");
        palavras.add("vini");
        palavras.add("bape");
        palavras.add("O Atual");
        palavras.add("Campeao");
        palavras.add("Libertadores");
        palavras.add("fluminense");
        palavras.add("mar");
        palavras.add("cris");
        palavras.add("messi");


        try {

            ArrayList<String> palavrasFiltradas = filtrarPalavras(palavras);


            System.out.println("Palavras com mais de 5 caracteres:");
            for (String palavra : palavrasFiltradas) {
                System.out.println(palavra);
            }

        } catch (NoMatchingElementsException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }


    public static ArrayList<String> filtrarPalavras(ArrayList<String> palavras) throws NoMatchingElementsException {
        ArrayList<String> palavrasFiltradas = new ArrayList<>();
        for (String palavra : palavras) {
            if (palavra.length() > 5) {
                palavrasFiltradas.add(palavra);
            }
        }

        if (palavrasFiltradas.isEmpty()) {
            throw new NoMatchingElementsException("Nenhuma palavra com mais de 5 caracteres encontrada.");
        }

        return palavrasFiltradas;
    }
}

class NoMatchingElementsException extends Exception {
    public NoMatchingElementsException(String message) {
        super(message);
    }
}