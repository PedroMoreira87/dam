package view;

import model.Palestrante;
import java.util.Scanner;

public class CadastrarPalestranteView {

    Scanner in = new Scanner(System.in);

    public Palestrante telaCadastro() {
        Palestrante palestrante = new Palestrante();
        System.out.println("PALESTRANTE");
        System.out.print("Nome: ");
        palestrante.setNome(in.nextLine() + "\n");
        System.out.print("E-mail: ");
        palestrante.setEmail(in.nextLine() + "\n");
        System.out.print("Senha: ");
        palestrante.setSenha(in.nextLine() + "\n");
        System.out.print("Telefone: ");
        palestrante.setTelefone(in.nextLine() + "\n");
        return palestrante;
    }

}
