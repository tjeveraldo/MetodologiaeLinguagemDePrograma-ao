package unipe.br;

import java.util.Scanner;

public class Aula04 {
	public static void main(String[] args) {
		
		Scanner leitor =  new Scanner(System.in);
	    System.out.println("Informe uma op�ao");
		int opcao = leitor.nextInt();
		
		
		switch (opcao) {
		case 1:
			System.out.println("Op��o 1 digitada");
			break;
		case 2:
			System.out.println("Op��o 2 digitada");
		case 3:
			System.out.println("Op��o 3 digitada");
			break;
		default:
			System.out.println("Nenhuma opcao");
		}
	}

}
