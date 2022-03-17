package com.test.saucedemo.stepdefinitions;

import com.test.saucedemo.builders.CompraProductoBuilder;
import com.test.saucedemo.models.CompraProductoModel;
import com.test.saucedemo.questions.VerificarCompra;
import com.test.saucedemo.questions.VerificarNombre;
import com.test.saucedemo.tasks.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraProductoStepDefinition {


    @Cuando("compra el producto")
    public void compraElProducto(List<CompraProductoModel> compraProducto) {
        theActorInTheSpotlight().attemptsTo(ElegirProducto.deLaTienda(CompraProductoBuilder.
                        producto(compraProducto.get(0).getProducto()).
                        nombre(compraProducto.get(0).getNombre()).
                        apellido(compraProducto.get(0).getApellido()).
                        codigoPostal(compraProducto.get(0).getCodigoPostal())),
                CarroDeCompras.personal(), InformacionDeCompra.datosPersonales(
                        CompraProductoBuilder.producto(compraProducto.get(0).getProducto()).
                                nombre(compraProducto.get(0).getNombre()).
                                apellido(compraProducto.get(0).getApellido()).
                                codigoPostal(compraProducto.get(0).getCodigoPostal())),
                InformacionDePago.deLaCompra());
    }
    @Cuando("compra el producto e ingresa los datos de envio")
    public void compraElProductoEIngresaLosDatosDeEnvio(List<CompraProductoModel> compraProducto) {
        theActorInTheSpotlight().attemptsTo(ElegirProducto.deLaTienda(CompraProductoBuilder.
                        producto(compraProducto.get(0).getProducto()).
                        nombre(compraProducto.get(0).getNombre()).
                        apellido(compraProducto.get(0).getApellido()).
                        codigoPostal(compraProducto.get(0).getCodigoPostal())),
                CarroDeCompras.personal(), InformacionDeCompra.datosPersonales(
                        CompraProductoBuilder.producto(compraProducto.get(0).getProducto()).
                                nombre(compraProducto.get(0).getNombre()).
                                apellido(compraProducto.get(0).getApellido()).
                                codigoPostal(compraProducto.get(0).getCodigoPostal())));
    }
    @Cuando("adiciona productos pero los remueve")
    public void adicionaProductosPeroLosRemueve(List<CompraProductoModel> compraProducto) {
        theActorInTheSpotlight().attemptsTo(ElegirProducto.deLaTienda(CompraProductoBuilder.
                producto(compraProducto.get(0).getProducto()).
                nombre(compraProducto.get(0).getNombre()).
                apellido(compraProducto.get(0).getApellido()).
                codigoPostal(compraProducto.get(0).getCodigoPostal())),
                RemoverCompra.personal());
    }

    @Entonces("^ella puede ver el mensaje (.*)$")
    public void ellaPuedeVerElMensaje(String mensaje) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarCompra.exitosa(), Matchers.equalTo(mensaje)));
    }

    @Entonces("^ella puede ver el siguiente mensaje de error (.*)$")
    public void ellaPuedeVerElSiguienteMensajeDeErrorErrorFirstNameIsRequired(String mensaje) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarNombre.vacio(), Matchers.equalTo(mensaje)));
    }
}
