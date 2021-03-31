# <p align="center">Projeto Selenium Accenture </p>

<p align="center">
    <a href="#time">Aluna</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#descrição">Descrição</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#como-utilizar">Como utilizar</a>&nbsp;&nbsp;&nbsp;
</p>

<br>

## Aluna

- [Natália Belo](https://github.com/natbelo)

<br>

<br>

## Descrição
### 1)Criar um projeto em selenium webdrive (java)  e cucumber usando Page objects (precisamos executar o script através da feature)
### 2)Passo a passo para o teste automático(Colocar algum verificador do objeto antes de fazer as ações): 
### 3)Disponibilizar o projeto no repositório GIT e enviar o caminho para: 
<br>

### Caso de teste 
Entrar no site da Tricentis e preencher formulários para seguro de carro

<b>Cenário:</b> Preencher aba enter Vehicle Data<br>
    Quando estou no site "http://sampleapp.tricentis.com/101/app.php"<br>
    Dado que clico para escolher uma opcao em make <br>
    Dado que clico para escolher uma opcao em model <br>
    E escrevo em Cylinder Capacity [ccm] "100"<br>
    E escrevo em Engine Performance [kW] "100"<br>
    E escrevo em Date of Manufacture "03/08/2021"<br>
    Dado que clico em Number of Seats e seleciono "4"<br>
    Dado que clico novamente em Number of Seats e seleciono "2"<br>
    Dado que clico para escolher uma opcao em Fuel Type e seleciono "Gas"<br>
    E escrevo em Payload [kg] "100"<br>
    E escrevo em Total Weight [kg] "200"<br>
    E escrevo em List Price [$] "50000"<br>
    E escrevo em campo Annual Mileage [mi] "15000" <br>
    Entao clico no botao "Next" <br>

<b>Cenário:</b> Preencher aba enter Insurant Data<br>
    Dado que escrevo em First Name "Natalia"<br>
    E escrevo em Last Name "Belo"<br>
    E escrevo em Date of Birth "02/12/1984"<br>
    Dado que clico em Country "Brazil"<br>
    E escrevo em Zip Code "50000"<br>
    Dado que clico em Occupation "Employee"<br>
    E seleciono em Hobbies "Other"<br>
    Entao clico no botao para a proxima aba "Next"<br>

<b>Cenário:</b> Preencher aba enter Product Data<br>
    Dado que escrevo em Start date "06/25/2021"<br>
    E clico em Insurance Sum<br>
    E clico Merit Rating<br>
    E clico em Damage Insurance<br>
    E clico em Optional Products<br>
    E clico em Courtesy car<br>
    Entao clico no proximo botao "Next"<br>

<b>Cenário:</b> Preencher aba Select Price Option<br>
    Dado que eu seleciono o preco desejado<br>
	Entao clico para a aba seguinte "Next"<br>

<b>Cenário:</b> Preencher aba Send Quote<br>
    Dado que escrevo o email "nabo@gmail.com"<br>
    E escrevo no campo Username "nabo"<br>
    E escrevo no campo Password "123456N@b"<br>
    E escrevo no campo Confirm Password "123456N@b"<br>
    E clico no ultimo botao "Send"<br>
    Entao devo ver a mensagem "Sending e-mail success!"<br>

<br>

<br>

## Tecnologias


:heavy_check_mark: <b> [Java](https://www.java.com/pt-BR/) </b><br>
Linguagem de programação para desenvolvimento da aplicação <br>

:heavy_check_mark: <b> [Maven](https://maven.apache.org/) </b><br>
Gerenciador de dependências para desenvolvimento da aplicação <br>

:heavy_check_mark: <b> [Cucumber](https://cucumber.io/) </b><br>
Framework responsável por traduzir uma linguagem humana em código Java <br>

:heavy_check_mark: <b> [Selenium](https://www.selenium.dev/) </b><br>
Framework responsável por fazer a integração do código Java com a linguagem Gherkin(Cucumber), abrindo o browser e fazendo o teste de comportamento <br>

<br>

<br>

## Como utilizar

### Pré requisitos
- Instalar o [Java](https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR)
- Instalar o [JDK](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)
- Verificar se o JAVA_HOME está configurado em seu computador

- Clone do projeto
```bash
git clone https://github.com/natbelo/ProjetoFinalAccenture
```

- Entrando na pasta do projeto
```bash
cd projeto-selenium-acc
```

- Configurando Selenium
Fazer o download do [Chrome WebDriver](https://chromedriver.chromium.org/downloads) e colocar o arquivo desconpactado dentro da pasta drive na raiz do projeto

```bash
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip

```

- Limpando e validando Maven com Unix
```bash
./mvnw clean
```

- Limpando e validando Maven com Windows
```bash
mvnw.cmd clean
```

- Executando teste com Unix
```bash
./test.sh
```

- Executando teste com Windows
```bash
./test.bat
```
## Estrutura de arquivos
```
  driver 

      |-- chromedriver -- Este é o arquivo do selenium webdriver, substitua este arquivo com a versão da sua máquina

  mvnw

  mvnw.cmd

  pom.xml

  src

    |-- test

    |  |-- java

    |  |  |-- io

    |  |  |  |-- cucumber

    |  |  |  |  |-- natalia

    |  |  |  |  |  |-- servico -- Pasta para colocar Classes em Java para usar nos arquivos Steps
    
    |  |  |  |  |  |  |-- Configuracao -- Conjunto de classes em java para facilitar o processo das Steps

    |  |  |  |  |  |-- TesteVehicleDataSteps.java -- Passos escritos em java com selenium abrindo o site e iniciando o preenchimento dos formulários com os dados do veículo
 
    |  |  |  |  |  |-- CompartilhadoSteps.java -- Passos escritos em java com selenium em comum entre os cenários
    
    |  |  |  |  |  |-- TesteInsurantDataSteps.java -- Passos escritos em java com selenium inserindo os dados do seguro
    
    |  |  |  |  |  |-- TesteProductDataSteps.java -- Passos escritos em java com selenium inserindo os dados do produto
    
    |  |  |  |  |  |-- SelectionPriceSteps.java -- Passos escritos em java com selenium para selecionar as opções de preços

    |  |  |  |  |  |-- SendQuoteSteps.java -- Passos escritos em java com selenium para enviar os dados de cotação

    |  |  |  |  |  |-- RunCucumberTest.java -- Arquivo que configura a inicialização do Java test

    |  |-- resources

    |  |  |-- io

    |  |  |  |-- cucumber

    |  |  |  |  |-- natalia

    |  |  |  |  |  |-- testeSelenium.feature -- Gherkin com os cenários de teste de acordo com o cliente

    
  test.bat -- Arquivo para rodar teste no Windows
  
  test.sh -- Arquivo para rodar teste no Unix
```