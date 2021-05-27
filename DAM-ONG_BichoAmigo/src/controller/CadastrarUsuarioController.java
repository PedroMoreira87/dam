package controller;

import dao.UsuarioDAO;
import model.Usuario;
import view.CadastrarUsuarioView;

public class CadastrarUsuarioController {

    private CadastrarUsuarioView cuv;
    private Usuario user;
    private UsuarioDAO uDAO;

    public CadastrarUsuarioController() {
        cuv = new CadastrarUsuarioView();
        user = cuv.telaCadastro();

        CadastrarEnderecoController cec = new CadastrarEnderecoController();
        int idendereco = cec.getId();
        user.setEndereco(idendereco);

        uDAO = new UsuarioDAO();
        uDAO.create(user);
    }

}
