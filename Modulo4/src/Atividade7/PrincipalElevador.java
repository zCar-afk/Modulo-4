package Atividade7;

public class PrincipalElevador {

	public static void main(String[] args) {
	
	        Elevador elevador = new Elevador(4, 8); 

	        elevador.entra();
	        elevador.entra();
	        elevador.entra();
	        elevador.sobe();
	        elevador.sobe();
	        elevador.sobe();
	        elevador.sai();
	        elevador.desce();
	        elevador.desce();
	        elevador.sobe();
	        elevador.sobe();
	        elevador.sai();
	        elevador.sai();


	        elevador.exibirMemoria();
	    }
	
	}


