/**
 * 4 passos para entendimento e utilização de encapsulamento usando interfaces
 * PASSO 1: criar a interface controladora que irá implementar a classe dos objetos.
 * PASSO 2: Criar os atributos com métodos especiais PRIVADOS
 * e metodos á serem usados PRIVADOS
 * e construtor PUBLICO.
 * PASSO 3: Adequação da classe para implementar o controlador.
 * PASSO 4 : Utilizar os métodos na programação principal.
 */
package aula06Apilarespoo;

/**
 * @author wesley
 * @param <astract>
 *
 */

//PASSO 1: criar a interface controladora que irá implementar a classe dos objetos
public interface InterfaceControladoraEntreClasseQueDefineObjetoEMetodoMain {
//Lista de metodos abstrados para ser usado pela interface (ação);
	public abstract void usarAtributo01();
	void usarCaracteristica02();
	public abstract void usarAtributo03();

}