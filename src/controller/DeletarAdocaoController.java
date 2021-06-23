package controller;

import dao.AdocaoDAO;
import view.MenuAdmView;

public class DeletarAdocaoController {

    MenuAdmView menuAdmView = new MenuAdmView();

    public DeletarAdocaoController() {
        new ListarAdocaoController();
        int id = menuAdmView.telaDeletarInput();
        AdocaoDAO aDAO = new AdocaoDAO();
        aDAO.delete(id);
    }

}
