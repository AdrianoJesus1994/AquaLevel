package br.com.ntank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ntank.model.Usuarios;

public interface UsuarioRepository extends JpaRepository<Usuarios, String>{

}
