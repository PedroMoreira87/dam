package controller;

import dao.PalestraDAO;
import model.Palestra;
import view.CadastrarPalestraView;

public class CadastrarPalestraController {

    private CadastrarPalestraView cpv;
    private Palestra palestra;
    private PalestraDAO pDAO;

    public CadastrarPalestraController() {
        cpv = new CadastrarPalestraView();
        palestra = cpv.telaCadastro();

        CadastrarInstituicaoController cic = new CadastrarInstituicaoController();
        Integer idinstituicao = cic.getId();
        CadastrarPalestranteController cpc = new CadastrarPalestranteController();
        Integer idpalestrante = cpc.getId();

        palestra.setInstituicao(idinstituicao);
        palestra.setPalestrate(idpalestrante);

        pDAO = new PalestraDAO();
        pDAO.create(palestra);
    }

}
