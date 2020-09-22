/**
 * 
 */
package aula04Cpratica;

import java.io.ObjectInputStream.GetField;

/**
 * @author wesley
 *
 */
public class AplicacaoDoBanco {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("##########Conta corrente");
		ControleContaInicial contadobanco1 = new ControleContaInicial();

		contadobanco1.abrirconta("cc");
		contadobanco1.depositar("cc", 1000);
		System.out.println("");
		contadobanco1.depositar("cc", 999);
		contadobanco1.sacar(359);
		System.out.println("");
		contadobanco1.statusconta();
		System.out.println("");
		contadobanco1.pagarmensalidade();
		System.out.println("");
		contadobanco1.statusconta();
		contadobanco1.fecharconta();
		
		System.out.println("##########Conta poupança");
		ControleContaInicial contadobanco2 = new ControleContaInicial();
		contadobanco2.abrirconta("cp");
		contadobanco2.depositar("cp", 10000);
		System.out.println("");
		contadobanco2.depositar("cp", 999);
		contadobanco2.sacar(11099);
		System.out.println("");
		contadobanco2.statusconta();
		System.out.println("");
		contadobanco2.pagarmensalidade();
		System.out.println("");
		contadobanco2.statusconta();
		contadobanco2.fecharconta();

	}

}
