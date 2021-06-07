package controller;

import dao.AdocaoDAO;
import model.Adocao;
import view.CadastrarAdocaoView;

public class CadastrarAdocaoController {

    private CadastrarAdocaoView cav;
    private Adocao adocao;
    private AdocaoDAO aDAO;
    private LoginUsuarioController luc;

    public CadastrarAdocaoController(int idusuario, int idanimal) {

        cav = new CadastrarAdocaoView();
        adocao = cav.telaCadastro();

        adocao.setUsuario(idusuario);
        adocao.setAnimal(idanimal);

        aDAO = new AdocaoDAO();
        aDAO.create(adocao);
    }
}
