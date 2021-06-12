package controller;

import dao.TemaDAO;
import view.ListarTemaView;

import java.sql.ResultSet;

public class ListarTemaController {

    private TemaDAO tDAO;
    private ResultSet rs;
    private ListarTemaView ltv;

    public ListarTemaController() {
        tDAO = new TemaDAO();
        rs = tDAO.read();

        ltv = new ListarTemaView();
        ltv.telaListar(rs);

    }


}
