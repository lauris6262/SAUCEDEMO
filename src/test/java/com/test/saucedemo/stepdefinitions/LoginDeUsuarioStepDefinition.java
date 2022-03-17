package com.test.saucedemo.stepdefinitions;

import com.test.saucedemo.models.DatosLogin;
import com.test.saucedemo.questions.VerificarLogin;
import com.test.saucedemo.questions.VerificarUsuarioBloqueado;
import com.test.saucedemo.tasks.IniciarSesion;
import com.test.saucedemo.userinterfaces.PaginaLoginDeUsuario;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginDeUsuarioStepDefinition {

    WebDriver driver;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) se encuentra en la pagina web de saucedemo$")
    public void queLauraSeEncuentraEnLaPaginaWebDeSaucedemo(String usuario) {
        theActorCalled(usuario).can(BrowseTheWeb.with(driver)).wasAbleTo(Open.browserOn().the(PaginaLoginDeUsuario.class));
    }

    @Cuando("^ella se loguea en la pagina$")
    public void ellaSeLogueaEnLaPagina(List<DatosLogin> datosLogin) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.enWeb(datosLogin.get(0)));

    }

    @Entonces("^ella puede ver el titulo (.*)$")
    public void ellaPuedeVerElTituloProducts(String resultado) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarLogin.conElTexto(), Matchers.equalTo(resultado)));

    }


    @Entonces("^ella no puede ingresar y ve el mensaje (.*)$")
    public void ellaNoPuedeIngresarYVeElMensajeEpicSadfaceSorryThisUserHasBeenLockedOut(String mensaje) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarUsuarioBloqueado.porMensaje(), Matchers.equalTo(mensaje)));
    }


}
