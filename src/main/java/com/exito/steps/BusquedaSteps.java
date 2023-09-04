package com.exito.steps;

import com.exito.PageObject.BusquedaPage;
import com.exito.models.Datos;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class BusquedaSteps {
    @Page
    BusquedaPage busquedaPage;

    @Step("Abrir el navegador")
    public void abrirNavegador(){
        busquedaPage.openUrl("https://www.exito.com/");
    }
    @Step("Buscar Producto")
    public void BuscarProducto(){
        String producto = Datos.data().get(0).get("Producto");

        busquedaPage.getDriver().findElement(busquedaPage.getTxtProducto()).clear();

        //Envia el producto
        busquedaPage.getDriver().findElement(busquedaPage.getTxtProducto())
                .sendKeys(producto);

        //Click en el buscador
        busquedaPage.getDriver().findElement(busquedaPage.getBtnBusqueda()).click();
    }

    @Step("Clic en el nombre del Producto")
    public void clicNombreProducto(){
        busquedaPage.getDriver().findElement(busquedaPage.getTxtProductoBuscado()).click();
    }
}
