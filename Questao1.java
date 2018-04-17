package arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;


/**
 * 
 * @author everaldo.gomes
 *
 */

public class Questao1 {
	public static void main(String[] args) {
		int[] array = new int[300];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i<300; i++){
			array[i] = 45;
		}
	//questao02
		for(int i = 0; i < 300; i++){
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		int i = 0;
		while(i < 300){
			System.out.print(array[i] + " ");
			i++;
		} 
		System.out.println();
		
		for(int v:array){
			System.out.print(v + " ");
		}
		
//questao03
		int[] lista = new int[10];
		
		for(i = 0; i < 10;i++){
			lista[i] = input.nextInt();
		}
		Arrays.sort(lista);
		
		for(i = 0; i < 10;i++){
			System.out.println(lista[i]);
				
			}
//questao4
		String[] listaString = new String[10];
		
		for(i = 0; i < 10; i++){
			listaString[i] = input.nextLine();
		}
		Arrays.sort(listaString);
		for(i = 0; i < 10; i++){
			System.out.println(listaString[i]);
		}

		}
//questao5
	
	private int TAM_LISTA = 10;
	private int[] lista = new int[TAM_LISTA];
	Scanner input = new Scanner(System.in);

/**
 * Método para receber os valores
 */
	
	public void inputValores() {
		System.out.printf("Informe 10 valores em uma única linha: ");
		for(int i = 0; i < lista.length; i++) {
			lista[i] = input.nextInt();
		}
		
		this.ordenaListaCrescente();
	}

/**
 * Método para ordenar a lista de forma crescente
 */
	
	private void ordenaListaCrescente() {
		int temp = 0;
		
		for(int i = 0; i < lista.length; i++) { 
			for(int j = i; j < lista.length; j++) {
				if(this.lista[i] > lista[j]) {
					temp = lista[i];
					lista[i] = lista[j];
					lista[j] = temp;
				}
			}
		}	
	}

/**
 * Método para imprimir a lista 
 */
	
	public void imprimeListaOrdenada() {
		for(int i = 0; i < lista.length; i++)
			System.out.printf("[%d] = %d%n", i, lista[i]);
	}
//questao6
	private String cpf;
	private String nome;
		{
		 this.cpf = n_cpf;
		 this.nome = n_nome;
		}

		public void setCpf(String n_cpf) {
			cpf = n_cpf;
		}

		public String getCpf() {
			return cpf;
		}

		public void setNome(String n_nome) {
			nome = n_nome;
		}

		public String getNome() {
			return nome;
		}
}
