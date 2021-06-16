package controller;

import dao.AnimalDAO;
import model.Animal;
import view.CadastrarAnimalView;

public class CadastrarAnimalController {

    private CadastrarAnimalView cav;
    private Animal animal;
    private AnimalDAO aDAO;
    private Integer id;

    public CadastrarAnimalController() {
        cav = new CadastrarAnimalView();
        animal = cav.telaCadastro();

        aDAO = new AnimalDAO();
        id = aDAO.create(animal);
    }

    public Integer getId() {
        return id;
    }

}
