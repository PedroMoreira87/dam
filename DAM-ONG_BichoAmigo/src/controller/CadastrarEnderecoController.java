package controller;


import dao.EnderecoDAO;
import model.Endereco;
import view.CadastrarEnderecoView;

public class CadastrarEnderecoController { // NAO É UTILIZADO

    private CadastrarEnderecoView cev;
    private Endereco endereco;
    private EnderecoDAO eDAO;
    private Integer id;

    public CadastrarEnderecoController() {
        cev = new CadastrarEnderecoView();
        endereco = cev.telaCadastro();

        eDAO = new EnderecoDAO();
        id = eDAO.create(endereco); // RETORNAR INT ID USER
    }

    public Integer getId() {
        return id;
    }
}
