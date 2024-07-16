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
    public static String getLiberado() {
        return LIBERADO;
    }
    public static String getBloqueado() {
        return BLOQUEADO;
    }

    // Getters and setters
}
