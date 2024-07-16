package sv.sistemas.model;

import javax.persistence.*;

@Entity
public class Prazo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;

    public static final List<String> PRAZOS_PREDEFINIDOS = Arrays.asList("7 dias", "14 dias", "21 dias", "28 dias", "7/14 dias", "21/28 dias");

    // Getters and setters
}
