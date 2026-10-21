package academy.devdojo.maratonajava.introducao.JavaIntermediary.Module04.Main.Exercicio04;

import academy.devdojo.maratonajava.introducao.JavaIntermediary.Module04.Entity.Exercicio04.Conta;

public class BancoImpressao {
    public void Imprimir(Conta cliente){
        System.out.println("----------------------------");
        System.out.println("\n");
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("Saldo: " + cliente.saldo);
    }
}
