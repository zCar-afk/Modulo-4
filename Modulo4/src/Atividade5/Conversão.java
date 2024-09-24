package Atividade5;
import java.util.ArrayList;
public class Conversão {

	public static void main(String[] args) {
		ArrayList<String> stringNumero = new ArrayList<>();
		stringNumero.add("1");
        stringNumero.add("5");
        stringNumero.add("7");  
        stringNumero.add("teste");
        
        System.out.println("Strings a serem convertidas : " + "\n" + stringNumero);
        
        ArrayList<Integer> Convertidos = new ArrayList<>();
        for (String str : stringNumero) {
            try {
                int numero = Integer.parseInt(str);
                Convertidos.add(numero); 
            } catch (NumberFormatException e) {
                System.out.println("\nErro ao converter '" + str + "': Formato inválido.");
            }
            }
        

        System.out.println("\nNúmeros convertidos : " + "\n" + Convertidos);
}
}
