package view;

import model.Usuario;
import java.util.Scanner;

public class LoginUsuarioView {

    Scanner in = new Scanner(System.in);

    public Usuario telaLogin() {
        Usuario user = new Usuario();
        System.out.println("\nLOGIN - USUÁRIO");
        System.out.print("E-mail: ");
        user.setEmail(in.nextLine());
        System.out.print("Senha: ");
        user.setSenha(in.nextLine());
        return user;
    }


}
