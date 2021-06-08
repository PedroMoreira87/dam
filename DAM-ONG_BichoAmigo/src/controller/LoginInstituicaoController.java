package controller;

import dao.LoginDAO;
import model.Instituicao;
import view.LoginInstituicaoView;
import view.MenuInstituicaoView;
import view.MenuView;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginInstituicaoController {

    MenuView menuView = new MenuView();
    LoginInstituicaoView liv = new LoginInstituicaoView();
    LoginDAO lDAO = new LoginDAO();
    int idinstituicao;

    public LoginInstituicaoController() {
        Instituicao instLoginInput = liv.telaLogin();
        ResultSet rs = lDAO.authInst(instLoginInput);

        try {
            if(rs.next()) {
                idinstituicao = rs.getInt("idinstituicao");
                Integer ispalestrante = menuInstituicaoController();

                if(ispalestrante != null)
                {
                    new CadastrarPalestraController(idinstituicao, ispalestrante);
                }
            }

        } catch (SQLException throwables) { throwables.printStackTrace(); }

    }

    public Integer menuInstituicaoController() {
        MenuInstituicaoView menuInstituicaoView = new MenuInstituicaoView();
        int opc = menuInstituicaoView.telaMenu();

        switch(opc) {
            case 1:
                new ListarPalestranteController();
                return menuInstituicaoView.menuAgendarPalestra();
            case 0:
                break;
            default:
                menuView.telaOpcaoInvalida();
                break;
        }

        return null;
    }


}
