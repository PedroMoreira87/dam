package controller;

import dao.UsuarioDAO;
import model.Usuario;
import view.CadastrarUsuarioView;

public class CadastrarUsuarioController {

    private CadastrarUsuarioView cuv;
    private Usuario user;
    private UsuarioDAO uDAO;
    private Integer id;

    public CadastrarUsuarioController() {
        cuv = new CadastrarUsuarioView();
        user = cuv.telaCadastro();

        CadastrarEnderecoController cec = new CadastrarEnderecoController();
        Integer idendereco = cec.getId();
        user.setEndereco(idendereco);

        uDAO = new UsuarioDAO();
        id = uDAO.create(user);
    }

    public Integer getId() {
        return id;
    }

}
