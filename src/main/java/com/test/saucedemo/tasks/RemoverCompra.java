package com.test.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.Button;

public class RemoverCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Button.withNameOrId("remove-sauce-labs-fleece-jacket")),
                Click.on(Button.withNameOrId("checkout")));
    }

    public static RemoverCompra personal() {

        return Tasks.instrumented(RemoverCompra.class);
    }
}
