package view;

import java.util.Scanner;

public class MenuPalestranteView {

    Scanner in = new Scanner(System.in);

    public int telaMenu() {
        System.out.println("\nMENU PALESTRANTE");
        System.out.println("(1) Adicionar tema");
        System.out.println("(0) Sair");
        System.out.print("Opção: ");
        return in.nextInt();
    }

}
