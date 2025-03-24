package com.example.aula.repository;

import com.example.aula.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Usuario, Long> {
}
