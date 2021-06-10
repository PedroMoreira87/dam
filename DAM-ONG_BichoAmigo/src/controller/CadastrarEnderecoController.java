package controller;


import dao.EnderecoDAO;
import model.Endereco;
import view.CadastrarEnderecoView;

public class CadastrarEnderecoController {

    private CadastrarEnderecoView cev;
    private Endereco endereco;
    private EnderecoDAO eDAO;
    private Integer id;

    public CadastrarEnderecoController() {
        cev = new CadastrarEnderecoView();
        endereco = cev.telaCadastro();

        eDAO = new EnderecoDAO();
        id = eDAO.create(endereco);
    }

    public Integer getId() {
        return id;
    }
}
