package ProjetoSistemadeGerenciamentodeAnimais.Projeto_Sistema_de_Gerenciamento_de_Animais;

public class Onitorrinco extends Animal implements AnimalAquatico, AnimalTerrestre {

    public Onitorrinco(String especie){
        super(especie);
    }

    public Onitorrinco(String especie, int idade){
        super(especie, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Grunhinho estranho!");
    }

    @Override
    public void locomover() {
        System.out.println("Andando e nadando!");
    }

    @Override
    public void nadar() {
        System.out.println("Nadando como um mamífero aquático!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
