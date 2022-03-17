package com.test.saucedemo.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicioUsuario {

    public static final Target LBL_TEXTO_INICIO = Target.the("Texto de inicio").located(By.cssSelector(".title"));
    public static final Target BTN_MENU_BURGER = Target.the("Menu principal").located(By.id("react-burger-menu-btn"));
    public static final Target BTN_ADD_TO_CAR = Target.the("Botón carrito de compras").locatedBy("//div[@class='inventory_list']/div/div[2]/div[1]/a/div[.='{0}']//parent::a/parent::div/parent::div/div[2]/button");
    public static final Target BTN_SHOPPING_CAR = Target.the("Botón carrito de compras ").located(By.cssSelector(".shopping_cart_link"));
}
