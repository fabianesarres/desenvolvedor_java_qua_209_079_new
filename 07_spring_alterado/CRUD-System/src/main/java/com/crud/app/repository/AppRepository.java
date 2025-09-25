package com.crud.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.crud.app.models.Pessoa;


public interface AppRepository extends CrudRepository<Pessoa, Long> {
    Pessoa findByIdPessoa(Long idPessoa);
    Pessoa deleteByIdPessoa(Long idPessoa);
}
