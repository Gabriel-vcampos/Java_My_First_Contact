package academy.devdojo.maratonajava.introducao.Module03;

public class Exercicio05 {
    public static void main(String[] args){
        String[] nome_produto = {"Camiseta", "Calça", "Tênis", "Boné", "Meia"};
        int[] quantidade_estoque = {10,5,3,0,20};
        double[] preco_produto = {49.90, 129.90, 299.90 , 39.90 , 9.90};
        double valor_total = 0;
        double maior_valor_total = valor_total;
        int menor_quantidade = quantidade_estoque[0];
        int posicao_maior_valor_total = 0;
        int posicao_menor_quantidade = 0;
        double soma_valor_total = valor_total;
        double soma_preco_produtos = 0;


        System.out.println("--------------------------------------------------------");
        System.out.println("                Controle de Estoques                    ");
        System.out.println("--------------------------------------------------------");
        for(int i = 0; i < nome_produto.length; i++ ){

            //Pequena funcionalidade para Calcular o valor total do estoque de cada produto
            valor_total = quantidade_estoque[i] * preco_produto[i];
            if(quantidade_estoque[i] == 0){
                System.out.println("Produto: " + nome_produto[i] + " \n" +  "Valor total do estoque: " + valor_total + "\nAVISO!!" + "\nEle se encontra com Estoque Zerado!");
                System.out.println("--------------------------------------------------------");
            } else {
                System.out.println("Produto: " + nome_produto[i] + " \n" +  "Valor total do estoque: " + valor_total);
                System.out.println("--------------------------------------------------------");
            }

            //Pequena funcionalidade para calcular o maior valor total em estoque de um produto e imprimir esse produto
            if(valor_total > maior_valor_total){
                posicao_maior_valor_total = i;
                maior_valor_total = valor_total;
            }

            //Pequena funcionalidade para calcular o produto com menor quantidade em estoque
            if(quantidade_estoque[i] < menor_quantidade){
                posicao_menor_quantidade = i;
                menor_quantidade = quantidade_estoque[i];
            }

            //Funcionalidade para ter a soma de todos os produtos para obtermos a média
            soma_preco_produtos += preco_produto[i];

            //Funcionalidade para ter a soma de todos os valores totais dos produtos em estoque
            soma_valor_total += valor_total;


        }
        System.out.println("O produto com maior valor total em estoque é o/a:" + nome_produto[posicao_maior_valor_total] + " com o valor total de: " + maior_valor_total);
        System.out.println("O produto com menor quantidade em estoque é o/a:" + nome_produto[posicao_menor_quantidade] + " com a quantidade em estoque: " + quantidade_estoque[posicao_menor_quantidade]);
        System.out.println("A média de preço de todos os produtos em estoque é: " + soma_preco_produtos / preco_produto.length);
        System.out.println("A soma de todos os valores totais de todos os produtos em estoque é: " + soma_valor_total);
    }
}
