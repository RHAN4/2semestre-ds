package clienteEpet;

public class MainPet {
    public static void main(String[] args) {
        ClientePet clientePet = new ClientePet("Mario", "mario@gmail.com", 
        new Pet("Lulu", 2, "Poodle"));

        System.out.println(clientePet.toString());
    }
}
