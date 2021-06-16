package controller;

import dao.PalestraDAO;
import view.ListarPalestraView;
import java.sql.ResultSet;

public class ListarPalestraController {

    private PalestraDAO pDAO;
    private ResultSet rs;
    private ListarPalestraView lpv;

    public ListarPalestraController() {

        pDAO = new PalestraDAO();
        rs = pDAO.read();

        lpv = new ListarPalestraView();
        lpv.telaListar(rs);

    }

}
