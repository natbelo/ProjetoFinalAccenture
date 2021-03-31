package io.cucumber.natalia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.natalia.servico.Configuracao;
import io.cucumber.java.pt.*;


public class TesteProductDataSteps {

    @Dado("que escrevo em Start date {string}")
    public void que_escrevo_em_Start_date(String string) {
        Configuracao.id("startdate").sendKeys(string);
    }

    @Dado("clico em Insurance Sum")
    public void clico_em_Insurance_Sum() {
        Configuracao.id("insurancesum").click();
	    Configuracao.cssSelector("option[value='3000000']").click();
    }

    @Dado("clico Merit Rating")
    public void clico_Merit_Rating() {
        Configuracao.id("meritrating").click();
	    Configuracao.cssSelector("option[value='Bonus 1']").click();
    }

    @Dado("clico em Damage Insurance")
    public void clico_em_Damage_Insurance() {
        Configuracao.id("damageinsurance").click();
	    Configuracao.cssSelector("option[value='No Coverage']").click();
    }

    @Dado("clico em Optional Products")
    public void clico_em_Optional_Products() {
        Configuracao.xpath("//label[text()='Euro Protection']").click();
    }

    @Dado("clico em Courtesy car")
    public void clico_em_Courtesy_car() {
        Configuracao.id("courtesycar").click();
	    Configuracao.cssSelector("option[value='No']").click();
    }

    @Entao("clico no proximo botao {string}")
    public void clico_no_proximo_botao(String string) {
        Configuracao.cssSelector("button[id='nextselectpriceoption']").click();
    }


}