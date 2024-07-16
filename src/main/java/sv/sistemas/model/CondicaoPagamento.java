package sv.sistemas.model;

import javax.persistence.*;

@Entity
public class CondicaoPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    // Getters and setters
}
