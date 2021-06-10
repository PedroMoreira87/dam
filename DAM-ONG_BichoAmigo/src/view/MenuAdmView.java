package view;

import java.util.Scanner;

public class MenuAdmView {

    Scanner in = new Scanner(System.in);

    public int telaMenu() {
        System.out.println("\nMENU ADMIN");
        System.out.println("(1) Adicionar animal");
        System.out.println("(2) Listar");
        System.out.println("(3) Inserir");
        System.out.println("(0) Sair");
        System.out.print("Opção: ");
        return in.nextInt();
    }

    public int telaMenuListar() {
        System.out.println("\nMENU LISTAR ADMIN");
        System.out.println("(1) Listar Adoção");
        System.out.println("(2) Listar Animal");
        System.out.println("(3) Listar Endereço");
        System.out.println("(4) Listar Instituição");
        System.out.println("(5) Listar Palestra");
        System.out.println("(6) Listar Palestrante");
        System.out.println("(7) Listar Usuário");
        System.out.println("(8) Listar Temas (EM BREVE)");
        System.out.println("(0) Sair");
        return in.nextInt();
    }

    public int telaMenuInserir() {
        System.out.println("\nMENU INSERIR ADMIN");
        System.out.println("(1) Inserir Adoção (EM BREVE)");
        System.out.println("(2) Inserir Animal");
        System.out.println("(3) Inserir Endereço");
        System.out.println("(4) Inserir Instituição");
        System.out.println("(5) Inserir Palestra (EM BREVE)");
        System.out.println("(6) Inserir Palestrante");
        System.out.println("(7) Inserir Usuário");
        System.out.println("(8) Inserir Temas (EM BREVE)");
        System.out.println("(0) Sair");
        return in.nextInt();
    }

}
