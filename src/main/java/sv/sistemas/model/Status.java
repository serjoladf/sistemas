package sv.sistemas.model;

import javax.persistence.*;

@Entity
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    public static final String LIBERADO = "Liberado";
    public static final String BLOQUEADO = "Bloqueado";

    // Getters and setters
}
