package mz.com.backenddeveloper.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import mz.com.backenddeveloper.dao.PaisDAO;
import mz.com.backenddeveloper.domain.Pais;

@Path("pais")
public class PaisService {

	@GET
	@Path("display")
	@Produces(MediaType.TEXT_PLAIN)
	public String display() {
		PaisDAO dao = new PaisDAO();
		List<Pais> paises = dao.listar();
		Gson gson = new Gson();
		String json = gson.toJson(paises);
		return json;
	}

	@GET
	@Path("{codigo}")
	public String buscar(@PathParam("codigo") Long codigo) {
		PaisDAO dao = new PaisDAO();
		Pais pais = dao.buscar(codigo);
		Gson gson = new Gson();
		String json = gson.toJson(pais);
		return json;
	}

	@POST
	@Path("post")
	@Produces(MediaType.TEXT_PLAIN)
	public void salvar(String json) {
		Gson gson = new Gson();
		Pais pais = gson.fromJson(json, Pais.class);
		PaisDAO dao = new PaisDAO();
		dao.salvar(pais);

	}

	@PUT
	@Path("put")
	@Produces(MediaType.TEXT_PLAIN)
	public void editar(String json) {
		Gson gson = new Gson();
		Pais pais = gson.fromJson(json, Pais.class);
		PaisDAO dao = new PaisDAO();
		dao.editar(pais);

	}

	@DELETE
	@Path("delete")
	@Produces(MediaType.TEXT_PLAIN)
	public void excluir(String json) {
		Gson gson = new Gson();
		Pais pais = gson.fromJson(json, Pais.class);
		PaisDAO dao = new PaisDAO();
		pais = dao.buscar(pais.getCodigo());
		dao.excluir(pais);

	}

}
