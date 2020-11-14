package com.barbara.blog_barbara.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbara.blog_barbara.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	
	public List<Tema> findAllByDescricaoContainingIgnoreCase (String descricao);
}
