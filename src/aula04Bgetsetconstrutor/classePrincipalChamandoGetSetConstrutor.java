/**
 * 
 */
package aula04Bgetsetconstrutor;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

/**
 * @author wesley
 *
 */
public class classePrincipalChamandoGetSetConstrutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciando o objeto para ser utilizado.
		ClasseChamadaGetSetConstrutor instanciaClasseChamada = new ClasseChamadaGetSetConstrutor();
		// Usando o acessor publico para modificar atributo e retornando o valor
		instanciaClasseChamada.setAtributo01("###Valor do atributo SETADO###");
		System.out.println("instanciaClasseChamada.setAtributo01");
		System.out.println("DEFINE atributo privado através do método público");
		System.out.println(
				"private String atributo01privado = (" + instanciaClasseChamada.getAtributo01() + ") VIA SETTER.");
		System.out.println("------------------------");
		System.out.println("RECUPERA o valor privado do atributo:");
		System.out.println(
				"instanciaClasseChamada.getAtributo01 = (" + instanciaClasseChamada.getAtributo01() + ") VIA GETTER.");

	}

}
