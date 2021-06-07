package controller;

import dao.LoginDAO;
import model.Usuario;
import view.LoginUsuarioView;
import view.MenuUsuarioView;
import view.MenuView;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginUsuarioController {

    MenuView menuView = new MenuView();
    LoginUsuarioView luv = new LoginUsuarioView();
    LoginDAO lDAO = new LoginDAO();
    int idusuario;

    public LoginUsuarioController() {
        Usuario userLoginInput = luv.telaLogin();
        ResultSet rs = lDAO.authUser(userLoginInput);

        try {
            if(rs.next()) {
                idusuario = rs.getInt("idusuario");
                Integer idanimal = menuUsuarioController();

                if(idanimal != null)
                {
                    new CadastrarAdocaoController(idusuario, idanimal);
                }
            }

        } catch (SQLException throwables) { throwables.printStackTrace(); }

    }

    public Integer menuUsuarioController() {
        MenuUsuarioView menuUsuarioView = new MenuUsuarioView();
        int opc = menuUsuarioView.telaMenu();

        switch(opc) {
            case 1:
                new ListarAnimalController();
                return menuUsuarioView.menuAdotar(); // ID do animal
            case 0:
                break;
            default:
                menuView.telaOpcaoInvalida();
                break;
        }

        return null;
    }

}
