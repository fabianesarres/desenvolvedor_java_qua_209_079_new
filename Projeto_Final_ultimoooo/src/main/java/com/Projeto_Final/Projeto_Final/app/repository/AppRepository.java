
package com.Projeto_Final.Projeto_Final.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.Projeto_Final.Projeto_Final.app.models.Pessoa;


public interface AppRepository extends CrudRepository<Pessoa, Long> {
    Pessoa findByIdPessoa(long idPessoa);
    Pessoa deleteByIdPessoa(long idPessoa);
}
