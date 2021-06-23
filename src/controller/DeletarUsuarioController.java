package controller;

import dao.UsuarioDAO;
import view.MenuAdmView;

public class DeletarUsuarioController {

    MenuAdmView menuAdmView = new MenuAdmView();

    public DeletarUsuarioController() {
        new ListarUsuarioController();
        int id = menuAdmView.telaDeletarInput();
        UsuarioDAO uDAO = new UsuarioDAO();
        uDAO.delete(id);
    }

}
