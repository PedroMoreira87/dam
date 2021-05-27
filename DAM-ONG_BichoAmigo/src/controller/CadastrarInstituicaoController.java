package controller;

import dao.InstituicaoDAO;
import model.Instituicao;
import view.CadastrarInstituicaoView;


public class CadastrarInstituicaoController {

    private CadastrarInstituicaoView civ;
    private Instituicao inst;
    private InstituicaoDAO iDAO;

    public CadastrarInstituicaoController() {
        civ = new CadastrarInstituicaoView();
        inst = civ.telaCadastro();

        CadastrarEnderecoController cec = new CadastrarEnderecoController();
        int idendereco = cec.getId();
        inst.setEndereco(idendereco);

        iDAO = new InstituicaoDAO();
        iDAO.create(inst);
    }

}
