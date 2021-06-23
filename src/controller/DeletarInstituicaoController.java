package controller;

import dao.InstituicaoDAO;
import view.MenuAdmView;

public class DeletarInstituicaoController {

    MenuAdmView menuAdmView = new MenuAdmView();

    public DeletarInstituicaoController() {
        new ListarInstituicaoController();
        int id = menuAdmView.telaDeletarInput();
        InstituicaoDAO iDAO = new InstituicaoDAO();
        iDAO.delete(id);
    }

}
