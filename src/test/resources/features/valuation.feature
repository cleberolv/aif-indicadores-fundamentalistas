@Indicators
Feature: Validar indicadores fundamentalistas da ação
  Eu como um investidor 
  Quero acessar o site fundamentus 
  Então analisar os indicadores fundamentalistas de uma ação
  E verificar se a ação está apta para melhor análise

  Background: 
    Given que acesso a pagina do site fundamentus
    And realizo a busca por "ITSA4"

  @Valuation
  Scenario: Realizar Valuation
    And validar os indicadores informados
 	  Then realizar um comparativo com os parametros definidos
 #  Then eu verifico se o ativo possui margem para uma melhor analise
