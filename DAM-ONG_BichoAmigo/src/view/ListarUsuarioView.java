package view;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarUsuarioView {



    public void telaListar(ResultSet rs){

        try{
            while(rs.next()){
                System.out.println("id: " + rs.getInt("idusuario"));
                System.out.print("nome: " + rs.getString("nome") );
                System.out.print("email: " + rs.getString("email"));
                System.out.print("senha: " + rs.getString("senha"));
                System.out.print("telefone: " + rs.getString("telefone"));
                System.out.println();
            }
        }
        catch(SQLException ex) {
            System.out.println(ex);
        }
    }
}