package dao;

import model.Adocao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdocaoDAO {

    private String query;
    private PreparedStatement ps;
    private ResultSet rs;
    ConexaoBD con = ConexaoBD.getInstance();

    public void create(Adocao adocao) {
        try {
            query = "INSERT INTO adocoes (data, comentario, usuario_idusuario, animal_idanimal) VALUES (?, ?, ?, ?)";
            ps = con.getConexao().prepareStatement(query, ps.RETURN_GENERATED_KEYS);
            ps.setString(1, adocao.getData());
            ps.setString(2, adocao.getComentario());
            ps.setInt(3, adocao.getUsuario());
            ps.setInt(4, adocao.getAnimal());

            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public ResultSet read() {
        try {
            query = "SELECT * FROM adocoes";
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
            query = "DELETE FROM adocoes WHERE idadocao = "+id;
            ps = con.getConexao().prepareStatement(query);
            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
