package view;

import java.util.Scanner;

public class MenuInstituicaoView {

    Scanner in = new Scanner(System.in);

    public int telaMenu() {
        System.out.println("\nMENU INSTITUIÇÃO");
        System.out.println("(1) Agendar palestra");
        System.out.println("(0) Sair");
        System.out.println("Opção: ");
        return in.nextInt();
    }

    public int menuAgendarPalestra() {
        System.out.print("Id do palestrante: ");
        return in.nextInt();
    }

    public int menuEscolherTema() {
        System.out.print("Id to tema: ");
        return in.nextInt();
    }
}
