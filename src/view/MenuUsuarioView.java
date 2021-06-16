package view;

import java.util.Scanner;

public class MenuUsuarioView {

    Scanner in = new Scanner(System.in);

    public int telaMenu() {
        System.out.println("\nMENU USUÁRIO");
        System.out.println("(1) Adotar animal");
        System.out.println("(0) Sair");
        System.out.print("Opção: ");
        return in.nextInt();
    }

    public int menuAdotar() {
        System.out.print("ID do animal que deseja adotar: ");
        return in.nextInt();
    }
}
