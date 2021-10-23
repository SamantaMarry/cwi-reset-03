package br.com.cwi.reset.primeiroprojetospring.controller;

import br.com.cwi.reset.primeiroprojetospring.domain.Filme;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeController {

    private static List<Filme> filmes = new ArrayList<>();

    private Filme buscarFilmePeloNome(String nome){
        for (Filme filme : filmes){
            if(filme.getNome().equalsIgnoreCase(nome)){
                return filme;
            }
        }
        return null;
    }

    @PostMapping
    public ResponseEntity<Filme> cadastrarFilme(@RequestBody Filme filme){
        Filme filmeAchado = buscarFilmePeloNome(filme.getNome());
        if (filmeAchado != null){
            ResponseEntity.badRequest().build();
        }
        filmes.add(filme);
        return ResponseEntity.ok(filme);
    }

    @GetMapping
    public List<Filme> listarFilmes(){
        return filmes;
    }

    @GetMapping("/{nome}")
    public Filme consultarFilmePeloNome(@PathVariable String nome){
        Filme filme = buscarFilmePeloNome(nome);
        return filme;
    }

    @DeleteMapping("/{nome}")
    public void deletarFilme(@PathVariable String nome) {
        Filme filme = buscarFilmePeloNome(nome);
        if (filme != null) {
            filmes.remove(filme);
        }
    }

    @PutMapping
    public Filme atualizarFilme(@RequestBody Filme filme) {
        Filme filmeCadastrado = buscarFilmePeloNome(filme.getNome());
        if (filmeCadastrado != null) {
            filmes.remove(filmeCadastrado);
            filmes.add(filme);
            return filme;
        }
        return null;
    }

}
