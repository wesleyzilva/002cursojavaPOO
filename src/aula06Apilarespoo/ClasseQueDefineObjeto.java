/**
 * 
 */
package aula06Apilarespoo;

/**
 * @author wesley
 *
 */

//PASSO 3: Adequação da classe para implementar o controlador
class ClasseQueDefineObjeto implements InterfaceControladoraEntreClasseQueDefineObjetoEMetodoMain {

	// PASSO 2: Criar os atributos com métodos especiais PRIVADOS
	// e metodos á serem usados PRIVADOS
	// e construtor PUBLICO
	private String atributo01 = "";
	private String caracteristica02 = "String inicial da caracteristica02";
	private boolean atributo03 = true;

	/**
	 * @param atributo01
	 * @param caracteristica02
	 * @param atributo03
	 */
	//Construtor construido á partir de parâmetros.
	public ClasseQueDefineObjeto(String atributo01, String caracteristica02, boolean atributo03) {
		super();
		this.atributo01 = atributo01;
		this.caracteristica02 = caracteristica02;
		this.atributo03 = atributo03;
	}

	/**
	 * @return the atributo01
	 */
	private String getAtributo01() {
		return atributo01;
	}

	/**
	 * @param atributo01 the atributo01 to set
	 */
	private void setAtributo01(String atributo01) {
		this.atributo01 = atributo01;
	}

	/**
	 * @return the caracteristica02
	 */
	private String getCaracteristica02() {
		return caracteristica02;
	}

	/**
	 * @param caracteristica02 the caracteristica02 to set
	 */
	private void setCaracteristica02(String caracteristica02) {
		this.caracteristica02 = caracteristica02;
	}

	/**
	 * @return the atributo03
	 */
	private boolean isAtributo03() {
		return atributo03;
	}

	/**
	 * @param atributo03 the atributo03 to set
	 */
	private void setAtributo03(boolean atributo03) {
		this.atributo03 = atributo03;
	}
////////////////////////////////////////////////////////////////////////

	@Override
	public void usarAtributo01() {
		// TODO Auto-generated method stub
		setAtributo01("String do atributo01 incluida via setAtributo01()");
		System.out.println(""+getAtributo01());
	}

	@Override
	public void usarCaracteristica02() {
		// TODO Auto-generated method stub
		setCaracteristica02("String usando set no método da usarCaracteristica02");
		System.out.println("getCaracteristica02 = "+getCaracteristica02());
	}
	
	@Override
	public void usarAtributo03() {
		// TODO Auto-generated method stub
		setAtributo03(false);
		System.out.println("Boolean resultante do método setAtributo03 = "+isAtributo03());
	}

}
