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
	}
	


