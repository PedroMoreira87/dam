package controller;

import dao.UsuarioDAO;
import view.ListarUsuarioView;
import java.sql.ResultSet;

public class ListarUsuarioController {

    private UsuarioDAO uDAO;
    private ResultSet rs;
    private ListarUsuarioView luv;

    public ListarUsuarioController(){

        uDAO = new UsuarioDAO();
        rs = uDAO.read();

        luv = new ListarUsuarioView();
        luv.telaListar(rs);

    }
}


