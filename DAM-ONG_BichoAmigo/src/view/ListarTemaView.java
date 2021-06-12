package view;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarTemaView {

    public void telaListar(ResultSet rs){
        try{
            String leftAlignFormat = "| %-4d | %-22s | %-11d |%n";

            System.out.println("                TABELA DE TEMA");
            System.out.format("+------+------------------------+-------------+%n");
            System.out.format("|  id  |         titulo         | palestrante |%n");
            System.out.format("+------+------------------------+-------------+%n");

            while(rs.next()){
                Integer id = rs.getInt("idtema");
                String titulo = rs.getString("titulo");
                Integer palestrante = rs.getInt("palestrantes_idpalestrante");

                System.out.format(leftAlignFormat, id, titulo, palestrante);
            }

            System.out.format("+------+------------------------+-------------+%n");
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

}
