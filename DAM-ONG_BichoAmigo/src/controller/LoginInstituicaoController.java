package controller;

import dao.LoginDAO;
import dao.TemaDAO;
import model.Instituicao;
import view.ListarTemaView;
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
    boolean sair = false;

    public LoginInstituicaoController() {
        Instituicao instLoginInput = liv.telaLogin();
        ResultSet rs = lDAO.authInst(instLoginInput);

        try {
            if(rs.next()) {
                while(!sair) {
                    idinstituicao = rs.getInt("idinstituicao");
                    Integer idtema = menuInstituicaoController();

                    if (idtema != null) {
                        new CadastrarPalestraController(idinstituicao, idtema);
                    }
                }
            }

        } catch (SQLException throwables) { throwables.printStackTrace(); }

    }

    public Integer menuInstituicaoController() {
        MenuInstituicaoView menuInstituicaoView = new MenuInstituicaoView();
        int opc = menuInstituicaoView.telaMenu();

        switch(opc) {
            case 1:
                TemaDAO tDAO = new TemaDAO();

                new ListarPalestranteController();
                int idpalestrante = menuInstituicaoView.menuAgendarPalestra();

                ResultSet rs2  = tDAO.read(idpalestrante);

                new ListarTemaView().telaListar(rs2);
                return menuInstituicaoView.menuEscolherTema();
            case 0:
                sair = true;
                break;
            default:
                menuView.telaOpcaoInvalida();
                break;
        }

        return null;
    }


}
