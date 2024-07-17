package sv.sistemas.service;

import org.springframework.stereotype.Service;
import sv.sistemas.model.Produto;

import java.util.ArrayList;
import java.util.List;

@Service
public class VendaService {

    private List<Produto> listaProdutosVenda = new ArrayList<>();

    public void adicionarProdutoAVenda(Produto produto) {
        listaProdutosVenda.add(produto);
    }

    public List<Produto> getListaProdutosVenda() {
        return listaProdutosVenda;
    }

    // Outros métodos relacionados à venda...
}
