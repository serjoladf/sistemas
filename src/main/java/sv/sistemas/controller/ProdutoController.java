package sv.sistemas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.sistemas.model.Produto;
import sv.sistemas.service.ProdutoService;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> findAll() {
        return produtoService.findAll();
    }

    @GetMapping("/{id}")
    public Produto findById(@PathVariable Long id) {
        return produtoService.findById(id);
    }

    @PostMapping
    public Produto save(@RequestBody Produto produto) {
        return produtoService.save(produto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        produtoService.deleteById(id);
    }

    // Método para adicionar produto à venda
    @PostMapping("/adicionar")
    public void adicionarProdutoAVenda(@RequestBody Produto produto) {
        produtoService.adicionarProdutoAVenda(produto);
    }
}
