package view;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarInstituicaoView {

    public void telaListar(ResultSet rs){
        try{
            String leftAlignFormat = "| %-4d | %-45s | %-27s | %-13s | %-12s | %-11d |%n";

            System.out.println("                                                    TABELA DE INSTITUIÇÃO");
            System.out.format("+------+-----------------------------------------------+-----------------------------+---------------+--------------+-------------+%n");
            System.out.format("|  id  |                     nome                      |            email            |     senha     |   telefone   | fk_endereco |%n");
            System.out.format("+------+-----------------------------------------------+-----------------------------+---------------+--------------+-------------+%n");

            while(rs.next()){
                Integer id = rs.getInt("idinstituicao");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String senha = rs.getString("senha");
                String telefone = rs.getString("telefone");
                Integer endereco = rs.getInt("endereco_idendereco");

                System.out.format(leftAlignFormat, id, nome, email, senha, telefone, endereco);
            }

            System.out.format("+------+-----------------------------------------------+-----------------------------+---------------+--------------+-------------+%n");
        }
        catch(SQLException ex) {
            System.out.println(ex);
        }
    }

}

