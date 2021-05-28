package dao;

import model.Palestrante;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PalestranteDAO {

    private String query;
    private PreparedStatement ps;
    private ResultSet rs;
    ConexaoBD con = ConexaoBD.getInstance();

    public Integer create(Palestrante palestrante) {  // RETORNA ID DO USER NA QUERY
        try {
            query = "INSERT INTO palestrantes (nome, email, senha, telefone, endereco_idendereco) VALUES (?, ?, ?, ?, ?)";
            ps = con.getConexao().prepareStatement(query, ps.RETURN_GENERATED_KEYS);
            ps.setString(1, palestrante.getNome());
            ps.setString(2, palestrante.getEmail());
            ps.setString(3, palestrante.getSenha());
            ps.setString(4, palestrante.getTelefone());
            ps.setInt(5, palestrante.getEndereco());

            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    int id = rs.getInt(1);
                    return id;
                }
            }

            ps.close();


        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return null;
    }

    public ResultSet read() {
        try {
            query = "SELECT * FROM palestrantes";
            ps = con.getConexao().prepareStatement(query);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return null;
    }
}
