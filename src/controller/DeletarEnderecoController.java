package controller;

import dao.EnderecoDAO;
import view.MenuAdmView;

public class DeletarEnderecoController {

    MenuAdmView menuAdmView = new MenuAdmView();

    public DeletarEnderecoController() {
        new ListarEnderecoController();
        int id = menuAdmView.telaDeletarInput();
        EnderecoDAO eDAO = new EnderecoDAO();
        eDAO.delete(id);
    }

}
