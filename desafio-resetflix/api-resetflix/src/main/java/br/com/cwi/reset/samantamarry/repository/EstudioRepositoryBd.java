package br.com.cwi.reset.samantamarry.repository;

import br.com.cwi.reset.samantamarry.model.Estudio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepositoryBd extends CrudRepository<Estudio, Integer> {

}
