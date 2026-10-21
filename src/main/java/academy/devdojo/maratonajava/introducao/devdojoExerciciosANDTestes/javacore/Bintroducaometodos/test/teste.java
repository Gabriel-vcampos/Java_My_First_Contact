package academy.devdojo.maratonajava.introducao.devdojoExerciciosANDTestes.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.introducao.devdojoExerciciosANDTestes.javacore.Bintroducaometodos.dominio.Pessoa;

public class teste {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        pessoa.definirPessoa("Gabriel",30,4326.76,"000-123-873-90","Programador");
        pessoa2.definirPessoa("Fernanda",25,3173.23,"030-287-653-60","Analista financeiro Junior");
        pessoa.imprimir();
        pessoa2.imprimir();

    }
}
