package sv.sistemas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.sistemas.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
