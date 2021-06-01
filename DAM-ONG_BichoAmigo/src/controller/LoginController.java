package controller;

import model.Usuario;
import view.LoginView;

public class LoginController {

    LoginView lv = new LoginView();

    public void loginUsuario() {
        Usuario userLoginInput = lv.telaLoginUsuario();
        System.out.println(userLoginInput.getEmail());
        System.out.println(userLoginInput.getSenha());

    }

    public void loginInstituicao() {

    }

    public void loginPalestrante() {

    }

}
