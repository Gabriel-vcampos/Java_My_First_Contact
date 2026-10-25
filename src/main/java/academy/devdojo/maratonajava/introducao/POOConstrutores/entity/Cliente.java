package academy.devdojo.maratonajava.introducao.POOConstrutores.entity;

public class Cliente {
    private String nome;
    private int idade;

    public Cliente(){
        System.out.println("Cliente criado sem dados");
    }

    public Cliente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }
}
