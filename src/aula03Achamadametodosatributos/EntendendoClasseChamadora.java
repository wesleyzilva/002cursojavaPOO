/**
 * 
 */
package aula03Achamadametodosatributos;

/**
 * @author wesley
 *
 */
public class EntendendoClasseChamadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciando objeto da classe
		EntendendoClasseChamada classe1 = new EntendendoClasseChamada();

		/*
		 * Entendendo a visibilidade do método e atributo.
		 */

		classe1.atributo1publico = 100;
		classe1.atributo2publico = "atributoStringPublica";
		// Não pode ser alterado a caracteristica3private
		// classe1.caracteristica3private = true;
		classe1.caracteristica4protected = true;

		classe1.usoMetodoStatusPublicoTodosAtributos();
		System.out.println("");
		System.out.println("Usando método para acessar atributo privado da classe");
		System.out.println("1- usoMetodoPublicoCaracteristica3privada");
		classe1.usoMetodoPublicoCaracteristica3privada();
		System.out.println("");
		System.out.println("Usando método para acessar atributo protegido da classe");
		System.out.println("2- usoMetodoPadraoCaracteristica4Protegida");
		classe1.usoMetodoPadraoCaracteristica4Protegida();

	}

}
