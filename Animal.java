package ProjetoSistemadeGerenciamentodeAnimais.Projeto_Sistema_de_Gerenciamento_de_Animais;

public abstract class Animal {
    final String especie;
    int idade;

    public Animal(String especie){
        this.especie = especie;
    }
    public Animal(String especie, int idade){
        this(especie);
        this.idade = idade;
    }

    public abstract void emitirSom();

    public void morte(){
        System.out.println( especie + " morreu!");
    }

    public String toString(){
        return especie + "\n" + idade + " anos";
    }
}
