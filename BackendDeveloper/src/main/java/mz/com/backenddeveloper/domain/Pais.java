package mz.com.backenddeveloper.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Pais extends GenericDomain{
	@Column(length = 50, nullable = false)
	private String nome;

	@Column(length = 40, nullable = false)
	private String capital;

	@Column(length = 20, nullable = false)
	private String regiao;

	@Column(length = 20, nullable = false)
	private String subregiao;

	@Column(length = 15 , nullable = false)
	private String area;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public String getSubregiao() {
		return subregiao;
	}

	public void setSubregiao(String subregiao) {
		this.subregiao = subregiao;
	}

	public String getArea() {
		return area;
	}

	public void setArea (String area) {
		this.area = area;
	}
	
	

}
