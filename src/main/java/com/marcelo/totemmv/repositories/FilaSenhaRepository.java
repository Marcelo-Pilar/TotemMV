package com.marcelo.totemmv.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.marcelo.totemmv.domain.FilaSenha;

@Repository
public interface FilaSenhaRepository extends JpaRepository<FilaSenha, Long>  {

	@Query(value = "SELECT * FROM FilaSenha WHERE idRegistroTotem = :id", nativeQuery = true)
	List<FilaSenha> findByIdFilaSenhaIdRegistroTotem(@Param("id") Long id);
}
