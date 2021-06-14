package view;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarAdocaoView {

    public void telaListar(ResultSet rs){
        try{
            String leftAlignFormat = "| %-4d | %-10s | %-22s | %-11d | %-11d |%n";

            System.out.println("                            TABELA DE ADOÇÕES");
            System.out.format("+------+------------+------------------------+-------------+-------------+%n");
            System.out.format("|  ID  |    Data    |       Comentário       | FK_Usuário  |  FK_Animal  |%n");
            System.out.format("+------+------------+------------------------+-------------+-------------+%n");

            while(rs.next()){
                Integer id = rs.getInt("idadocao");
                String data = rs.getString("data");
                String comentario = rs.getString("comentario");
                int usuario = rs.getInt("usuario_idusuario");
                int animal = rs.getInt("animal_idanimal");

                System.out.format(leftAlignFormat, id, data, comentario, usuario, animal);
            }

            System.out.format("+------+------------+------------------------+-------------+-------------+%n");
        }
        catch(SQLException ex) {
            System.out.println(ex);
        }
    }

}
