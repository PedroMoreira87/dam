package view;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarEnderecoView {

    public void telaListar(ResultSet rs){

        try{
            while(rs.next()){
                System.out.println("id: " + rs.getInt("idendereco"));
                System.out.println("estado: " + rs.getString("estado") );
                System.out.println("cidade: " + rs.getString("cidade"));
                System.out.println("bairro: " + rs.getString("bairro"));
                System.out.println("rua: " + rs.getString("rua"));
                System.out.println("numero: " + rs.getInt("numero"));
                System.out.println();
            }
        }
        catch(SQLException ex) {
            System.out.println(ex);
        }
    }
}
