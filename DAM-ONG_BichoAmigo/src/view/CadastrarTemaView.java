package view;

import model.Tema;

import java.util.Scanner;

public class CadastrarTemaView {

    Scanner in = new Scanner(System.in);

    public Tema telaCadastro() {
        Tema tema = new Tema();
        System.out.println("\nTEMA");
        System.out.print("Título: ");
        tema.setTitulo(in.nextLine());
        return tema;
    }

}
