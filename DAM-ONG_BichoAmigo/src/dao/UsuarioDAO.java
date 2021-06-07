package dao;

import model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    private String query;
    private PreparedStatement ps;
    private ResultSet rs;
    ConexaoBD con = ConexaoBD.getInstance();

    public Integer create(Usuario user) {
        try {
            query = "INSERT INTO usuarios (nome, email, senha, telefone, endereco_idendereco) VALUES (?, ?, ?, ?, ?)";
            ps = con.getConexao().prepareStatement(query, ps.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getNome());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getSenha());
            ps.setString(4, user.getTelefone());
            ps.setInt(5, user.getEndereco());

            ps.executeUpdate();
            ps.close();


        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public ResultSet read() {
        try {
            query = "SELECT * FROM usuarios";
            ps = con.getConexao().prepareStatement(query);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

}
