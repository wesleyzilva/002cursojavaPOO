/**
 * 
 */
package aula04Aula02melhorada;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import javax.net.ssl.SSLEngineResult.Status;

/**
 * @author wesley
 * Metodos não podem 
 */
public class Aula04Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Forma natural de leitura

		/*
		 * Instanciando objeto para utilização com parâmetros. Importando a biblioteca
		 * externa Usando a classe da biblioteca
		 */
		ClasseDasCanetasMetodosEspecias c1 = new ClasseDasCanetasMetodosEspecias();
		ClasseDasCanetasMetodosEspecias c2 = new ClasseDasCanetasMetodosEspecias();
		Scanner teclado = new Scanner(System.in);

		/*
		 * Parametros á serem utilizados USANDO OS SETTER
		 */
		
		c1.status(); // status antes de destampar.
		System.out.println("");
		c1.setModelo("BIC");
		c1.setPonta(0.5f);
		c1.setCor("Roxa");
		c1.status(); // status antes de destampar.

		// Parametro para
		c2.setCor("Vermelha");
		c2.setPonta(1);
//		c2.destampar();

		System.out.println("");

		System.out.println("Escolha:");
		System.out.println("1 - Destampar caneta");
		System.out.println("2 - Tampar caneta");
		int escolhamenu = teclado.nextInt();
		if (escolhamenu == 1) {
			c1.destampar();
			System.out.println("");
			c1.status(); // status depois de destampar
			System.out.println("");
			c1.rabiscar();
		}
		else {
			System.out.println("Opção 2: Tampar caneta e");
			c1.tampar();
			System.out.println("Modelo usando método acessor para atributo privado");
			System.out.println(c1.getModelo());
		}
	}

}
