package view;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarEnderecoView {

    public void telaListar(ResultSet rs){
        try{
            String leftAlignFormat = "| %-4d | %-10s | %-10s | %-12s | %-21s | %-6d |%n";

            System.out.println("                             TABELA DE ENDEREÇOS");
            System.out.format("+------+------------+------------+--------------+-----------------------+--------+%n");
            System.out.format("|  id  |   estado   |   cidade   |    bairro    |          rua          | numero |%n");
            System.out.format("+------+------------+------------+--------------+-----------------------+--------+%n");

            while(rs.next()){
                Integer id = rs.getInt("idendereco");
                String estado = rs.getString("estado");
                String cidade = rs.getString("cidade");
                String bairro = rs.getString("bairro");
                String rua = rs.getString("rua");
                Integer numero = rs.getInt("numero");

                System.out.format(leftAlignFormat, id, estado, cidade, bairro, rua, numero);
            }

            System.out.format("+------+------------+------------+--------------+-----------------------+--------+%n");
        }
        catch(SQLException ex) {
            System.out.println(ex);
        }
    }

}
