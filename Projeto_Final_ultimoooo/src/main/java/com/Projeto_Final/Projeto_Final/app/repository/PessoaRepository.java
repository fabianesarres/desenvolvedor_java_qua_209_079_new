package com.Projeto_Final.Projeto_Final.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Projeto_Final.Projeto_Final.app.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
