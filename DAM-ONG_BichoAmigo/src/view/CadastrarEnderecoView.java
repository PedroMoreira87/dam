package view;

import model.Endereco;
import java.util.Scanner;

public class CadastrarEnderecoView {

    Scanner in = new Scanner(System.in);

    public Endereco telaCadastro() {
        Endereco endereco = new Endereco();
        System.out.println("\nENDEREÇO");
        System.out.print("Estado: ");
        endereco.setEstado(in.nextLine() + "\n");
        System.out.print("Cidade: ");
        endereco.setCidade(in.nextLine() + "\n");
        System.out.print("Bairro: ");
        endereco.setBairro(in.nextLine() + "\n");
        System.out.print("Rua: ");
        endereco.setRua(in.nextLine() + "\n");
        System.out.print("Número: ");
        endereco.setNumero(in.nextInt());
        return endereco;
    }

}
