Feature: Caso de teste: realizar uma compra com sucesso. 
	Acessar o site: www.automationpractice.com.
	 Escolha um produto qualquer na loja.
	 Adicione o produto escolhido ao carrinho.
	 Prossiga para o checkout.
	 Valide se o produto foi corretamente adicionado ao carrinho e prossiga caso esteja tudo certo.
	 Realize o cadastro do cliente preenchendo todos os campos obrigatórios dos formulários.
	 Valide se o endereço está correto e prossiga.
	 Aceite os termos de serviço e prossiga.
	 Valide o valor total da compra.
	 Selecione um método de pagamento e prossiga.
	 Confirme a compra e valide se foi finalizada com sucesso

Scenario: Caso de teste: realizar uma compra com sucesso. 
	Given usuario inicia uma compra 
	And adiciona um produto ao carrinho e prossegue 
	When verifica endereco, termos de servico e valor total da compra 
	And cria um novo usuario 
	Then seleciona o pagamento e finaliza com sucesso