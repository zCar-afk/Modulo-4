package Lista;

import java.util.ArrayList;
import java.util.Random;

public class Atividade1 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
	Random NumerosAleatorios = new Random();
	for (int i = 0; i < 10; i++) {
        numeros.add(NumerosAleatorios.nextInt(100));
    }
	
	System.out.println("Números Aleatorios:" + "\n" + numeros);
	if (numeros.size() >= 3) {
        numeros.remove(2);
        System.out.println("\nNúmeros Aleatórios  sem o terceiro elemento:" + "\n" + numeros);
  
	}
	numeros.add(0,NumerosAleatorios.nextInt(100));
    System.out.println("\nNúmeros Aleatórios com novo número Adicionado" + "\n" + numeros);
	
	 int Verificando = 7;
     if (numeros.contains(Verificando)) {
         System.out.println("\nO número " + Verificando + " está presente na Lista");
     } else {
         System.out.println("\nO número " + Verificando + " não está presente na Lista.");
     }
	
}
}