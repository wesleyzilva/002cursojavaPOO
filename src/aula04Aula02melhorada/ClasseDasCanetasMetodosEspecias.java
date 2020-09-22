/**
 * 
 */
package aula04Aula02melhorada;

import java.lang.reflect.Constructor;

/**
 * @author wesley
 *
 */
public class ClasseDasCanetasMetodosEspecias {

	/*
	 * Caracteristicas da classe das canetas que serão usadas em um
	 * construtor
	 */
	private String modelo = "BIC";
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	/*
	 * Metodo sem retorno "void" apenas para utilização.
	 */
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("");
			System.out.println("Não consigo rabiscar, pois, está tampada.");
		} else {
			System.out.println("...Rabiscando...");
			System.out.println("...Rabiscando...");
			System.out.println("...Rabiscando...");
			System.out.println("...Rabiscando...");
			System.out.println("...Rabiscando...");
			System.out.println("...Rabiscando...");
			System.out.println("...Rabiscando...");
			tampar();
		}

	}

	/**
	 * 
	 */
	public void tampar() {
		// TODO Auto-generated method stub
		this.tampada = true;
		System.out.println("IMPORTANTE: Garanta que a caneta esteja tampada ao guardar.");
	}

	/**
	 * 
	 */
	public void destampar() {
		// TODO Auto-generated method stub
		this.tampada = false;
		System.out.println("Destampando a caneta para rabiscar.");
	}

	/*
	 * Mostrando as caracteristicas da classe neste momento: modelo, cor, ponta,
	 * carga, tampada
	 * 
	 * "This" é auto-referência ao objeto chamado dentro da classe.
	 */
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta tamanho: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}

	////////////////// METODOS DE GETTER E SETTER GERADOS AUTOMATICAMENTE

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}

	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}

	/**
	 * @return the ponta
	 */
	public float getPonta() {
		return ponta;
	}

	/**
	 * @param ponta the ponta to set
	 */
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	/**
	 * @return the carga
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * @param carga the carga to set
	 */
	public void setCarga(int carga) {
		this.carga = carga;
	}

	/**
	 * @return the tampada
	 */
	public boolean isTampada() {
		return tampada;
	}

	/**
	 * @param tampada the tampada to set
	 */
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	////////////////// METODO CONSTRUTOR GERADOS AUTOMATICAMENTE
	/**
	 * Método Construtor define como a classe nasce
	 * protegendo o acesso com private apenas para dentro da classe
	 * tem o mesmo nome da classe
	 */

	/**
	 */
	public ClasseDasCanetasMetodosEspecias() {
		super();
		this.modelo = "Padrão para o construtor da classe";
		this.cor = "de qualquer cor para o construtor da classe";
		this.ponta = 1;
		this.carga = 100;
		this.tampada = false;
		tampar();
	}

}
