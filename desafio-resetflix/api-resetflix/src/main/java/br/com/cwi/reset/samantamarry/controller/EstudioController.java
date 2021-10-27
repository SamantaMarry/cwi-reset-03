package br.com.cwi.reset.samantamarry.controller;

import br.com.cwi.reset.samantamarry.model.Estudio;
import br.com.cwi.reset.samantamarry.request.EstudioRequest;
import br.com.cwi.reset.samantamarry.service.EstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/estudios")
public class EstudioController {

    @Autowired
    private EstudioService estudioService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarEstudio(@RequestBody @Valid EstudioRequest estudioRequest) throws Exception {
        estudioService.criarEstudio(estudioRequest);
    }

    @GetMapping
    public List<Estudio> consultarEstudios(@RequestParam @Valid String filtroNome) throws Exception {
        return estudioService.consultarEstudios(filtroNome);
    }

    @GetMapping(path = "/{id}")
    public Estudio consultarEstudio(@PathVariable @Valid Integer id) throws Exception {
        return estudioService.consultarEstudio(id);
    }
}
