package controller;

import dao.PalestranteDAO;
import view.ListarPalestranteView;
import java.sql.ResultSet;

public class ListarPalestranteController {

    private PalestranteDAO pDAO;
    private ResultSet rs;
    private ListarPalestranteView lpv;

    public ListarPalestranteController() {

        pDAO = new PalestranteDAO();
        rs = pDAO.read();

        lpv = new ListarPalestranteView();
        lpv.telaListar(rs);

    }

}
