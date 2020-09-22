package aula06Cencapsulamentotreino;

import java.io.ObjectInputStream.GetField;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// Instanciando e criando um vetor com nome e tamanho via construtor.
		Vetor vetor1 = new Vetor("vetorcriado01", 5);
		// Definindo o nome e tamanho do novo vetor
		vetor1.metodoDefinicaoVetor("vetorcriado02", 3);
		vetor1.metodoPreencimentoVetor();
		vetor1.metodoOrdenacaoVetor();

	}
}
