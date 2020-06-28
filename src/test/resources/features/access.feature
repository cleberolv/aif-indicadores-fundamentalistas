@Tickers
Feature: Buscar ação por Ticker
  Eu como um investidor 
  Quero acessar o site fundamentus 
  E realizar uma buscar por ticker 
  Então visualizar os fundamentos do ativo

  @Access
  Scenario: Buscar Itaúsa - ITSA4
    Given que acesso a pagina do site fundamentus
    When realizo a busca por "ITSA4"
    Then valido a busca foi efetuada com exito
