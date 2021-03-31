package io.cucumber.natalia;

import org.openqa.selenium.By;
import static org.junit.Assert.assertEquals;
import io.cucumber.natalia.servico.Configuracao;
import io.cucumber.java.pt.*;


public class SendQuoteSteps {
    
    @Dado("que escrevo o email {string}")
    public void que_escrevo_o_email(String string) {
        Configuracao.id("email").sendKeys(string);
    }

    @Dado("escrevo no campo Username {string}")
    public void escrevo_no_campo_Username(String string) {
        Configuracao.id("username").sendKeys(string);
    }

    @Dado("escrevo no campo Password {string}")
    public void escrevo_no_campo_Password(String string) {
        Configuracao.id("password").sendKeys(string);
    }

    @Dado("escrevo no campo Confirm Password {string}")
    public void escrevo_no_campo_Confirm_Password(String string) {
        Configuracao.id("confirmpassword").sendKeys(string);
    }

    @Dado("clico no ultimo botao {string}")
    public void clico_no_ultimo_botao(String string) {
        Configuracao.id("sendemail").click();
    }

    @Entao("devo ver a mensagem {string}")
    public void devo_ver_a_mensagem(String string) throws InterruptedException {
		Thread.sleep(10000);
	    assertEquals(string, Configuracao.xpath("//h2[text()='Sending e-mail success!']").getText());
	    Configuracao.fechar();
    }


}