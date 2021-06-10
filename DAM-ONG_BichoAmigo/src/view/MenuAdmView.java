package view;

import java.util.Scanner;

public class MenuAdmView {

    Scanner in = new Scanner(System.in);

    public int telaMenu() {
        System.out.println("\nMENU ADMINISTRADOR");
        System.out.println("(1) Adicionar animal");
        System.out.println("(0) Sair");
        System.out.print("Opção: ");
        return in.nextInt();
    }

}
