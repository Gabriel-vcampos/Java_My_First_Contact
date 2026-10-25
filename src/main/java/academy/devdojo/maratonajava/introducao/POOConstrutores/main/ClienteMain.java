package academy.devdojo.maratonajava.introducao.POOConstrutores.main;

import academy.devdojo.maratonajava.introducao.POOConstrutores.entity.Cliente;

public class ClienteMain {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Maria");
        cliente.setIdade(26);

        System.out.println("Cliente: " + cliente.getNome() + " com idade de: " + cliente.getIdade());

        Cliente cliente2 = new Cliente("Gabriel",23);
        System.out.println("Cliente: " + cliente2.getNome() + " com idade de: " + cliente2.getIdade());
    }
}
