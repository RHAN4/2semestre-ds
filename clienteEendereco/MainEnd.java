package clienteEendereco;

public class MainEnd {
    public static void main(String[] args) {
        ClienteEnd cliente = new ClienteEnd("Maria", "maria@gmail.com", 
        new Endereco("Rua V", "85", "Salvador"));

        System.out.println(cliente.toString());
    }
}
