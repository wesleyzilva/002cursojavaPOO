package aula06Cencapsulamentotreino;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor implements InterfaceControladora {

	private int posicaovetor = 0;
	private int tamanhovetor = 0;
	private String nomevetor = "";
	int vetorVariavel[] = new int[0];
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nomevetor;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nomevetor = nome;
	}

	/**
	 * @param posicao
	 * @param tamanho
	 */
	public Vetor(String nome, int tamanho) {
		super();
		this.tamanhovetor = tamanho;
		this.nomevetor = nome;
	}

	/**
	 * @return the posicao
	 */
	private int getPosicao() {
		return posicaovetor;
	}

	/**
	 * @param posicao the posicao to set
	 */
	private void setPosicao(int posicao) {
		this.posicaovetor = posicao;
	}

	/**
	 * @return the tamanho
	 */
	private int getTamanho() {
		return tamanhovetor;
	}

	/**
	 * @param tamanho the tamanho to set
	 */
	private void setTamanho(int tamanho) {
		this.tamanhovetor = tamanho;
	}

	@Override
	public void metodoDefinicaoVetor(String nomevetor, int tamanhovetor) {
		// TODO Auto-generated method stub
		setNome(nomevetor);
		setTamanho(tamanhovetor);
		int v[] = new int[getTamanho()];
		Arrays.fill(v, 0);
		System.out.println("Nome do vetor = " + getNome());
		// Impressão dos valores dentro da posição do vetor.
		for (int i = 0; i < v.length; i++) { //
			System.out.printf(" " + v[i]);
		}
		System.out.println("");
	}

	@Override
	public void metodoPreencimentoVetor() {
		// TODO Auto-generated method stub

		//Vetor preenchido com valores setados pelo usuário
		int j = 0;
		int vtamanho = getTamanho();
		int v[] = new int[getTamanho()];
		//Jogar o vetor em uma variável
		
		Scanner teclado = new Scanner(System.in);
		
		while (j != v.length + 1) {
			System.out.println("Digite a POSIÇÃO que deseja inserir um VALOR.");
			int posicaoValor;
			if ((posicaoValor = teclado.nextInt()) > v.length) {
				System.out.println("Digite uma posição até o tamanho de: " + v.length);
				break;
			}
			System.out.println("Digite o VALOR que deseja inserir na POSIÇÃO.");
			int valorInserido = teclado.nextInt();

			System.out.println("Será inserido no vetorBase de TAMANHO = " + v.length + ", na POSIÇÃO = " + posicaoValor
					+ ", o VALOR = " + valorInserido);
			v[posicaoValor] = valorInserido; // Vetor Base na posicaoValor recebe o valorInserido.

			// Imprimir o vetor criado para mostrar a posição que foi inserido o valor na
			// posição correta.
			System.out.println("Vetor criado = "+Arrays.toString(v));
			j++;
			if (j == v.length) {
				break;
			}
		}

		
	}

	@Override
	public void metodoOrdenacaoVetor() {
		// TODO Auto-generated method stub
		int v[] = new int[getTamanho()];
		Arrays.sort(v);
		System.out.println(Arrays.toString(v));
	}

}
