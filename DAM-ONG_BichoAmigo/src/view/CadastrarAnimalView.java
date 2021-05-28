package view;

import model.Animal;
import java.util.Scanner;

public class CadastrarAnimalView {

    Scanner in = new Scanner(System.in);

    public Animal telaCadastro() {
        Animal animal = new Animal();
        System.out.println("ANIMAL");
        System.out.print("Nome: ");
        animal.setNome(in.nextLine() + "\n");
        System.out.print("Especie: ");
        animal.setEspecie(in.nextLine() + "\n");
        System.out.print("Raça: ");
        animal.setRaca(in.nextLine() + "\n");
        System.out.print("Detalhes: ");
        animal.setDetalhes(in.nextLine() + "\n");
        System.out.print("Idade: ");
        animal.setIdade(in.nextInt());
        return animal;
    }

}
