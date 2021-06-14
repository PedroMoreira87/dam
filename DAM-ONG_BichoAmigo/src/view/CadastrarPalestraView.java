package view;

import model.Palestra;
import java.util.Scanner;

public class CadastrarPalestraView {

    Scanner in = new Scanner(System.in);

    public Palestra telaCadastro() {
        Palestra palestra = new Palestra();
        System.out.println("\nCADASTRO - PALESTRA");
        System.out.print("Data: ");
        palestra.setData(in.nextLine());
        System.out.print("Horário: ");
        palestra.setHorario(in.nextLine());
        return palestra;
    }

}
