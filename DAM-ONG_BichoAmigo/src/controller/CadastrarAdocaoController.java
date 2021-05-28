package controller;

import dao.AdocaoDAO;
import model.Adocao;
import view.CadastrarAdocaoView;

public class CadastrarAdocaoController {

    private CadastrarAdocaoView cav;
    private Adocao adocao;
    private AdocaoDAO aDAO;

    public CadastrarAdocaoController() {
        cav = new CadastrarAdocaoView();
        adocao = cav.telaCadastro();

        CadastrarUsuarioController cuc = new CadastrarUsuarioController();
        Integer idusuario = cuc.getId();
        CadastrarAnimalController cac = new CadastrarAnimalController();
        Integer idanimal = cac.getId();

        adocao.setUsuario(idusuario);
        adocao.setAnimal(idanimal);

        aDAO = new AdocaoDAO();
        aDAO.create(adocao);
    }
}
