# M2S07-veiculos

### [M02S07] Ex 01 - Mini-Projeto Veiculos - Criação projeto

Criar novo projeto para registro de veículos e respectivas multas de trânsito.

Projeto usar o framework Spring Boot (pode-se usar o site https://start.spring.io/), adicionando as dependências de Spring Data e driver do SGBD Postgres (lombok opcional).

### [M02S07] Ex 02 - Mini-Projeto Veiculos - Configuração da aplicação com SGBD

Fazer configurações na aplicação Spring Boot para conectar na instância de Banco de Dados Postgres.

Fazer configurações no arquivo application.properties (ou yaml).

Não é necessário script SQL para inicialização dos dados.

### [M02S07] Ex 03 - Mini-Projeto Veiculos - Entidades JPA

Criar no projeto as entidades abaixo, usando as devidas anotações JPA para geração das tabelas no Banco de Dados:

Classe Veiculo (Tabela Veiculos) :

placa (String) - chave primária na tabela
tipo (Enum TipoVeiculo com valores (AUTOMOVEL, CAMIONETA, ONIBUS, CAMINHAO), gravar o nome da enum na tab
nome (String) - nome do veículo
anoFabricacao (Integer)
cor (String)
multas (Lista da entidade Multa - relacionamento bi-direcional)

Classe Multa (Tablea (Multas):

id (Integer - identificador sequencial)
local (String) - local onde ocorreu a infração
motivo (String) - motivo da infração
valor (Float) - valor da multa
veiculo (Veiulo) - relacionamento bi-direcional

### [M02S07] Ex 04 - Mini-Projeto Veiculos - Repositories

Crie na aplicação, na package “repository”, duas interfaces Repository usando Spring Data:

VeiculoRepository
MultaRepository

### [M02S07] Ex 05 - Mini-Projeto Veiculos - Gravação Veículos

Criar uma classe na aplicação com método para gravar duas instâncias de veículos conforme dados a seguir, usando as classes Repository criadas no exercício anterior:

Veiculo 1: placa = ABC-1234, tipo = AUTOMOVEL, nome = Bat-Movel, anoFabricacao = 2022, cor = preto
Veiculo 2: placa = BCA-4321, tipo = ONIBUS, nome =  Enterprise, anoFabricacao = 1960, cor = prata

Após execução da aplicação com código para fazer esta persistência de dados, conferir via consulta SQL direto no banco de dados se a gravação se deu com sucesso.

### [M02S07] Ex 06 - Mini-Projeto Veiculos - Gravação Multas

Implemente um código para gravar duas multas para o primeiro veículo gravado,e uma multa para o segundo veículo persistido, conforme dados a seguir, usando as classes Repository:

Multa 1 para 1o veiculo: motivo = Farol apagado, local = Gothan City, valor = 250

Multa 2 para 1o veiculo: motivo = Insulfilm, local = Gothan City, valor =100

Multa 1 para 2o veiculo: motivo = Excesso velocidade, local = Hiper-espaço, valor = 400

Após execução da aplicação com código para fazer esta persistência de dados, conferir via consulta SQL direto no banco de dados se a gravação se deu com sucesso.

### [M02S07] Ex 07 - Mini-Projeto Veiculos - Alteração Multa

Implemente um código para alterar  o valor da mulda do segundo veículo para 380 reais, gravando esta alteração no banco de dados (via aplicação).

Dica: alterar na entidade e usar o método save() novamente.

Após execução da aplicação, conferir via consulta SQL direto no banco de dados se a alteração se deu com sucesso.

### [M02S07] Ex 08 - Mini-Projeto Veiculos - Consultas dos Veículos

Implemente ao final uma consulta a todos os veículos cadastrados com as respectivas multas, e imprima estes registros no console (usar toString()).
