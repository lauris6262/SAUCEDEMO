package com.test.saucedemo.questions;

import com.test.saucedemo.userinterfaces.PaginaInformacionDeCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarNombre implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return PaginaInformacionDeCompra.MSJ_FIRST_NAME_REQUIRED.resolveFor(actor).getText();
    }

    public static VerificarNombre vacio() {
        return new VerificarNombre();
    }
}
