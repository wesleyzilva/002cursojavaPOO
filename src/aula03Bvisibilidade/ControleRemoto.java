/**
 * 
 */
package aula03Bvisibilidade;

import java.awt.peer.LightweightPeer;

/**
 * @author wesley
 *
 */
public class ControleRemoto {
	/*
	 * O que o controle remoto tem/faz? Qual a classe que define o controle remoto?
	 * O atributo ou método é publico ou privado?
	 * Publico = Pode ser alterado por qualquer um.
	 * Privado = Alterado apenas na classe.
	 * 
	 * Como acessar estes atributos e métodos basedos na visibilidade.
	 * 
	 */

	private String marca = "Amazon";
	public int tipoAparelho;
	public int cargaBateria;
	public boolean ligadoDesligado;
	public boolean conexaoAtiva;

	/**
	 * 
	 */
	public void ligarControle() {
		// TODO Auto-generated method stub
		this.ligadoDesligado = true;
	}

	/**
	 * 
	 */
	public void desligarControle() {
		// TODO Auto-generated method stub
		this.ligadoDesligado = false;
	}

	/**
	 * 
	 */
	void statusConexao() {
		// TODO Auto-generated method stub
		if (conexaoAtiva == true) {
			System.out.println("...Conexão online !");
		} else {
			System.out.println("2: Verificar conexão com aparelho ou bateria.");
		}
	}

	/**
	 * 
	 */
	void informarBateria() {
		// TODO Auto-generated method stub

		if (cargaBateria <= 10) {
			System.out.println("1: Favor carregar o controle antes de usar.");
		} else {
			System.out.println("...Bateria em " + cargaBateria + "%.");
		}
	}

	/**
	 * 
	 */
	public void statusControle() {
		// TODO Auto-generated method stub
		System.out.println("####STATUS DO CONTROLE: ");
		System.out.println("Marca: " + getMarca());
		System.out.println("Tipo: " + tipoAparelho);
		System.out.println("Bateria: " + cargaBateria);
		System.out.println("Conexão: " + conexaoAtiva);
		System.out.println("");
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
}
