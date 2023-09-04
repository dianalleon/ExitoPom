package com.exito.stepDefinitions;

import com.exito.steps.BusquedaSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class busquedaStepDefinitions {

    @Steps
    BusquedaSteps busqueda;

    @Dado("que el usuario abre la pagina de exito")
    public void queElUsuarioAbreLaPaginaDeExito() {
        busqueda.abrirNavegador();
    }

    @Cuando("el usuario ingresa su producto que desea buscar")
    public void elUsuarioIngresaSuProductoQueDeseaBuscar(DataTable dataTable) {
        busqueda.BuscarProducto();
    }

    @Cuando("da click en el nombre del producto")
    public void daClickEnElNombreDelProducto() {
        busqueda.clicNombreProducto();
    }

    @Entonces("el usuario podra visualizar un mensaje con la informacion del producto")
    public void elUsuarioPodraVisualizarUnMensajeConLaInformacionDelProducto() {
        //muestra la información del producto
    }

}
