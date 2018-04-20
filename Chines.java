
public class Chines {
	
	Japones japones = new Japones();
	
	public void escravo(){
		
		try{

			japones.produzInteligencia();
			japones = null;
			japones.produzInteligencia();
			System.out.println("Trabalha para a apple.");
			
		}catch(NullPointerException e){
			System.out.println("Ocorreu um - Null");
		}catch (Exception e){
			System.out.println("Erro inesperado");
		}
	}
}
