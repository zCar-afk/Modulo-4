package Atividade7;

import java.util.ArrayList;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;
    private ArrayList<String> memoria;  

  
    public Elevador(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;  
        this.pessoasPresentes = 0;  
        this.memoria = new ArrayList<>();  
        this.memoria.add("Elevador inicializado no térreo com capacidade de " + capacidade + " pessoas.");
    }


    public void entra() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            memoria.add("Pessoa entrou no andar " + andarAtual + ". Total de pessoas: " + pessoasPresentes);
        } else {
            System.out.println("Elevador Lotado.");
        }
    }

   
    public void sai() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            memoria.add("Pessoa saiu no andar " + andarAtual + ". Total de pessoas: " + pessoasPresentes);
        } else {
            System.out.println("Não tem ninguém para sair do elevador.");
        }
    }

  
    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            memoria.add("Elevador subiu para o andar " + andarAtual);
        } else {
            System.out.println("Já está no último andar.");
        }
    }


    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
            memoria.add("Elevador desceu para o andar " + andarAtual);
        } else {
            System.out.println("Já está no térreo.");
        }
    }



    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        if (andarAtual >= 0 && andarAtual <= totalAndares) {
            this.andarAtual = andarAtual;
        } else {
            System.out.println("Andar inválido.");
        }
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        if (totalAndares >= 0) {
            this.totalAndares = totalAndares;
        } else {
            System.out.println("Total de andares inválido.");
        }
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if (capacidade > 0) {
            this.capacidade = capacidade;
        } else {
            System.out.println("Capacidade inválida.");
        }
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        if (pessoasPresentes >= 0 && pessoasPresentes <= capacidade) {
            this.pessoasPresentes = pessoasPresentes;
        } else {
            System.out.println("Número de pessoas inválido.");
        }
    }


    public void exibirMemoria() {
        System.out.println("Atividades realizadas pelo elevador:");
        for (String evento : memoria) {
            System.out.println(evento);
        }
    }
}
