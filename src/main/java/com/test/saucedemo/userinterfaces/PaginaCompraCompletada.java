package com.test.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCompraCompletada {

    public static final Target MSJ_ORDER_COMPLETE = Target.the("Mensaje de compra completada").located(By.cssSelector("h2[class='complete-header']"));
}
