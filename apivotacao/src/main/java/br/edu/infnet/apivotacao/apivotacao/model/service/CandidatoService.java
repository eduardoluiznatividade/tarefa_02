package br.edu.infnet.apivotacao.apivotacao.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.apivotacao.apivotacao.model.domain.Candidato;
import br.edu.infnet.apivotacao.apivotacao.model.repository.CandidatoRepository;

@Service
public class CandidatoService {

	@Autowired
	private CandidatoRepository candidatoRepository;
	
	public List<Candidato> obterLista(){
		return (List<Candidato>) candidatoRepository.findAll();
	}
	
	public void incluir(Candidato candidato) {
		candidatoRepository.save(candidato);
	}
	
	public void excluir(Integer id) {
		candidatoRepository.deleteById(id);
	}
}