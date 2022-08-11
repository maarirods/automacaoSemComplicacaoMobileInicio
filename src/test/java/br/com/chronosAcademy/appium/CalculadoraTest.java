package br.com.chronosAcademy.appium;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    DriverFactory driverFactory;

    @BeforeEach
    public void inicializarDriver() throws MalformedURLException {
        driverFactory = new DriverFactory();
        driverFactory.setCapabilities("Android", "ChronosMobile", "uiautomator2",
                "com.android.calculator2", "com.android.calculator2.Calculator");
        driverFactory.setDriver();
    }

    @AfterEach
    public void finalizaDriver(){
        driverFactory.getDriver().quit();
    }


    @Test
    public void validarMutiplicacao(){
        clickId("digit_7");
        clickId("op_mul");
        clickId("digit_9");
        clickId("eq");
        String resultado = driverFactory.getDriver().findElement(MobileBy.id("result")).getText();

        assertEquals("63", resultado);


    }

    @Test
    public void validarSoma(){
        clickId("digit_7");
        clickId("op_add");
        clickId("digit_9");
        clickId("eq");

        String resultado = driverFactory.getDriver().findElement(MobileBy.id("result")).getText();

        assertEquals("16", resultado);

    }

    @Test
    public void validarSubtracao(){
        clickId("digit_7");
        clickId("op_sub");
        clickId("digit_9");
        clickId("eq");

        String resultado = driverFactory.getDriver().findElement(MobileBy.id("result")).getText();

        assertEquals("−2", resultado);

    }

    @Test
    public void validarDivisao(){
        clickId("digit_7");
        clickId("op_div");
        clickId("digit_9");
        clickId("eq");

        String resultado = driverFactory.getDriver().findElement(MobileBy.id("result")).getText();

        assertEquals("0.777777777777", resultado);

    }

    public void clickId(String id){
        driverFactory.getDriver().findElement(MobileBy.id(id)).click();
    }


}