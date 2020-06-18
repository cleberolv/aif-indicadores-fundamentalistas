$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/access.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    }
  ],
  "line": 3,
  "name": "Buscar ação por Ticker",
  "description": "Eu como um investidor \nQuero acessar o site fundamentus \nE realizar uma buscar por ticker \nEntão visualizar os fundamentos do ativo",
  "id": "buscar-ação-por-ticker",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@Tickers"
    }
  ]
});
formatter.scenario({
  "line": 9,
  "name": "Buscar Itaúsa - ITSA4",
  "description": "",
  "id": "buscar-ação-por-ticker;buscar-itaúsa---itsa4",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 10,
  "name": "que acesso a pagina do site fundamentus",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "realizo a busca por \"ITSA4\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "valido a busca foi efetuada com exito",
  "keyword": "Então "
});
formatter.match({
  "location": "AccessStepsDefinitions.acessarPagina()"
});
formatter.result({
  "duration": 4647034408,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ITSA4",
      "offset": 21
    }
  ],
  "location": "AccessStepsDefinitions.realizoBusca(String)"
});
formatter.result({
  "duration": 337991218,
  "status": "passed"
});
formatter.match({
  "location": "AccessStepsDefinitions.validoABuscaFoiEfetuadaComExito()"
});
formatter.result({
  "duration": 1664616890,
  "status": "passed"
});
});