package Lista;

import java.util.ArrayList;
import java.util.Iterator;

public class Atividade3 {

	public static void main(String[] args) {
ArrayList<Integer> numeros = new ArrayList<>();
        
numeros.add(1);
numeros.add(1);
numeros.add(8);
numeros.add(10);
numeros.add(11);
numeros.add(12);
numeros.add(12);
numeros.add(16);
numeros.add(17);
numeros.add(20);
numeros.add(20); 
numeros.add(3); 
numeros.add(5); 
numeros.add(2); 
numeros.add(12);
numeros.add(14);
        

        System.out.println("Numeros: ");
        System.out.println(numeros);
        

        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            if (numero % 2 == 0) {
                iterator.remove();
            }
            
        }
        System.out.println("Números após remoção dos pares: " +"\n"+ numeros);
        }


	}


