package sv.sistemas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.sistemas.model.Endereco;
import sv.sistemas.service.EnderecoService;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public List<Endereco> findAll() {
        return enderecoService.findAll();
    }

    @PostMapping
    public Endereco save(@RequestBody Endereco endereco) {
        return enderecoService.save(endereco);
    }
}
