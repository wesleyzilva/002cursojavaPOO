/**
 * 
 */
package aula03Bvisibilidade;

/**
 * @author wesley
 *
 */
public class ControleMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Para usar o objeto da classe temos que instacia-lo. Desta forma podemos usar
		 * seus atributos e métodos criados na classe do objeto.
		 */
		ControleRemoto controle1 = new ControleRemoto();
		controle1.getMarca();
		controle1.tipoAparelho = 2; // chromeCast ou fireTv
		controle1.cargaBateria = 100;
		controle1.conexaoAtiva = true;

		controle1.desligarControle();
		controle1.statusControle();
		controle1.informarBateria();
		controle1.statusConexao();
		///////////////////////////////////////////////////
		ControleRemoto controle2 = new ControleRemoto();
		controle2.getMarca();
		controle2.tipoAparelho = 1; // TV
		controle2.cargaBateria = 9; 
		controle2.conexaoAtiva = false;

		controle2.ligarControle();
		controle2.statusControle();
		controle2.informarBateria();
		controle2.statusConexao();

	}

}
