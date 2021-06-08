package view;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarPalestraView {

    public void telaListar(ResultSet rs){
        try{
            String leftAlignFormat = "| %-4d | %-16s | %-27s | %-11s | %-12s | %-11d |%n";

            System.out.println("                                         TABELA DE PALESTRAS");
            System.out.format("+------+------------------+-----------------------------+-------------+--------------+-------------+%n");
            System.out.format("|  id  |       tema       |            horario            |    data    |   instituicao   | palestrante |%n");
            System.out.format("+------+------------------+-----------------------------+-------------+--------------+-------------+%n");

            while(rs.next()){
                Integer id = rs.getInt("idpalestra");
                String tema = rs.getString("tema");
                String horario = rs.getString("horario");
                String data = rs.getString("data");
                String instituicao = rs.getString("instituicao_idinstituicao");
                Integer palestrante = rs.getInt("palestrante_idpalestrante");

                System.out.format(leftAlignFormat, id, tema, horario, data, instituicao, palestrante);
            }

            System.out.format("+------+------------------+-----------------------------+-------------+--------------+-------------+%n");
        }
        catch(SQLException ex) {
            System.out.println(ex);
        }
    }

}
