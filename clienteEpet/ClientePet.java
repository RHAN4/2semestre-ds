package clienteEpet;

public class ClientePet {
    private String nome;
    private String email;
    private Pet pet;

    public ClientePet() {
    }

    public ClientePet(String nome, String email, Pet pet) {
        this.nome = nome;
        this.email = email;
        this.pet = pet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Pet getEndereco() {
        return pet;
    }

    public void setEndereco(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "\n\nCliente \nNome: " + nome + "\nEmail: " + email + "\nPet: " + pet;
    }
}
