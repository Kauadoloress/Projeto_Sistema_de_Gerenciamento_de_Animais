package ProjetoSistemadeGerenciamentodeAnimais.Projeto_Sistema_de_Gerenciamento_de_Animais;

public class Leao extends Animal implements AnimalTerrestre {

    public Leao(String especie){
        super(especie);
    }

    public Leao(String especie, int idade){
      super(especie,idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Rugido!!!");
    }

    @Override
    public void locomover() {
        System.out.println("Correndo na savana!");
    }

    public void atacar(){
        System.out.println("Atacando com garras!");
    }
    public void atacar(String presa){
        System.out.println("Atacando " + presa);
    }

    @Override
    public String toString() {
        return especie + " REI DA SELVA!!\n" + idade + " anos";
    }
}
