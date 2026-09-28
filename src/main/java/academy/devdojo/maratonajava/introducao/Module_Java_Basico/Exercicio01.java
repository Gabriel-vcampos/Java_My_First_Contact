package academy.devdojo.maratonajava.introducao.Module_Java_Basico;

public class Exercicio01 {
    public static void main(String[] args){
        String[] produtos = {"Arroz", "Feijão" , "Macarrão" , "Carne" , "Leite" , "Ovo"};
        int[] quantidade = {2,3,1,2,6,12};
        double[] preco_unitario = {25.90 , 8.50 , 4.20 , 45.00 , 5.30 , 0.80};
        double subtotal = 0;
        double total  = 0;
        double desconto = 0;
        double troco = 0;
        double cliente_dinheiro = 500;

        System.out.println("-----------------------------------------------------");
        System.out.println("               Sistema de Supermercado               ");
        System.out.println("-----------------------------------------------------");

        for(int i = 0 ; i < produtos.length ; i++){
            subtotal = preco_unitario[i] * quantidade[i];
            total += subtotal;
            System.out.println("Produto: " + produtos[i] + "\n Subtotal: " + subtotal);
            System.out.println("----------------------------------------------------- \n");
        }

        if(total >= 200){
            System.out.println("O total de todos os produtos foi: " + total + " sem desconto!");
            System.out.println("Valor acima de 200 reais, aplicando Desconto. . . \n");
            desconto = total * 0.1;
            total -= desconto;

            System.out.println("Valor Desconto: " + desconto + "\n");
            System.out.println("O total de todos os produtos foi: " + total + " com o desconto! \n");
            System.out.println("Dinheiro do cliente: " + cliente_dinheiro + "\n");
            System.out.println("Troco a entregar ao cliente:" + (cliente_dinheiro - total));

        } else {
            System.out.println("O total de todos os produtos foi: " + total + " sem desconto!");
            System.out.println("Dinheiro do cliente: " + cliente_dinheiro + "\n");
            System.out.println("Troco a entregar ao cliente:" + (cliente_dinheiro - total));
        }

    }
}
