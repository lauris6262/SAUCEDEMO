package com.test.saucedemo.questions;

import com.test.saucedemo.userinterfaces.PaginaCompraCompletada;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarCompra implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return PaginaCompraCompletada.MSJ_ORDER_COMPLETE.resolveFor(actor).getText();
    }

    public static VerificarCompra exitosa() {
        return new VerificarCompra();
    }
}
