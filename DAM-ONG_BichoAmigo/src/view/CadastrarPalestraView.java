package view;

import model.Palestra;
import java.util.Scanner;

public class CadastrarPalestraView {

    Scanner in = new Scanner(System.in);

    public Palestra telaCadastro() {
        Palestra palestra = new Palestra();
        System.out.println("PALESTRA");
        System.out.print("Tema: ");
        palestra.setTema(in.nextLine() + "\n");
        System.out.print("Data: ");
        palestra.setData(in.nextLine() + "\n");
        System.out.print("Horário: ");
        palestra.setHorario(in.nextLine() + "\n");
        return palestra;
    }

}
