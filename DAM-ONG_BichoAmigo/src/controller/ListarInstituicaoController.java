package controller;

import dao.InstituicaoDAO;
import view.ListarInstituicaoView;
import java.sql.ResultSet;

public class ListarInstituicaoController {

    private InstituicaoDAO iDAO;
    private ResultSet rs;
    private ListarInstituicaoView liv;

    public ListarInstituicaoController() {
        iDAO = new InstituicaoDAO();
        rs = iDAO.read();

        liv = new ListarInstituicaoView();
        liv.telaListar(rs);
    }

}
