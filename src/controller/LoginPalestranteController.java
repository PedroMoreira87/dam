package controller;

import dao.LoginDAO;
import model.Palestrante;
import view.LoginPalestranteView;
import view.MenuPalestranteView;
import view.MenuView;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginPalestranteController {

    MenuView menuView = new MenuView();
    LoginPalestranteView lpv = new LoginPalestranteView();
    LoginDAO lDAO = new LoginDAO();
    int idpalestrante;
    boolean sair = false;

    public LoginPalestranteController() {
        Palestrante palesLoginInput = lpv.telaLogin();
        ResultSet rs = lDAO.authPales(palesLoginInput);

        try {
            if(rs.next()) {
                while(!sair) {
                    idpalestrante = rs.getInt("idpalestrante");
                    menuPalestranteController(idpalestrante);
                }
            }

        } catch (SQLException throwables) { throwables.printStackTrace(); }
    }

    public void menuPalestranteController(int idpalestrante) {
        MenuPalestranteView menuPalestranteView = new MenuPalestranteView();
        int opc = menuPalestranteView.telaMenu();

        switch(opc) {
            case 1:
                new CadastrarTemaController(idpalestrante);
                break;
            case 0:
                sair = true;
                break;
            default:
                menuView.telaOpcaoInvalida();
                break;
        }
    }

}
