package br.gov.sp.fatec.springtopicos20242.repository;

import br.gov.sp.fatec.springtopicos20242.entity.Trabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TrabalhoRepository extends JpaRepository<Trabalho, Long> {
    
    @Query("SELECT t FROM Trabalho t WHERE t.traTitulo LIKE %:palavra% AND t.traNota > :nota")
    List<Trabalho> buscarPorTituloENota(@Param("palavra") String palavra, @Param("nota") Integer nota);
}
