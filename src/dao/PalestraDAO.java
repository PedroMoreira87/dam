package dao;

import model.Palestra;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PalestraDAO {

    private String query;
    private PreparedStatement ps;
    private ResultSet rs;
    ConexaoBD con = ConexaoBD.getInstance();

    public void create(Palestra palestra) {
        try {
            query = "INSERT INTO palestras (horario, data, instituicoes_idinstituicao, temas_idtema) VALUES (?, ?, ?, ?)";
            ps = con.getConexao().prepareStatement(query);
            ps.setString(1, palestra.getHorario());
            ps.setString(2, palestra.getData());
            ps.setInt(3, palestra.getInstituicao());
            ps.setInt(4, palestra.getTema());

            ps.executeUpdate();
            ps.close();


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ResultSet read() {
        try {
            query = "SELECT * FROM palestras";
            ps = con.getConexao().prepareStatement(query);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public void delete(int id) {
        try {
            query = "DELETE FROM palestras WHERE idpalestra = '"+id+"'";
            ps = con.getConexao().prepareStatement(query);
            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
