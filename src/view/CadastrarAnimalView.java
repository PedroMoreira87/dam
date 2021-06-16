package view;

import model.Animal;
import java.util.Scanner;

public class CadastrarAnimalView {

    Scanner in = new Scanner(System.in);

    public Animal telaCadastro() {
        Animal animal = new Animal();
        System.out.println("\nCADASTRO - ANIMAL");
        System.out.print("Nome: ");
        animal.setNome(in.nextLine());
        System.out.print("Especie: ");
        animal.setEspecie(in.nextLine());
        System.out.print("Raça: ");
        animal.setRaca(in.nextLine());
        System.out.print("Detalhes: ");
        animal.setDetalhes(in.nextLine());
        System.out.print("Idade: ");
        animal.setIdade(in.nextInt());
        return animal;
    }

}
