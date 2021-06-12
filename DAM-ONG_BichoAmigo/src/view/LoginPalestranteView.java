package view;

import model.Palestrante;
import java.util.Scanner;

public class LoginPalestranteView {

    Scanner in = new Scanner(System.in);

    public Palestrante telaLogin() {
        Palestrante pales = new Palestrante();
        System.out.println("\nLOGIN - PALESTRANTE");
        System.out.print("E-mail: ");
        pales.setEmail(in.nextLine());
        System.out.print("Senha: ");
        pales.setSenha(in.nextLine());
        return pales;
    }

}
