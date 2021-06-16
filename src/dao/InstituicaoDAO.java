package dao;

import model.Instituicao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InstituicaoDAO {

    private String query;
    private PreparedStatement ps;
    private ResultSet rs;
    ConexaoBD con = ConexaoBD.getInstance();

    public Integer create(Instituicao inst) {  // RETORNA ID DO USER NA QUERY
        try {
            query = "INSERT INTO instituicoes (nome, email, senha, telefone, endereco_idendereco) VALUES (?, ?, ?, ?, ?)";
            ps = con.getConexao().prepareStatement(query, ps.RETURN_GENERATED_KEYS);
            ps.setString(1, inst.getNome());
            ps.setString(2, inst.getEmail());
            ps.setString(3, inst.getSenha());
            ps.setString(4, inst.getTelefone());
            ps.setInt(5, inst.getEndereco());

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

    public ResultSet read() {
        try {
            query = "SELECT * FROM instituicoes";
            ps = con.getConexao().prepareStatement(query);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
