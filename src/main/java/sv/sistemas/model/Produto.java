package sv.sistemas.model;

import javax.persistence.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int estoque;
    private int quantidade;
    private double preco;

    @Transient
    private double valorTotal;

    public double getValorTotal() {
        return quantidade * preco;
    }

    // Getters and setters
}
