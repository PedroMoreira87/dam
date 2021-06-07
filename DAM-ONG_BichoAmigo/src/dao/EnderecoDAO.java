package dao;

import model.Endereco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EnderecoDAO {

    private String query;
    private PreparedStatement ps;
    private ResultSet rs;
    ConexaoBD con = ConexaoBD.getInstance();

    public Integer create(Endereco endereco) {  // RETORNA ID DO USER NA QUERY
        try {
            query = "INSERT INTO enderecos (estado, cidade, bairro, rua, numero) VALUES (?, ?, ?, ?, ?)";
            ps = con.getConexao().prepareStatement(query, ps.RETURN_GENERATED_KEYS);
            ps.setString(1, endereco.getEstado());
            ps.setString(2, endereco.getCidade());
            ps.setString(3, endereco.getBairro());
            ps.setString(4, endereco.getRua());
            ps.setInt(5, endereco.getNumero());
            // ps.setInt(5, user.getEndereco()); CRIAR ENDERECO SEPARADAMENTE


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
            query = "SELECT * FROM enderecos";
            ps = con.getConexao().prepareStatement(query);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

}
