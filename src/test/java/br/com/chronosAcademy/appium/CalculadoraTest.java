package br.com.chronosAcademy.appium;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.sql.Driver;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void validarMultiplicacao() throws MalformedURLException {
        DriverFactory driverFactory = new DriverFactory();
        driverFactory.setCapabilities("Android", "ChronosMobile", "uiautomator2",
                "com.android.calculator2", "com.android.calculator2.Calculator");
        driverFactory.setDriver();
        driverFactory.getDriver().findElement(MobileBy.id("digit_7")).click();
        driverFactory.getDriver().findElement(MobileBy.id("op_add")).click();
        driverFactory.getDriver().findElement(MobileBy.id("digit_9")).click();
        driverFactory.getDriver().findElement(MobileBy.id("eq")).click();
        String resultado = driverFactory.getDriver().findElement(MobileBy.id("result")).getText();

        assertEquals("16", resultado);
        driverFactory.getDriver().quit();

    }
}
