package ProjetoSistemadeGerenciamentodeAnimais.Projeto_Sistema_de_Gerenciamento_de_Animais;

public class Main {
    public static void main(String[] args) {
        Leao leao = new Leao("Leão", 5);
        Tubarao tubarao = new Tubarao("Tubarão");
        Onitorrinco onitorrinco= new Onitorrinco("Onitorrinco", 3);


        System.out.println(leao);
        leao.emitirSom();
        leao.atacar();
        leao.atacar("Elefante");
        leao.locomover();
        leao.morte();
        System.out.println("-------------------");
        System.out.println( tubarao.toString());
        tubarao.emitirSom();
        tubarao.nadar();
        tubarao.afundar();
        tubarao.morte();
        System.out.println("-------------------");
        System.out.println( onitorrinco.toString());
        onitorrinco.emitirSom();
        onitorrinco.nadar();
        onitorrinco.locomover();
        onitorrinco.morte();

    }

}
