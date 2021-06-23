package controller;

import dao.PalestraDAO;
import view.MenuAdmView;

public class DeletarPalestraController {

    MenuAdmView menuAdmView = new MenuAdmView();


    public DeletarPalestraController() {
        new ListarPalestraController();
        int id = menuAdmView.telaDeletarInput();
        PalestraDAO pDAO = new PalestraDAO();
        pDAO.delete(id);
    }

}
