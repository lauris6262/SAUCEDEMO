package com.test.saucedemo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/compra_producto.feature",
        glue = "com.test.saucedemo.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CompraProductoRunner {
}
