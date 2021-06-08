package controller;

import dao.PalestraDAO;
import model.Palestra;
import view.CadastrarPalestraView;

public class CadastrarPalestraController {

    private CadastrarPalestraView cpv;
    private Palestra palestra;
    private PalestraDAO pDAO;

    public CadastrarPalestraController(int idinstituicao, int idpalestrante) {
        cpv = new CadastrarPalestraView();
        palestra = cpv.telaCadastro();

        palestra.setInstituicao(idinstituicao);
        palestra.setPalestrate(idpalestrante);

        pDAO = new PalestraDAO();
        pDAO.create(palestra);
    }

}
