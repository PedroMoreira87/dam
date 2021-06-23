package controller;

import dao.AnimalDAO;
import view.MenuAdmView;

import java.util.Scanner;

public class DeletarAnimalController {

    MenuAdmView menuAdmView = new MenuAdmView();

    public DeletarAnimalController() {
        new ListarAnimalController();
        int id = menuAdmView.telaDeletarInput();
        AnimalDAO a2DAO = new AnimalDAO();
        a2DAO.delete(id);
    }

}
