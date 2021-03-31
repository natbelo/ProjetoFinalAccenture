package io.cucumber.natalia;

import io.cucumber.natalia.servico.Configuracao;
import io.cucumber.java.pt.*;

public class CompartilhadoSteps{
	
	@Quando("estou no site {string}")
    public void estou_no_site(String string) {
	    Configuracao.abrir(string);
	}
	
}