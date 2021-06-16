package controller;

import dao.TemaDAO;
import model.Tema;
import view.CadastrarTemaView;

public class CadastrarTemaController {

    private CadastrarTemaView ctv;
    private Tema tema;
    private TemaDAO tDAO;
    private Integer id;

    public CadastrarTemaController(int idpalestrante) {
        ctv = new CadastrarTemaView();
        tema = ctv.telaCadastro();

        tema.setPalestrante(idpalestrante);

        tDAO = new TemaDAO();
        id = tDAO.create(tema);
    }

    public Integer getId() {
        return id;
    }

}
