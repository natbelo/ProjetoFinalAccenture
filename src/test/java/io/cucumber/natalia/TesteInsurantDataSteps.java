package io.cucumber.natalia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.natalia.servico.Configuracao;
import io.cucumber.java.pt.*;


public class TesteInsurantDataSteps{

    @Dado("que escrevo em First Name {string}")
    public void que_escrevo_em_First_Name(String string) {
        Configuracao.id("firstname").sendKeys(string);
    }

    @Dado("escrevo em Last Name {string}")
    public void escrevo_em_Last_Name(String string) {
        Configuracao.id("lastname").sendKeys(string);
    }

    @Dado("escrevo em Date of Birth {string}")
    public void escrevo_em_Date_of_Birth(String string) {
        Configuracao.id("birthdate").sendKeys(string);
    }

    @Dado("que clico em Country {string}")
    public void que_clico_em_Country(String string) {
        Configuracao.id("country").click();
		Configuracao.cssSelector("option[value='Brazil']").click();
    }

    @Dado("escrevo em Zip Code {string}")
    public void escrevo_em_Zip_Code(String string) {
        Configuracao.id("zipcode").sendKeys(string);
    }

    @Dado("que clico em Occupation {string}")
    public void que_clico_em_Occupation(String string) {
        Configuracao.id("occupation").click();
		Configuracao.cssSelector("option[value='Employee']").click();
    }

    @Dado("seleciono em Hobbies {string}")
    public void seleciono_em_Hobbies(String string) {
        Configuracao.cssSelector("span[class='ideal-check']").click();
    }

    @Entao("clico no botao para a proxima aba {string}")
    public void clico_no_botao_para_a_proxima_aba(String string) {
        Configuracao.id("nextenterproductdata").click();
    }

}