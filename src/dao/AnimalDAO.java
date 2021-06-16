package dao;

import model.Animal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnimalDAO {

    private String query;
    private PreparedStatement ps;
    private ResultSet rs;
    ConexaoBD con = ConexaoBD.getInstance();

    public Integer create(Animal animal) {
        try {
            query = "INSERT INTO animais (nome, especie, raca, idade, detalhes) VALUES (?, ?, ?, ?, ?)";
            ps = con.getConexao().prepareStatement(query, ps.RETURN_GENERATED_KEYS);
            ps.setString(1, animal.getNome());
            ps.setString(2, animal.getEspecie());
            ps.setString(3, animal.getRaca());
            ps.setInt(4, animal.getIdade());
            ps.setString(5, animal.getDetalhes());

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
            query = "SELECT * FROM animais WHERE adotado = 0";
            ps = con.getConexao().prepareStatement(query);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public boolean update(int id) {

        try {
            query = "UPDATE animais SET adotado = 1 WHERE idanimal = '"+id+"'";
            ps = con.getConexao().prepareStatement(query);
            ps.executeUpdate();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }

    public void delete(int id) {
        try {
            query = "DELETE FROM animais WHERE idanimal = '"+id+"'";
            ps = con.getConexao().prepareStatement(query);
            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
