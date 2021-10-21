package br.com.cwi.reset.samantamarry.apiresetflix.controller;

import br.com.cwi.reset.samantamarry.apiresetflix.AtorEmAtividade;
import br.com.cwi.reset.samantamarry.apiresetflix.FakeDatabase;
import br.com.cwi.reset.samantamarry.apiresetflix.modal.Ator;
import br.com.cwi.reset.samantamarry.apiresetflix.service.AtorService;
import br.com.cwi.reset.samantamarry.apiresetflix.view.AtorRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/atores")
public class AtorController {

    private AtorService atorService;

    public AtorController() {
        this.atorService = new AtorService(FakeDatabase.getInstance());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarAtor(@RequestBody AtorRequest atorRequest) throws Exception {
        this.atorService.criarAtor(atorRequest);

    }

    @GetMapping(path = "/em_atividade")
    public List<AtorEmAtividade> listarAtoresEmAtividade(@RequestParam String filtroNome) throws Exception{
        return this.atorService.listarAtoresEmAtividade(filtroNome);

    }

    @GetMapping(path = "/id")
    public Ator consultarAtor(@PathVariable Integer id) throws Exception{
        return this.atorService.consultarAtor(id);
    }

    @GetMapping
    public List<Ator> consultarAtores() throws Exception{
        return this.atorService.consultarAtores();
    }


}
