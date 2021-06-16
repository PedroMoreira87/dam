package dao;

import model.Tema;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TemaDAO {

    private String query;
    private PreparedStatement ps;
    private ResultSet rs;
    ConexaoBD con = ConexaoBD.getInstance();

    public Integer create(Tema tema) {  // RETORNA ID DO USER NA QUERY
        try {
            query = "INSERT INTO temas (titulo, palestrantes_idpalestrante) VALUES (?, ?)";
            ps = con.getConexao().prepareStatement(query, ps.RETURN_GENERATED_KEYS);
            ps.setString(1, tema.getTitulo());
            ps.setInt(2, tema.getPalestrante());

            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    int id = rs.getInt(1);
                    return id;
                }
            }

            ps.close();


        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public ResultSet read(int idpalestrante) {
        try {
            query = "SELECT * FROM temas WHERE palestrantes_idpalestrante = "+idpalestrante+"";
            ps = con.getConexao().prepareStatement(query);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public ResultSet read() {
        try {
            query = "SELECT * FROM temas";
            ps = con.getConexao().prepareStatement(query);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

}
