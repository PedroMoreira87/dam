package view;

import model.Instituicao;
import model.Palestrante;
import model.Usuario;
import java.util.Scanner;

public class LoginView {

    Scanner in = new Scanner(System.in);

    public Usuario telaLoginUsuario() {
        Usuario user = new Usuario();
        System.out.println("\nLOGIN - USUÁRIO");
        System.out.print("E-mail: ");
        user.setEmail(in.nextLine());
        System.out.print("Senha: ");
        user.setSenha(in.nextLine());
        return user;
    }

    public Instituicao telaLoginInstituicao() {
        Instituicao inst = new Instituicao();
        System.out.println("\nLOGIN - INSTITUIÇÃO");
        System.out.print("E-mail: ");
        inst.setEmail(in.nextLine());
        System.out.print("Senha: ");
        inst.setSenha(in.nextLine());
        return inst;
    }

    public Palestrante telaLoginPalestrante() {
        Palestrante pales = new Palestrante();
        System.out.println("\nLOGIN - PALESTRANTE");
        System.out.print("E-mail: ");
        pales.setEmail(in.nextLine());
        System.out.print("Senha: ");
        pales.setSenha(in.nextLine());
        return pales;
    }
}
