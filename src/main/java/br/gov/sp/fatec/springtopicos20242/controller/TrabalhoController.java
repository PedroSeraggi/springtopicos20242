package br.gov.sp.fatec.springtopicos20242.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.gov.sp.fatec.springtopicos20242.entity.Trabalho;
import br.gov.sp.fatec.springtopicos20242.service.TrabalhoService;

@RestController
@RequestMapping(value = "/trabalho")
@CrossOrigin
public class TrabalhoController {

    @Autowired
    private TrabalhoService trabalhoService;

    // Endpoint para listar todos os trabalhos
    @GetMapping("/listar")
    public List<Trabalho> listarTodos() {
        return trabalhoService.listarTodos();
    }

    // Endpoint para cadastrar um novo trabalho
    @PostMapping("/cadastro")
    public Trabalho cadastrarTrabalho(@RequestBody Trabalho trabalho) {
        return trabalhoService.cadastrar(trabalho);
    }

    // Endpoint para buscar um trabalho por ID
    @GetMapping("/{id}")
    public Trabalho buscarPeloId(@PathVariable("id") Long id) {
        return trabalhoService.buscarPeloId(id);
    }

    // Endpoint para buscar trabalhos pelo título e nota
    @GetMapping("/buscar")
    public List<Trabalho> buscarPorTituloENota(
        @RequestParam String palavra,
        @RequestParam Integer nota
    ) {
        return trabalhoService.buscarPorTituloENota(palavra, nota);
    }
}
