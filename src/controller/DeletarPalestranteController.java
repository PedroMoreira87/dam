package controller;

import dao.PalestranteDAO;
import view.MenuAdmView;

public class DeletarPalestranteController {

    MenuAdmView menuAdmView = new MenuAdmView();

    public DeletarPalestranteController() {
        new ListarPalestranteController();
        int id = menuAdmView.telaDeletarInput();
        PalestranteDAO p2DAO = new PalestranteDAO();
        p2DAO.delete(id);
    }

}
