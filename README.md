# testeDeCaixaBranca

Avaliação de qualidade do código Java.

Os aspectos que foram analisados:

Documentação
Nomenclatura
Legibilidade e organização
NullPointers
Arquitetura
Conexões

1.1 Documentação:

	O código não esta bem documentado, não existem comentários explicando as partes do código, apenas um para indicar o fim da classe.

1.2 Nomenclatura:
	
	As variáveis tem nomenclaturas simples e padrões em relação a conexão com o banco de dados, porém outras variáveis como por exemplo: "nome", pode ser um problema em alguma futura expansão do software.

1.3 Legibilidade e organização:

	O código não tem grandes problemas de organização ou legibilidade, foi feita indentação no código e está tudo corretamente estruturado.

1.4 NullPointers:

	O único NullPointer do código é tratado com a conexão do banco de dados.

1.5 Arquitetura:

	A arquitetura utilizada foi devidamente respeitada. O código segue as boas práticas de programação, como o uso de abstração e encapsulamento.

1.6 Conexões:

	As conexões utilizadas foram fechadas após o uso, por exemplo : O método verificarUsuario() fecha a conexão com o banco de dados após usa-la.

1.7 Conclusão:

	O código Java fornecido tem uma qualidade regular, mas poderia ser melhorado nos pontos de documentação, para melhor entendimento do código.

 # ETAPA 2
 	Os números dos valores mostrados na imagem do grafo estão comentados no código.
	No arquivo grafo_de_fluxo.png, temos o grafo do fluxo de funcionamento.

 	A complexidade ciclomática do código é de 2 pois o código tem dois caminho independentes.

# Caminhos :

	Caminho 1:
		1. A aplicação inicia.
		2. Uma conexão com o banco de dados é estabelecida.
		3. A consulta SQL é executada.
		4. Os resultados são verificados.
		5. A aplicação encerra.

  	Caminho 2:
   		1. A aplicação inicia.
		2. Uma conexão com o banco de dados é estabelecida.
		3. A consulta SQL é executada, mas não retorna resultados.
		4. A aplicação encerra.
