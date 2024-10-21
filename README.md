# Conversor de Moeda

Este é um programa simples em Java que permite converter valores de uma moeda para outra, utilizando a API de taxas de câmbio **ExchangeRate-API**.

## Funcionalidades

- Conversão de Dólar para Peso Argentino, Real Brasileiro, e Peso Colombiano.
- Conversão de Peso Argentino, Real Brasileiro e Peso Colombiano para Dólar.
- Entrada do valor a ser convertido e exibição do valor final.
  
## Moedas Suportadas

1. **USD** - Dólar
2. **ARS** - Peso Argentino
3. **BRL** - Real Brasileiro
4. **COP** - Peso Colombiano

## Requisitos

- Java 8 ou superior.
- Biblioteca **Gson** para manipulação de JSON.
- Conexão com a internet para realizar as chamadas à API.

## Como Usar

1. Execute o programa.
2. Escolha a moeda de origem e a moeda para a qual deseja converter.
3. Insira o valor que deseja converter.
4. O programa irá exibir o valor convertido com base na taxa de câmbio atual.

Após a escolha da opção e inserção do valor, o programa fará a solicitação à API e exibirá a taxa de conversão e o valor convertido.

## API Utilizada

Este programa usa a [ExchangeRate-API](https://www.exchangerate-api.com/) para obter taxas de câmbio atualizadas. Você precisará substituir a chave da API no código (`1d3259f90ba62087bb98ec9f`) pela sua própria chave, que pode ser obtida ao se registrar no site da API.

## Instalação

1. Clone este repositório.
   ```bash
   git clone https://github.com/seuusuario/conversor-moeda.git
2. Compile e execute o programa usando o comando:
  ```bash
   javac Main.java
   java Main
  ```

## Observações
O programa utiliza a classe HttpURLConnection para fazer solicitações HTTP.
A resposta da API é manipulada usando a biblioteca Gson para interpretar o JSON retornado.

## Dependências
Adicione a dependência do Gson ao seu projeto:

<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.9</version>
</dependency>

## Melhorias Futuras
Implementar suporte a mais moedas.
Adicionar tratamento de exceções para possíveis erros na requisição à API.
Melhorar a interface com o usuário.

## Licença
Este projeto está sob a licença MIT.
Esse `README.md` fornece uma visão geral sobre o programa, como ele funciona, requisitos, e instruções de uso. Certifique-se de adaptar o conteúdo conforme necessário, especialmente na parte da chave da API, caso seja necessário.




