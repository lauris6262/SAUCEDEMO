package com.test.saucedemo.questions;


import com.test.saucedemo.userinterfaces.PaginaInicioUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class VerificarLogin implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PaginaInicioUsuario.LBL_TEXTO_INICIO).answeredBy(actor);
    }

    public static VerificarLogin conElTexto(){
        return new VerificarLogin();
    }
}
