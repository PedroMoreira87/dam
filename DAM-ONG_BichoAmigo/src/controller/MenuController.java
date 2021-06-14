package controller;

import view.MenuView;

public class MenuController {

    private MenuView menuView;

    public MenuController() {
        boolean quit = false;
        while(!quit) {
            menuView = new MenuView();
            int opc = menuView.telaDeMenu();

            switch (opc) {
                case 1:
                    menuLoginController(menuView.telaLogin());
                    break;
                case 2:
                    menuCadastroController(menuView.telaCadastro());
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    menuView.telaOpcaoInvalida();
                    break;
            }
        }
    }

    public void menuLoginController(int opc){


        switch(opc) {
            case 1:
                new LoginUsuarioController();
                break;
            case 2:
                new LoginInstituicaoController();
                break;
            case 3:
                new LoginPalestranteController();
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
                new CadastrarUsuarioController();
                break;
            case 2:
                new CadastrarInstituicaoController();
                break;
            case 3:
                new CadastrarPalestranteController();
                break;
            case 0:
                break;
            default:
                menuView.telaOpcaoInvalida();
                break;
        }
    }

}
