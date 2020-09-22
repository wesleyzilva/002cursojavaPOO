/**
 * 
 */
package aula02classemetodoatributos;

import java.util.Scanner;

import javax.net.ssl.SSLEngineResult.Status;

/**
 * @author wesley
 *
 */
public class Aula02Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Forma natural de leitura

		// Instanciando objeto para utilização com parâmetros.
		ClasseDasCanetas c1 = new ClasseDasCanetas();
		ClasseDasCanetas c2 = new ClasseDasCanetas();
		Scanner teclado = new Scanner(System.in);
		
		// Parametros á serem utilizados.
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampar();
		c1.status(); //status antes de destampar.
		c2.cor = "Vermelha";
		c2.ponta = 1;
		c2.destampar();
		
		System.out.println("");
		
		System.out.println("Escolha:");
		System.out.println("1 - Destampar caneta");
		System.out.println("2 - Tampar caneta");
		int escolhamenu = teclado.nextInt();
		if (escolhamenu == 1) {
			c1.destampar();
			System.out.println("");
			c1.status(); //status depois de destampar
			System.out.println("");
		}
		c1.rabiscar();
		System.out.println("");
		c1.tampar();

	}

}
