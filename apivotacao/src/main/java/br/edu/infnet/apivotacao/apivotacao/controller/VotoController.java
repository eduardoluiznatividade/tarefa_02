package br.edu.infnet.apivotacao.apivotacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.edu.infnet.apivotacao.apivotacao.model.domain.Voto;
import br.edu.infnet.apivotacao.apivotacao.model.service.VotoService;

@RestController
@RequestMapping("/api/votacao/votos")
public class VotoController {
	
	@Autowired
	private VotoService votoService;


	@GetMapping(value = "/listar")
	public List<Voto> listar() {
		return votoService.obterLista();

	}

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Voto voto) {
		votoService.incluir(voto);

	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		votoService.excluir(id);
		
	}
}