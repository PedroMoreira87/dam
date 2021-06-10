package dao;

import model.Instituicao;
import model.Palestrante;
import model.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    private String query;
    private PreparedStatement ps;
    private ResultSet rs;
    ConexaoBD con = ConexaoBD.getInstance();

    public ResultSet authUser(Usuario user) {
        try {
            query = "SELECT * FROM usuarios WHERE email = '" + user.getEmail() + "' AND senha = '" + user.getSenha() + "'";
            ps = con.getConexao().prepareStatement(query);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public ResultSet authInst(Instituicao inst) {
        try {
            query = "SELECT * FROM instituicoes WHERE email = '" + inst.getEmail() + "' AND senha = '" + inst.getSenha() + "'";
            ps = con.getConexao().prepareStatement(query);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public ResultSet authPales(Palestrante pales) {
        try {
            query = "SELECT * FROM palestrantes WHERE email = '" + pales.getEmail() + "' AND senha = '" + pales.getSenha() + "'";
            ps = con.getConexao().prepareStatement(query);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }



}
