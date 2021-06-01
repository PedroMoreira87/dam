package controller;

import view.MenuView;

public class MenuController {
    private MenuView menuView;
    private CadastrarUsuarioController cuc;
    private CadastrarInstituicaoController cic;
    private CadastrarPalestranteController cpc;
    private LoginController lc;

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
                ListarUsuarioController luc = new ListarUsuarioController();
                break;
            default:
                menuView.telaOpcaoInvalida();
                break;
        }
    }

    public void menuLoginController(int opc) {
        lc = new LoginController();
        switch(opc) {
            case 1:
                lc.loginUsuario();
                break;
            case 2:
                lc.loginInstituicao();
                break;
            case 3:
                lc.loginPalestrante();
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
