import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
		
	public static void main(String[] args) {
		
		Chines chines = new Chines();
		chines.escravo();
		Japones japones = new Japones();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe um número");
		
				
		try {
			int i = leitor.nextInt();
			
			japones.produzInteligencia();
		} catch (InputMismatchException e) {
			System.out.println("Digite apenas valores");
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Sempre executa");
		}
		
		leitor.close();
	}
}
