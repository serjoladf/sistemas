package sv.sistemas.model;

import javax.persistence.*;

@Entity
public class Prazo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    public static final List<String> PRAZOS_PREDEFINIDOS = Arrays.asList("7 dias", "14 dias", "21 dias", "28 dias", "7/14 dias", "21/28 dias");

    // Getters and setters
}
