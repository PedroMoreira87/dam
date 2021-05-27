package view;

import java.util.Scanner;

public class MenuView {
    Scanner in = new Scanner(System.in);

    public int telaDeMenu() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("(1) Logar");
        System.out.println("(2) Cadastrar");
        System.out.println("(0) Sair");
        System.out.print("Opção: ");
        return in.nextInt();
    }

    public int telaLogin() {
        return in.nextInt();
    }

    public int telaCadastro() {
        System.out.println("MENU CADASTRO");
        System.out.println("(1) Cadastrar usuário");
        System.out.println("(2) Cadastrar instituição");
        System.out.println("(3) Cadastrar palestrante");
        System.out.println("(0) Sair");
        System.out.print("Opção: ");
        return in.nextInt();
    }

    public void telaOpcaoInvalida(){
        System.out.println("***Opção Inválida***");
    }

}
