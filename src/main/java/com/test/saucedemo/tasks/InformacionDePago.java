package com.test.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.Button;

public class InformacionDePago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Button.withNameOrId("finish")));
    }

    public static InformacionDePago deLaCompra() {
        return Tasks.instrumented(InformacionDePago.class);
    }
}
