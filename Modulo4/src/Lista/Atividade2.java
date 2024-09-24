package Lista;
import java.util.ArrayList;
import java.util.Collections;
public class Atividade2 {

	public static void main(String[] args) {
		ArrayList<Double> numerosDecimais = new ArrayList<>();
		numerosDecimais.add(2.5);
        numerosDecimais.add(5.3);
        numerosDecimais.add(3.6);
        numerosDecimais.add(9.9);
        numerosDecimais.add(11.4);
        numerosDecimais.add(15.8);
        numerosDecimais.add(23.1);
        numerosDecimais.add(18.8);
        numerosDecimais.add(42.7);
        numerosDecimais.add(1.5);
        
        Collections.sort(numerosDecimais);
        System.out.println("Números em ordem crescente: " + numerosDecimais);
        
        Collections.sort(numerosDecimais, Collections.reverseOrder());
        System.out.println("\nNúmeros em ordem decrescente: " + numerosDecimais);
    


	}

}
