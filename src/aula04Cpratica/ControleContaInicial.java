/**
 * 
 */
package aula04Cpratica;

import java.io.ObjectInputStream.GetField;

/**
 * @author wesley
 *
 */
public class ControleContaInicial {

	int numeroconta;
	String tipoconta; // cp ou cc
	String nomedonoconta;
	int saldo = 0;
	boolean status = false;

	/**
	 * @return the numeroconta
	 */
	private int getNumeroconta() {
		return numeroconta;
	}

	/**
	 * @param numeroconta the numeroconta to set
	 */
	private void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}

	/**
	 * @return the tipoconta
	 */
	private String getTipoconta() {
		return tipoconta;
	}

	/**
	 * @param tipoconta the tipoconta to set
	 */
	private void setTipoconta(String tipoconta) {
		this.tipoconta = tipoconta;
	}

	/**
	 * @return the nomedonoconta
	 */
	private String getNomedonoconta() {
		return nomedonoconta;
	}

	/**
	 * @param nomedonoconta the nomedonoconta to set
	 */
	private void setNomedonoconta(String nomedonoconta) {
		this.nomedonoconta = nomedonoconta;
	}

	/**
	 * @return the saldo
	 */
	private int getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	private void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the status
	 */
	private boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	private void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * 
	 */
	public void abrirconta(String tipoconta) {
		// TODO Auto-generated method stub
		System.out.println("###abrirconta###");
		setStatus(true);
		if (tipoconta == "cp") {
			setTipoconta("cp");
			setSaldo(getSaldo() + 100);
		} else {
			setTipoconta("cc");
			setSaldo(getSaldo() + 50);
		}
		System.out.println("Saldo de abertura de conta = " + getSaldo());
		System.out.println("Conta aberta com sucesso.");
	}

	/**
	 * 
	 */
	public void fecharconta() {
		// TODO Auto-generated method stub
		System.out.println("###fecharconta###");
		if (status == true) {
			if (getSaldo() > 0) {
				System.out.println("Tipo da conta: " + getTipoconta());
				System.out.println("Existe um saldo á sacar");
			} else {
				setStatus(false);
				System.out.println("Tipo da conta: " + getTipoconta());
				System.out.println("Conta fechada com sucesso.");
			}
		}

	}

	/**
	 * 
	 */
	void depositar(String tipoconta, int deposito) {
		// TODO Auto-generated method stub
		System.out.println("###depositar###");
		if (this.status == true) {
			System.out.println("Saldo inicial = " + getSaldo());
			setSaldo(getSaldo() + deposito);
			System.out.println("Obrigado por depositar = " + deposito);
			System.out.println("Seu saldo após deposito é de " + getSaldo());
		}

	}

	/**
	 * 
	 */
	public void sacar(int saque) {
		// TODO Auto-generated method stub
		System.out.println("###sacar###");
		if (status == true) {
			if (getSaldo() < 0) {
				System.out.println("Não existe saldo");
			} else {
				setSaldo(getSaldo() - saque);
				System.out.println("foi feito um saque de: " + saque);
			}
		}
	}

	/**
	 * 
	 */
	void pagarmensalidade() {
		// TODO Auto-generated method stub
		System.out.println("###pagarmensalidade###");
		int mensalidade;
		if (status == true & getSaldo() > 0) {
			if (tipoconta == "cc") {
				mensalidade = 20;
				setSaldo(getSaldo() - mensalidade);
			} else {
				mensalidade = 10;
				setSaldo(getSaldo() - mensalidade);
				System.out.println("Mensalidade paga de " + tipoconta);
				System.out.println(getSaldo());
			}
		}
	}

	/**
	 * 
	 */
	void statusconta() {
		// TODO Auto-generated method stub
		System.out.println("###statusconta###");
		System.out.println("Saldo atual: " + getSaldo());
		System.out.println("Status da conta: " + status);
	}
}