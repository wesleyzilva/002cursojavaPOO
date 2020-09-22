/**
 * 
 */
package aula04Bgetsetconstrutor;

/**
 * @author wesley
 *
 */
public class ClasseChamadaGetSetConstrutor {

	/* Métodos acessores
	 * Método Setter é mais abstrato que o Getter Getter e Setter são os acessores
	 * do atributo
	 * 
	 * SETTER : recebe parametro para ser setado 
	 * GETTER : não precisa de parâmetro,pois, busca o valor setado
	 * 
	 */

	private String atributo01privado;
	public Boolean atributo02publico;
	int caracteristica03publica;

	/**
	 * @return the atributo01
	 */
	public String getAtributo01() {
		return atributo01privado;
	}

	/**
	 * @param atributo01 the atributo01 to set
	 */
	public void setAtributo01(String atributo01) {
		this.atributo01privado = atributo01;
	}

	/**
	 * @return the atributo02
	 */
	public Boolean getAtributo02() {
		return atributo02publico;
	}

	/**
	 * @param atributo02 the atributo02 to set
	 */
	public void setAtributo02(Boolean atributo02) {
		this.atributo02publico = atributo02;
	}

	/**
	 * @return the caracteristica03
	 */
	public int getCaracteristica03() {
		return caracteristica03publica;
	}

	/**
	 * @param caracteristica03 the caracteristica03 to set
	 */
	public void setCaracteristica03(int caracteristica03) {
		this.caracteristica03publica = caracteristica03;
	}

}
