package com.test.saucedemo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import static com.test.saucedemo.utils.constantes.Constantes.URL;

@DefaultUrl(URL)
public class PaginaLoginDeUsuario extends PageObject {

        public static final Target TXT_PASSWORD = Target.the("Campo ingresar Clave").located(By.id("password"));
        public static final Target MSJ_LOCKED_USER = Target.the("Mensaje de usuario bloqueado").located(By.cssSelector("h3[data-test='error']"));
}
