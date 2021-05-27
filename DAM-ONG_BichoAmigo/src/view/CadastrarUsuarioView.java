package view;

import model.Usuario;
import java.util.Scanner;

public class CadastrarUsuarioView {

    Scanner in = new Scanner(System.in);

    public Usuario telaCadastro() {
        Usuario user = new Usuario();
        System.out.println("USUÁRIO");
        System.out.print("Nome: ");
        user.setNome(in.nextLine() + "\n");
        System.out.print("E-mail: ");
        user.setEmail(in.nextLine() + "\n");
        System.out.print("Senha: ");
        user.setSenha(in.nextLine() + "\n");
        System.out.print("Telefone: ");
        user.setTelefone(in.nextLine() + "\n");
        return user;
    }

}
