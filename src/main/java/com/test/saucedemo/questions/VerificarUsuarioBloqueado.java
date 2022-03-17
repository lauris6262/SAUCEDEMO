package com.test.saucedemo.questions;

import com.test.saucedemo.userinterfaces.PaginaLoginDeUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarUsuarioBloqueado implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return PaginaLoginDeUsuario.MSJ_LOCKED_USER.resolveFor(actor).getText();
    }

    public static VerificarUsuarioBloqueado porMensaje() {
        return new VerificarUsuarioBloqueado();
    }
}
