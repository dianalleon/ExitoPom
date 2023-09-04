package com.exito.PageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BusquedaPage extends PageObject {

    private final By txtProducto = By.xpath("//input[contains(@placeholder, \"Buscar en exito.com\")]");

    private final By btnBusqueda = By.xpath("//button[contains(@class,'vtex-store-components-3-x-searchBarIcon vtex-store-components-3-x-searchBarIcon--search flex items-center pointer bn bg-transparent outline-0 pv0 pl0 pr3')]//*[name()='svg']");
    private final By txtProductoBuscado = By.xpath("//span[normalize-space()='Ventilador Super Force Touch SAMURAI VE7731I2']");

    public By getTxtProducto() {
        return txtProducto;
    }

    public By getBtnBusqueda() { return btnBusqueda; }

    public By getTxtProductoBuscado() { return txtProductoBuscado; }
}
