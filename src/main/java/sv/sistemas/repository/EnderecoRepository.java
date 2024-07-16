package sv.sistemas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.sistemas.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
