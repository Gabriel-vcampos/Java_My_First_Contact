package academy.devdojo.maratonajava.introducao.devdojoExerciciosANDTestes.javacore.Aintroducaoclasses.domain.test;

import academy.devdojo.maratonajava.introducao.devdojoExerciciosANDTestes.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] Args){
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Civic";
        carro.modelo = "Honda";
        carro.ano = 2020;
        carro2.nome = "Gol";
        carro2.modelo = "Volksvagen";
        carro2.ano = 2014;

        System.out.println("O carro: " + carro.nome + " no modelo: " + carro.modelo + " do ano de: " + carro.ano + " está a Venda!");
        System.out.println("O carro: " + carro2.nome + " no modelo: " + carro2.modelo + " do ano de: " + carro2.ano + " está a Venda!");
    }
}
