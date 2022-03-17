package com.test.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInformacionDeCompra {

    public static final Target TXT_FIRSTNAME = Target.the("Campo ingresar nombre").located(By.id("first-name"));
    public static final Target TXT_LASTNAME = Target.the("Campo ingresar apellido").located(By.id("last-name"));
    public static final Target TXT_POSTALCODE = Target.the("Campo ingresar codigo postal").located(By.id("postal-code"));
    public static final Target MSJ_FIRST_NAME_REQUIRED = Target.the("Mensaje de nombre requerido").located(By.cssSelector("h3[data-test='error']"));

}