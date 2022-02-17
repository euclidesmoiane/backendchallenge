package mz.com.backenddeveloper.test;

import org.junit.Ignore;
import org.junit.Test;

import mz.com.backenddeveloper.dao.PaisDAO;
import mz.com.backenddeveloper.domain.Pais;

public class PaisDAOTest {

	@Test
	@Ignore
	public void salvar() {
		PaisDAO dao = new PaisDAO();
		Pais pais = new Pais();
		pais.setNome("Rússia");
		pais.setCapital("Moscov");
		pais.setRegiao("South");
		pais.setSubregiao("Southside");
		pais.setArea("400.0000km");
		dao.salvar(pais);

	}

}
