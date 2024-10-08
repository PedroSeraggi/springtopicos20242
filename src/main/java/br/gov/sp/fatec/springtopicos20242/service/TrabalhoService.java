package br.gov.sp.fatec.springtopicos20242.service;

import br.gov.sp.fatec.springtopicos20242.entity.Trabalho;
import br.gov.sp.fatec.springtopicos20242.repository.TrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TrabalhoService {

    @Autowired
    private TrabalhoRepository trabalhoRepository;

    public Trabalho cadastrar(Trabalho trabalho) {
        // Verifica se título e grupo estão preenchidos
        if (trabalho.getTraTitulo() == null || trabalho.getTraGrupo() == null) {
            throw new IllegalArgumentException("Título e Grupo são obrigatórios");
        }

        // Usa a data/hora atual se a data/hora de entrega não estiver preenchida
        if (trabalho.getTraDataHoraEntrega() == null) {
            trabalho.setTraDataHoraEntrega(LocalDateTime.now());
        }

        return trabalhoRepository.save(trabalho);
    }

    public List<Trabalho> listarTodos() {
        return trabalhoRepository.findAll();
    }

    public Trabalho buscarPeloId(Long id) {
        return trabalhoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Trabalho não encontrado"));
    }

    public List<Trabalho> buscarPorTituloENota(String palavra, Integer nota) {
        return trabalhoRepository.buscarPorTituloENota(palavra, nota);
    }
}
