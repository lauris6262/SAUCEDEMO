package com.test.saucedemo.tasks;

import com.test.saucedemo.models.CompraProductoModel;
import com.test.saucedemo.userinterfaces.PaginaInformacionDeCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.InputField;

public class InformacionDeCompra implements Task {

    private String producto;
    private String nombre;
    private String apellido;
    private String codigoPostal;

    public InformacionDeCompra(CompraProductoModel compraProducto) {
        this.producto = compraProducto.getProducto();
        this.nombre = compraProducto.getNombre();
        this.apellido = compraProducto.getApellido();
        this.codigoPostal = compraProducto.getCodigoPostal();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(nombre).into(PaginaInformacionDeCompra.TXT_FIRSTNAME),
                Enter.theValue(apellido).into(PaginaInformacionDeCompra.TXT_LASTNAME),
                Enter.theValue(codigoPostal).into(PaginaInformacionDeCompra.TXT_POSTALCODE),
                Click.on(Button.withNameOrId("continue")));
    }

    public static InformacionDeCompra datosPersonales(CompraProductoModel compraProducto) {
        return Tasks.instrumented(InformacionDeCompra.class, compraProducto);
    }
}
