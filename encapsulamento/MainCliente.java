package encapsulamento;

import veiculosEcliente.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        ClienteEN cliente = new ClienteEN();

        cliente.setNome("Marta");
        cliente.setEmail("marta@gmail.com");
        cliente.setSenha("123456");

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Senha: " + cliente.getSenha());

        ClienteEN cliente2 = new ClienteEN("José", "jose@gmail.com", "7891011");
        System.out.println(cliente2.toString());

        ClienteEN cliente3 = new ClienteEN("Maria", "maria@gmail.com", "12131415");
        System.out.println(cliente3.toString());
    }

}
