package controller;

import view.MenuView;

import java.sql.SQLException;

public class MenuController {
    private MenuView menuView;
    private CadastrarUsuarioController cuc;
    private CadastrarInstituicaoController cic;
    private CadastrarPalestranteController cpc;
    private LoginUsuarioController luc;

    public MenuController() {
        menuView = new MenuView();
        int opc = menuView.telaDeMenu();

        switch(opc) {
            case 1:
                menuLoginController(menuView.telaLogin());
                break;
            case 2:
                menuCadastroController(menuView.telaCadastro());
                break;
            case 0:
                ListarAnimalController lac = new ListarAnimalController();
                break;
            default:
                menuView.telaOpcaoInvalida();
                break;
        }
    }

    public void menuLoginController(int opc){


        switch(opc) {
            case 1:
                luc = new LoginUsuarioController();
                break;
            case 2:
//                lc.loginInstituicao();
                break;
            case 3:
//                lc.loginPalestrante();
                break;
            case 0:
                break;
            default:
                menuView.telaOpcaoInvalida();
                break;
        }
    }

    public void menuCadastroController(int opc) {
        switch(opc) {
            case 1:
                cuc = new CadastrarUsuarioController();
                break;
            case 2:
                cic = new CadastrarInstituicaoController();
                break;
            case 3:
                cpc = new CadastrarPalestranteController();
                break;
            case 0:
                break;
            default:
                menuView.telaOpcaoInvalida();
                break;
        }
    }

}
