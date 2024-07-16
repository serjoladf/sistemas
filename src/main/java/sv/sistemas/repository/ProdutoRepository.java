package sv.sistemas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.sistemas.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
