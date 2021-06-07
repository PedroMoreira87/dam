package view;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarAnimalView {

    public void telaListar(ResultSet rs){
        try{
            String leftAlignFormat = "| %-4d | %-16s | %-27s | %-11s | %-12s | %-11s |%n";

            System.out.println("                                         TABELA DE ANIMAIS");
            System.out.format("+------+------------------+-----------------------------+-------------+--------------+-------------+%n");
            System.out.format("|  id  |       Nome       |            Espécie          |    Raça     |   Idade      |  Detalhes   |%n");
            System.out.format("+------+------------------+-----------------------------+-------------+--------------+-------------+%n");

            while(rs.next()){
                Integer id = rs.getInt("idanimal");
                String nome = rs.getString("nome");
                String especie = rs.getString("especie");
                String raca = rs.getString("raca");
                String idade = rs.getString("idade");
                String detalhes = rs.getString("detalhes");

                System.out.format(leftAlignFormat, id, nome, especie, raca, idade, detalhes);
            }

            System.out.format("+------+------------------+-----------------------------+-------------+--------------+-------------+%n");
        }
        catch(SQLException ex) {
            System.out.println(ex);
        }
    }

}
