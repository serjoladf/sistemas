package sv.sistemas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.sistemas.model.Produto;
import sv.sistemas.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/adicionar")
    public Produto adicionarProdutoAVenda(@RequestBody Produto produto) {
        return produtoService.adicionarProdutoAVenda(produto);
    }
}
