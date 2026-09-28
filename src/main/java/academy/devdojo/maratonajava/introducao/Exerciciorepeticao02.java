package academy.devdojo.maratonajava.introducao;

public class Exerciciorepeticao02 {
    public static void main(String[] args){
        int valorCarro = 5000;
        int valorParcela = valorCarro;
        for(int parcela = 1 ; valorParcela > 1000 ; parcela++){
            valorParcela = valorCarro / parcela;
            if(valorParcela <= 1000) {
                System.out.println("O carro ficou parcelado em: " + parcela + "x Sem juros! o valor da parcela ficou em: " + valorParcela);
            }
        }
    }
    
}
