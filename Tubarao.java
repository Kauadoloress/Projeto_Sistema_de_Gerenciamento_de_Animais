package ProjetoSistemadeGerenciamentodeAnimais.Projeto_Sistema_de_Gerenciamento_de_Animais;

public class Tubarao extends Animal implements AnimalAquatico {
    public Tubarao(String especie){
        super(especie);
    }

    public Tubarao(String especie, int idade){
        super(especie, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Glub glub!");
    }

    public void nadar(){
        System.out.println("Nadando em águas profundas!");
    }

    final void afundar(){
        System.out.println("Afundando no oceano...");
    }

    @Override
    public String toString() {
        return especie + " Rei dos Mares";
    }
}
