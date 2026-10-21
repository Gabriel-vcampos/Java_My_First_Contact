package academy.devdojo.maratonajava.introducao.devdojoExerciciosANDTestes.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    public String nome;
    public int idade;
    public double salario;
    public String cpf;
    public String funcao;

    public void definirPessoa(String nome, int idade , double salario , String cpf , String funcao){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cpf = cpf;
        this.funcao = funcao;
    }

    public void imprimir(){
        System.out.println("--------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salario: " + this.salario);
        System.out.println("Função: " + this.funcao);
    }
}

