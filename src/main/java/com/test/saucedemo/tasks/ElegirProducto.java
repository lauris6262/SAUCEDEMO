package com.test.saucedemo.tasks;

import com.test.saucedemo.models.CompraProductoModel;
import com.test.saucedemo.userinterfaces.PaginaInicioUsuario;
import io.cucumber.java.sk.Tak;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.saucedemo.userinterfaces.PaginaInicioUsuario.BTN_ADD_TO_CAR;
import static com.test.saucedemo.userinterfaces.PaginaInicioUsuario.BTN_SHOPPING_CAR;

public class ElegirProducto implements Task {

    private String producto;
    private String nombre;
    private String apellido;
    private String codigoPostal;

    public ElegirProducto(CompraProductoModel compraProducto) {
        this.producto = compraProducto.getProducto();
        this.nombre = compraProducto.getNombre();
        this.apellido = compraProducto.getApellido();
        this.codigoPostal = compraProducto.getCodigoPostal();
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_ADD_TO_CAR.of(producto)),
                Click.on(BTN_SHOPPING_CAR));

    }

    public static ElegirProducto deLaTienda(CompraProductoModel compraProducto) {
        return Tasks.instrumented(ElegirProducto.class, compraProducto);
    }
}
