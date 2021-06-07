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
            query = "INSERT INTO palestras (tema, horario, data, instituicao_idinstituicao, palestrante_idpalestrante) VALUES (?, ?, ?, ?, ?)";
            ps = con.getConexao().prepareStatement(query);
            ps.setString(1, palestra.getTema());
            ps.setString(2, palestra.getHorario());
            ps.setString(3, palestra.getData());
            ps.setInt(4, palestra.getInstituicao());
            ps.setInt(5, palestra.getPalestrate());

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

}
