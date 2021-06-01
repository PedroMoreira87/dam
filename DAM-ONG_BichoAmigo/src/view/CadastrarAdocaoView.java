package view;

import model.Adocao;
import java.util.Scanner;

public class CadastrarAdocaoView {

    Scanner in = new Scanner(System.in);

    public Adocao telaCadastro() {
        Adocao adocao = new Adocao();
        System.out.println("\nADOÇÃO");
        System.out.print("Data: ");
        adocao.setData(in.nextLine());
        System.out.print("Comentário: ");
        adocao.setComentario(in.nextLine());
        return adocao;
    }

}
