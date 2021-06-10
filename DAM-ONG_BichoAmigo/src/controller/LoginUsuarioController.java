package controller;

import dao.LoginDAO;
import model.Usuario;
import view.LoginUsuarioView;
import view.MenuAdmView;
import view.MenuUsuarioView;
import view.MenuView;

import java.awt.image.ImagingOpException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;

public class LoginUsuarioController {

    MenuView menuView = new MenuView();
    LoginUsuarioView luv = new LoginUsuarioView();
    LoginDAO lDAO = new LoginDAO();
    int idusuario;
    boolean sair = false;

    public LoginUsuarioController() {
        Usuario userLoginInput = luv.telaLogin();
        ResultSet rs = lDAO.authUser(userLoginInput);



        try {
            if(rs.next()) {
                idusuario = rs.getInt("idusuario");

                boolean isAdm = false;
                if(rs.getInt("adm") == 1)
                    isAdm = true;

                if(isAdm)
                {
                    while(!sair) {
                        menuAdmController();
                    }
                }
                else
                {
                    while(!sair) {
                        Integer idanimal = menuUsuarioController();

                        if (idanimal != null) {
                            new CadastrarAdocaoController(idusuario, idanimal);
                        }
                    }
                }
            }



        } catch (SQLException throwables) { throwables.printStackTrace(); }

    }

    public Integer menuUsuarioController() {
        MenuUsuarioView menuUsuarioView = new MenuUsuarioView();
        int opc = menuUsuarioView.telaMenu(); // Escolha do menu

        switch(opc) {
            case 1:
                new ListarAnimalController();
                return menuUsuarioView.menuAdotar(); // Escolha do animal
            case 0:
                sair = true;
                break;
            default:
                menuView.telaOpcaoInvalida();
                break;
        }

        return null;
    }

    public void menuAdmController() {
        MenuAdmView menuAdmView = new MenuAdmView();

        try {
            int opc = menuAdmView.telaMenu();

            switch (opc) {
                case 1:
                    new CadastrarAnimalController();
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    menuView.telaOpcaoInvalida();
                    break;
            }
        } catch (Exception ex) {
            menuView.telaOpcaoInvalida();
        }

    }
}