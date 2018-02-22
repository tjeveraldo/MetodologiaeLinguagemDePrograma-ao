import java.util.Scanner;
public class Cervejas {
	

	
		public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);			
			
			int cervejas = 99;
			
			while (cervejas != 0) {
				System.out.println(cervejas + " cervejas no freezer\nPego uma garrafa, passo pra 			frente\nAgora são " + (cervejas - 1) + " cervejas no freezer.");
				cervejas -= 1;
				if(cervejas == 0){
					cervejas = pergunta(cervejas, leitor);
				}
			}
			leitor.close();
		}

		public static int pergunta(int cervejas, Scanner leitor){
			int qntdCervejas = 0;
			if(cervejas == 0){
				System.out.println("Voce deseja comprar quantas cervejas?");
				qntdCervejas = leitor.nextInt();
			}
			return qntdCervejas;
		}	


}
