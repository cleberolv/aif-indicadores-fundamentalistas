#language:pt
@Tickers
Funcionalidade: Buscar ação por Ticker
	Eu como um investidor 
	Quero acessar o site fundamentus 
	E realizar uma buscar por ticker 
	Então visualizar os fundamentos do ativo

  Cenário: Buscar Itaúsa - ITSA4
    Dado que acesso a pagina do site fundamentus
    Quando realizo a busca por "ITSA4"
    Então valido a busca foi efetuada com exito
