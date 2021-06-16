package view;

import model.Instituicao;
import java.util.Scanner;

public class LoginInstituicaoView {

    Scanner in = new Scanner(System.in);

    public Instituicao telaLogin() {
        Instituicao inst = new Instituicao();
        System.out.println("\nLOGIN - INSTITUIÇÃO");
        System.out.print("E-mail: ");
        inst.setEmail(in.nextLine());
        System.out.print("Senha: ");
        inst.setSenha(in.nextLine());
        return inst;
    }

}
