package controller;

import dao.AnimalDAO;
import view.ListarAnimalView;

import java.sql.ResultSet;

public class ListarAnimalController {

    private AnimalDAO aDAO;
    private ResultSet rs;
    private ListarAnimalView lav;

    public ListarAnimalController(){

        aDAO = new AnimalDAO();
        rs = aDAO.read();

        lav = new ListarAnimalView();
        lav.telaListar(rs);

    }

}
