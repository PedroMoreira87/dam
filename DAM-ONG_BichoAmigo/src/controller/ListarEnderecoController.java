package controller;

import dao.EnderecoDAO;
import view.ListarEnderecoView;
import java.sql.ResultSet;

public class ListarEnderecoController {

    private EnderecoDAO eDAO;
    private ResultSet rs;
    private ListarEnderecoView lev;

    public ListarEnderecoController(){

        eDAO = new EnderecoDAO();
        rs = eDAO.read();

        lev = new ListarEnderecoView();
        lev.telaListar(rs);

    }
}

