package com.codificando.jbehavei18n.ptbr;

import org.jbehave.scenario.annotations.Given;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;

import com.codificando.jbehavei18n.I18nSteps;

public class ComportamentoTesteSteps extends I18nSteps {
    @Given("que eu quero rodar o Jbehave em português do Brasil")
    public void temTamanho() {}
 
    @When("eu usar o meu idioma")
    public void verificaTamanho() {}
 
    @Then("tudo deve funcionar perfeitamente")
    public void erroUploadContentType() {}
}
