package view;

import model.Palestrante;
import java.util.Scanner;

public class CadastrarPalestranteView {

    Scanner in = new Scanner(System.in);

    public Palestrante telaCadastro() {
        Palestrante palestrante = new Palestrante();
        System.out.println("\nPALESTRANTE");
        System.out.print("Nome: ");
        palestrante.setNome(in.nextLine());
        System.out.print("E-mail: ");
        palestrante.setEmail(in.nextLine());
        System.out.print("Senha: ");
        palestrante.setSenha(in.nextLine());
        System.out.print("Telefone: ");
        palestrante.setTelefone(in.nextLine());
        return palestrante;
    }

}
