package aula06Bencapsulamento;

public class ProgramaPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ControleRemoto controle = new ControleRemoto(false, 0);
		controle.abrirMenu();
		controle.ligar();
		controle.abrirMenu();
//		controle.tocar();
		controle.abrirMenu();
		controle.pausar();
		controle.abrirMenu();
		controle.aumentarVolume();
		controle.aumentarVolume();
		controle.aumentarVolume();
		controle.diminuirVolume();
		controle.diminuirVolume();
		controle.abrirMenu();
		controle.diminuirVolume();
		controle.abrirMenu();
		controle.diminuirVolume();
		controle.mudo();
		controle.abrirMenu();
	}
}
