package veiculosEcliente;

public class Cliente {
    private String nome;
    private String idade;
    private String CPF;
    private String endereco;
    private String telefone;

    public Cliente() {
    }

    public Cliente(String nome, String idade, String CPF, String endereco, String telefone) {
        this.nome = nome;
        this.idade = idade;
        CPF = CPF;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", idade=" + idade + ", CPF=" + CPF + ", endereco=" + endereco + ", telefone="
                + telefone + "]";
    }
}

    