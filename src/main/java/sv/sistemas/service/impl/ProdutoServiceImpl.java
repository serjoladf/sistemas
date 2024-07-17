package sv.sistemas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.sistemas.model.Produto;
import sv.sistemas.repository.ProdutoRepository;
import sv.sistemas.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public Produto adicionarProdutoAVenda(Produto produto) {
        return produtoRepository.save(produto);
    }
}
