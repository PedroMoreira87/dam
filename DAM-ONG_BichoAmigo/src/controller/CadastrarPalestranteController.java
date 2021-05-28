package controller;

import dao.PalestranteDAO;
import model.Palestrante;
import view.CadastrarPalestranteView;

public class CadastrarPalestranteController {

    private CadastrarPalestranteView cpv;
    private Palestrante palestrante;
    private PalestranteDAO pDAO;
    private Integer id;

    public CadastrarPalestranteController() {
        cpv = new CadastrarPalestranteView();
        palestrante = cpv.telaCadastro();

        CadastrarEnderecoController cec = new CadastrarEnderecoController();
        int idendereco = cec.getId();
        palestrante.setEndereco(idendereco);

        pDAO = new PalestranteDAO();
        id = pDAO.create(palestrante);
    }

    public Integer getId() {
        return id;
    }

}
