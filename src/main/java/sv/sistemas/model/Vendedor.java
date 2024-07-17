package sv.sistemas.model;

public class Vendedor {
    private Long id;
    private String nome;
    private String cpf;
    private String regiaoAtendimento;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRegiaoAtendimento() {
        return regiaoAtendimento;
    }
    public void setRegiaoAtendimento(String regiaoAtendimento) {
        this.regiaoAtendimento = regiaoAtendimento;
    }

    // Construtores, getters e setters
}
