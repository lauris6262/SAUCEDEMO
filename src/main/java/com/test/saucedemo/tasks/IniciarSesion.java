package com.test.saucedemo.tasks;

import com.test.saucedemo.models.DatosLogin;
import javafx.scene.control.ButtonBar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.InputField;

import static com.test.saucedemo.userinterfaces.PaginaLoginDeUsuario.*;

public class IniciarSesion implements Task {

    private String usuario;
    private  String clave;

    public IniciarSesion(DatosLogin datosLogin) {
        this.usuario = datosLogin.getUsuario();
        this.clave = datosLogin.getClave();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Enter.theValue(usuario).into(InputField.withPlaceholder("Username")),
            Enter.theValue(clave).into(TXT_PASSWORD),
            Click.on(Button.withNameOrId("LOGIN")));
    }

    public static IniciarSesion enWeb(DatosLogin datosLogin){
        return Tasks.instrumented(IniciarSesion.class, datosLogin);
    }
}
