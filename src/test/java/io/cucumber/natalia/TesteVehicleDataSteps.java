package io.cucumber.natalia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.natalia.servico.Configuracao;
import io.cucumber.java.pt.*;


public class TesteVehicleDataSteps {

    @Dado("que clico para escolher uma opcao em make")
    public void que_clico_para_escolher_uma_opcao_em_make() {
        Configuracao.id("make").click();
		Configuracao.cssSelector("option[value='Ford']").click();
		
    }

    @Dado("que clico para escolher uma opcao em model")
    public void que_clico_para_escolher_uma_opcao_em_model() {
        Configuracao.id("model").click();
		Configuracao.cssSelector("option[value='Moped']").click();
    }

    @Dado("escrevo em Cylinder Capacity [ccm] {string}")
    public void escrevo_em_Cylinder_Capacity_ccm(String string) {
        WebElement input = Configuracao.browser.findElement(By.cssSelector("#cylindercapacity"));
		input.sendKeys(string);
    }

    @Dado("escrevo em Engine Performance [kW] {string}")
    public void escrevo_em_Engine_Performance_kW(String string) {
        WebElement input = Configuracao.browser.findElement(By.cssSelector("#engineperformance"));
		input.sendKeys(string);
    }

    @Dado("escrevo em Date of Manufacture {string}")
    public void escrevo_em_Date_of_Manufacture(String string) {
        WebElement input = Configuracao.browser.findElement(By.cssSelector("#dateofmanufacture"));
		input.sendKeys(string);
    }

    @Dado("que clico em Number of Seats e seleciono {string}")
    public void que_clico_em_Number_of_Seats_e_seleciono(String string) {
        WebElement input = Configuracao.browser.findElement(By.cssSelector("#numberofseats>option:nth-child(5)"));
		input.click();
    }

    @Dado("que clico novamente em Number of Seats e seleciono {string}")
    public void que_clico_novamente_em_Number_of_Seats_e_seleciono(String string) {
        WebElement input = Configuracao.browser.findElement(By.cssSelector("#numberofseatsmotorcycle>option:nth-child(3)"));
		input.click();
    }

    @Dado("que clico para escolher uma opcao em Fuel Type e seleciono {string}")
    public void que_clico_para_escolher_uma_opcao_em_Fuel_Type_e_seleciono(String string) {
        WebElement input = Configuracao.browser.findElement(By.cssSelector("#fuel>option:nth-child(2)"));
		input.click();  
    }

    @Dado("escrevo em Payload [kg] {string}")
    public void escrevo_em_Payload_kg(String string) {
        WebElement input = Configuracao.browser.findElement(By.cssSelector("#payload"));
		input.sendKeys(string);
    }

    @Dado("escrevo em Total Weight [kg] {string}")
    public void escrevo_em_Total_Weight_kg(String string) {
        WebElement input = Configuracao.browser.findElement(By.cssSelector("#totalweight"));
		input.sendKeys(string);
    }

    @Dado("escrevo em List Price [$] {string}")
    public void escrevo_em_List_Price(String string) {
        WebElement input = Configuracao.browser.findElement(By.cssSelector("#listprice"));
		input.sendKeys(string);
    }

    @Dado("escrevo em campo Annual Mileage [mi] {string}")
    public void escrevo_em_campo_Annual_Mileage_mi(String string) {
        WebElement input = Configuracao.browser.findElement(By.cssSelector("#annualmileage"));
		input.sendKeys(string);
    }

    @Entao("clico no botao {string}")
    public void clico_no_botao(String string) {
        WebElement input = Configuracao.browser.findElement(By.cssSelector("#nextenterinsurantdata"));
		input.click();
    }


}
