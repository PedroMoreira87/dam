package view;

import java.util.Scanner;

public class MenuAdmView {

    Scanner in = new Scanner(System.in);

    public int telaMenu() {
        System.out.println("\nMENU ADMIN");
        System.out.println("(1) Adicionar animal");
        System.out.println("(2) Listar");
        System.out.println("(3) Inserir");
        System.out.println("(4) Deletar");
        System.out.println("(0) Sair");
        System.out.print("Opção: ");
        return in.nextInt();
    }

    public int telaMenuListar() {
        System.out.println("\nMENU ADMIN - LISTAR");
        System.out.println("(1) Listar Adoções");
        System.out.println("(2) Listar Animais");
        System.out.println("(3) Listar Endereços");
        System.out.println("(4) Listar Instituições");
        System.out.println("(5) Listar Palestras");
        System.out.println("(6) Listar Palestrantes");
        System.out.println("(7) Listar Usuários");
        System.out.println("(8) Listar Temas");
        System.out.println("(0) Sair");
        System.out.print("Opção: ");
        return in.nextInt();
    }

    public int telaMenuInserir() {
        System.out.println("\nMENU ADMIN - INSERIR");
        System.out.println("(1) Inserir Adoção (EM BREVE)");
        System.out.println("(2) Inserir Animal");
        System.out.println("(3) Inserir Endereço");
        System.out.println("(4) Inserir Instituição");
        System.out.println("(5) Inserir Palestra (EM BREVE)");
        System.out.println("(6) Inserir Palestrante");
        System.out.println("(7) Inserir Usuário");
        System.out.println("(8) Inserir Temas (EM BREVE)");
        System.out.println("(0) Sair");
        System.out.print("Opção: ");
        return in.nextInt();
    }

    public int telaMenuDeletar() {
        System.out.println("\nMENU ADMIN - DELETAR");
        System.out.println("(1) Deletar Adoção");
        System.out.println("(2) Deletar Animal");
        System.out.println("(3) Deletar Endereço");
        System.out.println("(4) Deletar Instituição");
        System.out.println("(5) Deletar Palestra");
        System.out.println("(6) Deletar Palestrante");
        System.out.println("(7) Deletar Usuário");
        System.out.println("(8) Deletar Tema");
        System.out.println("(0) Sair");
        System.out.print("Opção: ");
        return in.nextInt();
    }

    public int telaDeletarInput() {
        System.out.print("ID para deletar: ");
        return in.nextInt();
    }
}
