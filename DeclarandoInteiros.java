package unipe.br;

import java.math.BigDecimal;

public class DeclarandoInteiros {
	public static void main(String[] args) {
		byte valor = 127;
		int inteiro = 1;
		short pequeno = -20;
		long grande = 123455;
		long outroLong = 123456663345l;
	
		float preco = 3.34F;
		double medida = 12342.45566;

		valor = (byte)grande;

		char caracter = 'Y';
		char unicode = '\u0059';
		
		BigDecimal valorUm = new BigDecimal("10.7");
		BigDecimal outroNumero = new BigDecimal("9.5");
		System.out.println( valorUm.add( outroNumero ) );
		
		
		
	}

}
