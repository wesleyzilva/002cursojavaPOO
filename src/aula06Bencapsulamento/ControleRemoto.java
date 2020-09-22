package aula06Bencapsulamento;

public class ControleRemoto implements InterfaceControladora {

	private boolean onOff = false;
	private boolean tocando = false;
	private int volume = 10;

	/**
	 * @param onOff
	 * @param volume
	 */
	public ControleRemoto(boolean onOff, int volume) {
		super();
		this.onOff = onOff;
		this.volume = volume;
		this.tocando = tocando;
	}

	/**
	 * @return the tocando
	 */
	private boolean isTocando() {
		return tocando;
	}

	/**
	 * @param tocando the tocando to set
	 */
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	/**
	 * @return the onOff
	 */
	private boolean isOnOff() {
		return onOff;
	}

	/**
	 * @param onOff the onOff to set
	 */
	private void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}

	/**
	 * @return the volume
	 */
	private int getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	private void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		setOnOff(true);
		System.out.println("onOff = " + isOnOff());
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		setOnOff(false);
		System.out.println("onOff = " + isOnOff());
	}

	@Override
	public void aumentarVolume() {
		// TODO Auto-generated method stub
		if (isOnOff() == true) {
			setVolume(getVolume() + 10);
		} else {
			System.out.println("onOff = " + isOnOff());
		}
	}

	@Override
	public void diminuirVolume() {
		// TODO Auto-generated method stub
		if (isOnOff() == true) {
			setVolume(getVolume() - 5);
		} else {
			System.out.println("onOff = " + isOnOff());
		}
	}

	@Override
	public void abrirMenu() {
		// TODO Auto-generated method stub
		System.out.println("MENU MENU MENU MENU MENU MENU");
		System.out.println("ligado = " + this.isOnOff());
		System.out.println("tocando = " + isTocando());
		System.out.println("volume = " + getVolume());
		for (int i = 0; i < getVolume(); i++) {
			System.out.printf("|");
		}
		System.out.println("");
		System.out.println("MENU MENU MENU MENU MENU MENU");

	}

	@Override
	public void fecharMenu() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mudo() {
		// TODO Auto-generated method stub
		if (isOnOff() == true) {
			setVolume(0);
		} else {
			System.out.println("#volume = " + getVolume());
		}

	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		if (isOnOff() == true) {
			setTocando(true);
		} else {
			System.out.println("#ligado = " + isOnOff());
		}
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		if (isOnOff() == true && isTocando() == true) {
			setTocando(false);
		} else {
			System.out.println("#tocando = " + isTocando());

		}
	}

}
