/**
 * 
 */
package aula02classemetodoatributos;

/**
 * @author wesley
 *
 */
public class ClasseDasCanetas {

	// Caracteristicas da classe das canetas.
	String modelo = "BIC";
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

}
