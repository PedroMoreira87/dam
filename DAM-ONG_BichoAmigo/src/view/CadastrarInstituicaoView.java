package view;

import model.Instituicao;
import java.util.Scanner;

public class CadastrarInstituicaoView {

    Scanner in = new Scanner(System.in);

    public Instituicao telaCadastro() {
        Instituicao inst = new Instituicao();
        System.out.println("\nCADASTRO - INSTITUIÇÃO");
        System.out.print("Nome: ");
        inst.setNome(in.nextLine());
        System.out.print("E-mail: ");
        inst.setEmail(in.nextLine());
        System.out.print("Senha: ");
        inst.setSenha(in.nextLine());
        System.out.print("Telefone: ");
        inst.setTelefone(in.nextLine());
        return inst;
    }

}
