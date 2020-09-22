/**
 * 
 */
package aula03Achamadametodosatributos;

import java.security.ProtectionDomain;

/**
 * @author wesley
 * 
 *         Padrão java : Publica para pacote
 * 
 *         Publico : + acesso total 
 *         Privado : - acesso privado apenas para ser
 *         alterado pela classe 
 *         Protegido: # protegido
 *
 */
public class EntendendoClasseChamada {

	/*
	 * Caracteristica principal da classe, não é usada com o método Main
	 * 
	 */

	public int atributo1publico;
	public String atributo2publico;
	private boolean caracteristica3private;
	protected boolean caracteristica4protected;

	/*
	 * Método que todos tem acesso inclusive para ver atributos privados e
	 * protegidos.
	 */
	public void usoMetodoStatusPublicoTodosAtributos() {
		// TODO Auto-generated method stub
		System.out.println("#Visibilidade de Métodos e Características");
		System.out.println("atributo1publico = " + this.atributo1publico);
		System.out.println("atributo2publico = " + this.atributo2publico);
		System.out.println("caracteristica3 privada = " + this.caracteristica3private);
		System.out.println("caracteristica4 protegida = " + this.caracteristica4protected);
	}

	/**
	 * 
	 */
	public void usoMetodoPublicoCaracteristica3privada() {
		// TODO Auto-generated method stub
		this.caracteristica3private = true;
		System.out.println("usoMetodoPublicoCaracteristica3privada = " + caracteristica3private);
	}

	/**
	 * Padrão java para pacote
	 */
	void usoMetodoPadraoCaracteristica4Protegida() {
		// TODO Auto-generated method stub
		this.caracteristica4protected = false;
		System.out.println("usoMetodoPadraoCaracteristica4Protegida = " + caracteristica4protected);
		System.out.println("");
	}

	/**
	 * 
	 */
	private void usoMetodoPrivadoAtributo1Publico() {
		// TODO Auto-generated method stub
		System.out.println("usoMetodoPrivadoAtributo1Publico = " + atributo1publico);
		System.out.println("");
	}

}