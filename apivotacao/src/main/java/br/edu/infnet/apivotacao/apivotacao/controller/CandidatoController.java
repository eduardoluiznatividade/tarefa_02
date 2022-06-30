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
import br.edu.infnet.apivotacao.apivotacao.model.domain.Candidato;
import br.edu.infnet.apivotacao.apivotacao.model.service.CandidatoService;



@RestController
@RequestMapping("/api/votacao/candidatos")
public class CandidatoController {
	
	@Autowired
	private CandidatoService candidatoService;
	
	@GetMapping(value = "/listar")
	public List<Candidato> listar() {
		return candidatoService.obterLista();
	}

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Candidato candidato) {
		candidatoService.incluir(candidato);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		candidatoService.excluir(id);
	}
}