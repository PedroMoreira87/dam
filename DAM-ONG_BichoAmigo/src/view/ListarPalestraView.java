package view;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarPalestraView {

    public void telaListar(ResultSet rs){
        try{
            String leftAlignFormat = "| %-4d | %-7s | %-10s | %-11d | %-4d |%n";

            System.out.println("                TABELA DE PALESTRAS");
            System.out.format("+------+---------+------------+-------------+------+%n");
            System.out.format("|  id  | horario |    data    | instituicao | tema |%n");
            System.out.format("+------+---------+------------+-------------+------+%n");

            while(rs.next()){
                Integer id = rs.getInt("idpalestra");
                String horario = rs.getString("horario");
                String data = rs.getString("data");
                Integer instituicao = rs.getInt("instituicoes_idinstituicao");
                Integer tema = rs.getInt("temas_idtema");

                System.out.format(leftAlignFormat, id, horario, data, instituicao, tema);
            }

            System.out.format("+------+---------+------------+-------------+------+%n");
        }
        catch(SQLException ex) {
            System.out.println(ex);
        }
    }

}
