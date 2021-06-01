package view;

import java.util.Scanner;

public class MenuView {
    Scanner in = new Scanner(System.in);

    public int telaDeMenu() {
        System.out.println("\nMENU PRINCIPAL");
        System.out.println("(1) Logar");
        System.out.println("(2) Cadastrar");
        System.out.println("(0) Sair");
        System.out.print("Opção: ");
        return in.nextInt();
    }

    public int telaLogin() {
        System.out.println("\nLOGIN - TIPO DE CONTA");
        System.out.println(("(1) Logar como usuário"));
        System.out.println(("(2) Logar como instituição"));
        System.out.println(("(3) Logar como palestrante"));
        System.out.println(("(0) Sair"));
        System.out.print("Opção: ");
        return in.nextInt();
    }

    public int telaCadastro() {
        System.out.println("\nMENU CADASTRO");
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
