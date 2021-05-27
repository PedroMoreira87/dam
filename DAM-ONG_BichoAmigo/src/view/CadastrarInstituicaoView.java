package view;

import model.Instituicao;
import java.util.Scanner;

public class CadastrarInstituicaoView {


    Scanner in = new Scanner(System.in);

    public Instituicao telaCadastro() {
        Instituicao inst = new Instituicao();
        System.out.println("INSTITUIÇÃO");
        System.out.print("Nome: ");
        inst.setNome(in.nextLine() + "\n");
        System.out.print("E-mail: ");
        inst.setEmail(in.nextLine() + "\n");
        System.out.print("Senha: ");
        inst.setSenha(in.nextLine() + "\n");
        System.out.print("Telefone: ");
        inst.setTelefone(in.nextLine() + "\n");
        return inst;
    }

}
