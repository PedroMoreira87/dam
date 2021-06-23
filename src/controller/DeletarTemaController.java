package controller;

import dao.TemaDAO;
import view.MenuAdmView;

public class DeletarTemaController {

    MenuAdmView menuAdmView = new MenuAdmView();

    public DeletarTemaController() {
        new ListarTemaController();
        int id = menuAdmView.telaDeletarInput();
        TemaDAO tDAO = new TemaDAO();
        tDAO.delete(id);
    }

}
