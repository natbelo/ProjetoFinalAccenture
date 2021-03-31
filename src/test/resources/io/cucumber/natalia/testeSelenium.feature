#language: pt
#@ignore
Funcionalidade: Entrar no site da Tricentis 
    Preencher os dados sobre o veiculo

    Cenario: Preencher aba enter Vehicle Data
        Quando estou no site "http://sampleapp.tricentis.com/101/app.php"
        Dado que clico para escolher uma opcao em make 
        Dado que clico para escolher uma opcao em model 
        E escrevo em Cylinder Capacity [ccm] "100"
        E escrevo em Engine Performance [kW] "100"
		E escrevo em Date of Manufacture "03/08/2021"
		Dado que clico em Number of Seats e seleciono "4"
        Dado que clico novamente em Number of Seats e seleciono "2"
        Dado que clico para escolher uma opcao em Fuel Type e seleciono "Gas"
        E escrevo em Payload [kg] "100"
        E escrevo em Total Weight [kg] "200"
        E escrevo em List Price [$] "50000"
		E escrevo em campo Annual Mileage [mi] "15000" 
		Entao clico no botao "Next" 

        Cenario: Preencher aba enter Insurant Data
            Dado que escrevo em First Name "Natalia"
            E escrevo em Last Name "Belo"
            E escrevo em Date of Birth "02/12/1984"
            Dado que clico em Country "Brazil"
            E escrevo em Zip Code "50000"
            Dado que clico em Occupation "Employee"
            E seleciono em Hobbies "Other"
            Entao clico no botao para a proxima aba "Next"

        Cenario: Preencher aba enter Product Data
            Dado que escrevo em Start date "06/25/2021"
            E clico em Insurance Sum
            E clico Merit Rating
            E clico em Damage Insurance
            E clico em Optional Products
            E clico em Courtesy car
            Entao clico no proximo botao "Next"

        Cenario: Preencher aba Select Price Option
			Dado que eu seleciono o preco desejado
			Entao clico para a aba seguinte "Next"

        Cenario: Preencher aba Send Quote
			  Dado que escrevo o email "nabo@gmail.com"
			  E escrevo no campo Username "nabo"
			  E escrevo no campo Password "123456N@b"
			  E escrevo no campo Confirm Password "123456N@b"
			  E clico no ultimo botao "Send"
			  Entao devo ver a mensagem "Sending e-mail success!"	