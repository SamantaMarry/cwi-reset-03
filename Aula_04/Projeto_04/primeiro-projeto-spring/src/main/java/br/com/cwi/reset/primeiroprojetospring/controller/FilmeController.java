package br.com.cwi.reset.primeiroprojetospring.controller;


import br.com.cwi.reset.primeiroprojetospring.domain.Filme;
import br.com.cwi.reset.primeiroprojetospring.exception.FilmeJaExistenteException;
import br.com.cwi.reset.primeiroprojetospring.exception.FilmeNaoExistenteException;
import br.com.cwi.reset.primeiroprojetospring.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeController {


    @Autowired
    private FilmeService filmeService;

    @PostMapping
    public ResponseEntity<Filme> cadastrarFilme(@RequestBody Filme filme) {
        try {
            Filme filmeSalvo = filmeService.salvar(filme);
            return ResponseEntity.ok(filmeSalvo);
        } catch (FilmeJaExistenteException ex) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping
    public List<Filme> consultarTodos() {
        return filmeService.listarTodos();
    }

    @GetMapping("/by-diretor/{nomeDiretor}")
    public List<Filme> findByDiretor(@PathVariable String nomeDiretor) {
        return filmeService.buscarPorDiretor(nomeDiretor);
    }

    @GetMapping("/{nome}")
    public Filme buscarFilmePeloNome(@PathVariable String nome) {
        return filmeService.buscarPorNome(nome);
    }

    @DeleteMapping("/{nome}")
    public ResponseEntity deletarFilme(@PathVariable String nome) {
        try {
            filmeService.deletar(nome);
            return ResponseEntity.ok().build();
        } catch (FilmeNaoExistenteException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping
    public ResponseEntity<Filme> atualizarFilme(@RequestBody Filme filme) {
        try {
            return ResponseEntity.ok(filmeService.atualizar(filme));
        } catch (FilmeNaoExistenteException e) {
            return ResponseEntity.badRequest().build();
        }
    }

}
