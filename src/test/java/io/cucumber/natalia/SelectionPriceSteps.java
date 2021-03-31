package io.cucumber.natalia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.natalia.servico.Configuracao;
import io.cucumber.java.pt.*;

public class SelectionPriceSteps{

    @Dado("que eu seleciono o preco desejado")
    public void que_eu_seleciono_o_preco_desejado() {
        Configuracao.cssSelectors(".ideal-radio").get(4).click();
    }

    @Entao("clico para a aba seguinte {string}")
    public void clico_para_a_aba_seguinte(String string) throws InterruptedException {
		Thread.sleep(5000);
		Configuracao.id("nextsendquote").click();
    }

}