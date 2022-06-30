package br.edu.infnet.apivotacao.apivotacao.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.apivotacao.apivotacao.model.domain.Eleitor;
import br.edu.infnet.apivotacao.apivotacao.model.repository.EleitorRepository;

@Service
public class EleitorService {

	@Autowired
	private EleitorRepository eleitorRepository;
	
	public List<Eleitor> obterLista(){
		return (List<Eleitor>) eleitorRepository.findAll();
	}

	public void incluir(Eleitor eleitor) {
		eleitorRepository.save(eleitor);
	}

	public void excluir(Integer id) {
		eleitorRepository.deleteById(id);
	}
}