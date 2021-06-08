package controller;

import dao.AdocaoDAO;
import view.ListarAdocaoView;
import java.sql.ResultSet;

public class ListarAdocaoController {

    private AdocaoDAO aDAO;
    private ResultSet rs;
    private ListarAdocaoView lav;

    public ListarAdocaoController() {

        aDAO = new AdocaoDAO();
        rs = aDAO.read();

        lav = new ListarAdocaoView();
        lav.telaListar(rs);

    }

}
