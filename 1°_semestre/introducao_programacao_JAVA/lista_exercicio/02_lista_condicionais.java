// 1 – EM UMA FEIRA, AS MAÇÃS CUSTAM R$ 1,30 CADA SE FOREM COMPRADAS MENOS DE UMA DÚZIA, E R$ 1,00
// SE FOREM COMPRADAS PELO MENOS 12. ESCREVA UM PROGRAMA QUE LEIA O NÚMERO DE MAÇÃS 
// COMPRADAS, CALCULE E ESCREVA O CUSTO TOTAL DA COMPRA.


DecimalFormat formatador = new DecimalFormat("0.00");
Scanner teclado = new Scanner(System.in);

    System.out.println("Bem-vindo ao programa que calcula o custos de maçãs conforme quantidade");
		
		System.out.print("\n\nDigite a quantidade de maçãs que você pretende comprar: ");
		int quantidadeDesejada = teclado.nextInt();
		
		if (quantidadeDesejada < 12) {
			double precoMaca = 1.30;
			System.out.print("\nCom essa quantidade você paga R$ 1,30 no kilo da maçã totalizando R$ "+
								formatador.format(quantidadeDesejada * precoMaca) + ".");
			
		} else {
			int precoMaca = 1;
			System.out.print("\nCom essa quantidade você paga R$ 1,00 no kilo da maçã totalizando R$ " +
					formatador.format(quantidadeDesejada * precoMaca) + ".");
		}
		
teclado.close();



// 2 – DESENVOLVA UM PROGRAMA QUE LEIA AS NOTAS DA 1ª E 2ª AVALIAÇÕES DE UM ALUNO. CALCULE A MÉDIA 
// ARITMÉTICA SIMPLES E ESCREVA UMA MENSAGEM QUE DIGA SE O ALUNO FOI OU NÃO APROVADO (CONSIDERAR 
// QUE NOTA IGUAL OU MAIOR QUE 7 O ALUNO É APROVADO). ESCREVA TAMBÉM A MÉDIA CALCULADA.


DecimalFormat formatador = new DecimalFormat("0.00");
Scanner teclado = new Scanner(System.in);
		
		System.out.print("Bem-vindo ao programa de calculo de média simples dos alunos (2 avaliações)!");
		
		System.out.print("\n\nDigite a primeira nota do aluno na avaliação: ");
		double nota01 = teclado.nextDouble();
		
		System.out.print("\nDigite a segunda nota do aluno na avaliação: ");
		double nota02 = teclado.nextDouble();
		
		double media = (nota01 + nota02) / 2;
		
		if (media >= 7) {
			System.out.print("\nO aluno foi APROVADO e recebeu a média " + formatador.format(media));
		} else {
			System.out.print("\nO aluno foi REPROVADO e recebeu a média " + formatador.format(media));
		}

teclado.close();



// 3 – CRIE UM PROGRAMA QUE LEIA A HORA DE INÍCIO E A HORA DE FIM DE UM JOGO DE XADREZ (CONSIDERE 
// APENAS HORAS INTEIRAS, SEM OS MINUTOS) E CALCULE A DURAÇÃO DO JOGO EM HORAS, SABENDO-SE QUE O 
// TEMPO MÁXIMO DE DURAÇÃO DO JOGO É DE 24 HORAS E QUE O JOGO PODE INICIAR EM UM DIA E TERMINAR NO 
// DIA SEGUINTE.

Scanner teclado = new Scanner(System.in);
		
    System.out.print("Bem-vindo ao programa de tempo de jogo no Xadrez!")
		System.out.print("\n\nDigite quando a partida iniciou (Apenas hora, ex: 16): ");
		int iniciou = teclado.nextInt();
		
		System.out.print("Digite quando a partida terminou (Apenas hora, ex: 9): ");
		int terminou = teclado.nextInt();
		
		int duracao = 0;
		
		if (terminou < iniciou) {			
			duracao += (24 - iniciou) + terminou;
			System.out.print("\nA partida teve uma duração de " + duracao + " horas.");
		} else {
			duracao += terminou - iniciou;
			System.out.print("\nA partida teve uma duração de " + duracao  + " horas.");
		}
		
		teclado.close();
}



// 4 – A JORNADA DE TRABALHO DE UM FUNCIONÁRIO É DE 40 HORAS SEMANAIS. PODE OCORRER DO
// FUNCIONÁRIO FAZER HORA EXTRA, CUJO CÁLCULO É O VALOR DA HORA REGULAR COM UM ACRÉSCIMO DE 50%.
// DESENVOLVA UM PROGRAMA QUE LEIA O NÚMERO DE HORAS TRABALHADAS EM UM MÊS, O SALÁRIO POR HORA 
// E ESCREVA O SALÁRIO TOTAL DO FUNCIONÁRIO, QUE DEVERÁ SER ACRESCIDO DAS HORAS EXTRAS, CASO 
// TENHAM SIDO TRABALHADAS (CONSIDERE QUE O MÊS POSSUA 4 SEMANAS EXATAS).


DecimalFormat formatador = new DecimalFormat("0.00");
Scanner teclado = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao programa que calcula o salário do funcionário e suas horas extras.");		
		System.out.print("\nDigite a quantidade de horas trabalhadas pelo funcionário esse mês: ");
		double quantidadeHorasTrabalhadas = teclado.nextDouble();
		
		System.out.print("Digite o valor da hora do funcionário em questão: ");
		double valorHora = teclado.nextDouble();
		
		double quantidadeHorasExtras = quantidadeHorasTrabalhadas - 160;
		double salario = 0;

		if (quantidadeHorasExtras > 0) {
			double valorHoraExtra = (valorHora + (valorHora * 0.5)) * quantidadeHorasExtras;
			salario += valorHoraExtra + (160 * valorHora);
			System.out.print("A quantidade de horas extras do funcionário esse mês foi " + quantidadeHorasExtras
					+ " e ele receberá um total de R$ " + formatador.format(salario) + ".");
		} else {
			salario += quantidadeHorasTrabalhadas * valorHora;
			System.out.print("\nO funcionário esse mês receberá o salário de R$ " + formatador.format(salario) + ".");
		}

teclado.close();
	


// 5 – FAÇA UM PROGRAMA PARA LER A QUANTIDADE ATUAL DE UM PRODUTO EM ESTOQUE. TAMBÉM DEVERÁ SER 
// INFORMADO A QUANTIDADE MÁXIMA E A QUANTIDADE MÍNIMA QUE ESTE PRODUTO PODE TER EM ESTOQUE. O
// PROGRAMA DEVE CALCULAR E ESCREVER A QUANTIDADE MÉDIA ((QUANTIDADE MÉDIA = QUANTIDADE MÁXIMA +
// QUANTIDADE MÍNIMA)/2). SE A QUANTIDADE EM ESTOQUE FOR MAIOR OU IGUAL A QUANTIDADE MÉDIA 
// ESCREVER A MENSAGEM “NÃO É NECESSÁRIO EFETUAR A COMPRA DESTE PRODUTO”, SENÃO ESCREVER A 
// MENSAGEM “EFETUAR A COMPRA DESTE PRODUTO”.

	
Scanner teclado = new Scanner(System.in);
		
		System.out.print("Bem-vindo ao programa que avisa como está seu nível de estoque!");
		System.out.print("\n\nDigite a quantidade de produtos dísponiveis em estoque: ");
		
    double qntAtual = teclado.nextDouble();

		System.out.print("Digite a quantidade de mínimas aceitáveis para o respectivo produto: ");
		double qntMinima = teclado.nextDouble();
	
		System.out.print("Digite a quantidade de máximas aceitáveis para o respectivo produto: ");
		double qntMaxima = teclado.nextDouble();

		double media = (qntMinima + qntMaxima ) / 2;
	
		if (qntAtual >= media) {
			System.out.println("Não é necessário efetuar a compra deste produto.");
		}else {
			System.out.println("Efetuar a compra deste produto.");
		}

teclado.close();



// 6 – CRIE UM PROGRAMA PARA LER O NOME DE 2 TIMES DE FUTEBOL E O NÚMERO DE GOLS MARCADOS NA 
// PARTIDA (PARA CADA TIME). ESCREVA O NOME DO VENCEDOR. CASO NÃO HAJA VENCEDOR DEVERÁ SER 
// IMPRESSA A PALAVRA “EMPATE”.


Scanner teclado = new Scanner(System.in);
		
		System.out.print("Bem-vindo ao programa de confirmação do resultado da partida!");
		
		System.out.print("\n\nDigite o nome do 1° time: ");
		String timeUM = teclado.nextLine();
		System.out.print("Digite a quantidade de Gols do " + timeUM +" : ");
		int golTimeUM = teclado.nextInt();
		
		teclado.nextLine();
		
		System.out.print("\nDigite o nome do 2° time: ");
		String timeDOIS = teclado.nextLine();
		System.out.print("Digite a quantidade de Gols do " + timeDOIS + " : ");
		int golTimeDOIS = teclado.nextInt();
		
		if (golTimeUM == golTimeDOIS) {
			System.out.print("\nEMPATE");
		} else if (golTimeUM > golTimeDOIS) {
				System.out.print("\nO time vencedor foi o: " + timeUM);
		} else {
				System.out.print("\nO time vencedor foi o: " + timeDOIS);
		}

teclado.close();

// 7 – UM POSTO DE COMBUSTÍVEL ESTÁ VENDENDO SEUS COMBUSTÍVEIS COM A SEGUINTE TABELA DE 
// DESCONTOS:
//        ÁLCOOL ATÉ 20 LITROS, DESCONTO DE 3% POR LITRO
//        ACIMA DE 20 LITROS, DESCONTO DE 5% POR LITRO

//        GASOLINA ATÉ 20 LITROS, DESCONTO DE 4% POR LITRO
//        ACIMA DE 20 LITROS, DESCONTO DE 6% POR LITRO

// DESENVOLVA UM PROGRAMA QUE LEIA O NÚMERO DE LITROS VENDIDOS E O TIPO DE COMBUSTÍVEL 
// (CODIFICADO DA SEGUINTE FORMA: A -> ÁLCOOL, G -> GASOLINA), CALCULE E IMPRIMA O VALOR A SER PAGO 
// PELO CLIENTE SABENDO-SE QUE O PREÇO DO LITRO DA GASOLINA É R$ 6,90 E O PREÇO DO LITRO DO ÁLCOOL 
// É R$ 6,20.


Scanner teclado = new Scanner(System.in);
		
		System.out.print("Bem-vindo ao programa que calculará o valor do seu abastecimento.")/
		System.out.print("\n\nDigite o tipo de combustivel a ser abastecido: (1 - Para Alcool OU 2 - Para Gasolina): ");
		int tipoCombustivel = teclado.nextInt();
		
		System.out.print("\nAgora, digite a quantidade de litros a ser abastecido: ");
		double qntCombustivel = teclado.nextInt();

		double valorFinal = 0;

		if (tipoCombustivel == 1){		    
		    double precoAlcool = 6.20;
		    double valorTotal = qntCombustivel * precoAlcool;
		    
		    if (qntCombustivel <= 20) {
		        valorFinal += valorTotal - (valorTotal * 0.03);
		        System.out.print("\nO preço a ser pago pelo Alcool com a respectiva quantidade será de R$ " + valorFinal + " com um desconto de 3%.");
		    } else {
		        valorFinal += valorTotal - (valorTotal * 0.05);
		        System.out.print("\nO preço a ser pago pelo Alcool com a respectiva quantidade será de R$ " + valorFinal + " com um desconto de 5%.");
		    }
		
		} else {
		    double precoGasolina = 6.90;
		    double valorTotal = qntCombustivel * precoGasolina;
		    
		    if (qntCombustivel <= 20) {
		    	valorFinal += valorTotal - (valorTotal * 0.04);
		        System.out.print("\nO preço a ser pago pelo Gasolina com a respectiva quantidade será de R$ " + valorFinal + " com um desconto de 4%.");
		    } else {
		        valorFinal += valorTotal - (valorTotal * 0.06);
		        System.out.print("\nO preço a ser pago pelo Gasolina com a respectiva quantidade será de R$ " + valorFinal + " com um desconto de 6%.");
		    
		    }
		}
	
teclado.close();



// 8 – SUPONHA QUE O CÓDIGO DE ACESSO DE UM USUÁRIO A UM SISTEMA SEJA IGUAL A 12345 E QUE A SENHA DE 
// ACESSO SEJA 54321. FAÇA UM PROGRAMA PARA LER O CÓDIGO DE ACESSO DO USUÁRIO. CASO ESTE CÓDIGO 
// SEJA DIFERENTE DO CÓDIGO ARMAZENADO INTERNAMENTE O PROGRAMA DEVE APRESENTAR A MENSAGEM 
// “USUÁRIO INVÁLIDO!”. CASO O CÓDIGO SEJA CORRETO, DEVE SER LIDO A SENHA. SE ESTA SENHA ESTIVER 
// INCORRETA O PROGRAMA DEVE MOSTRAR A MENSAGEM “SENHA INCORRETA!”. CASO A SENHA ESTEJA 
// CORRETA, DEVE SER MOSTRADA A MENSAGEM “ACESSO PERMITIDO!”.


Scanner teclado = new Scanner(System.in);

		System.out.print("Bem-vindo ao programa de acesso ao sistema!");
		System.out.print("\n\nDigite o ID do usuário: ");
		int idUser = teclado.nextInt();

		int idValido = 12345;
		int senhaValida = 54321;

		if (idUser == idValido) {
		    System.out.print("Agora, digite a senha de acesso: ");
		    int senhaDigitada = teclado.nextInt();
		    
		    if (senhaDigitada == senhaValida) {
		        System.out.print("\nAcesso permitido!");
		    } else {
		        System.out.print("\nSenha incorreta!");
		    }
      
		} else {
		    System.out.print("\nUsuário inválido!");
		}

teclado.close();



// 9 – UMA FRUTEIRA ESTÁ VENDENDO FRUTAS COM A SEGUINTE TABELA DE PREÇOS:
//                             ATÉ 5 KG ACIMA DE 5 KG
//                     MORANGO R$ 2,50 POR KG R$ 2,20 POR KG
//                        MAÇÃ R$ 1,80 POR KG R$ 1,50 POR KG
// SE O CLIENTE COMPRAR MAIS DE 8 KG EM FRUTAS OU O VALOR TOTAL DA COMPRA ULTRAPASSAR R$ 25,00,
// RECEBERÁ AINDA UM DESCONTO DE 10% SOBRE ESTE TOTAL. DESENVOLVA UM PROGRAMA PARA LER A 
// QUANTIDADE (EM KG) DE MORANGOS E A QUANTIDADE (EM KG) DE MAÇAS ADQUIRIDAS E ESCREVA O VALOR A 
// SER PAGO PELO CLIENTE.


DecimalFormat formatador = new DecimalFormat("0.00");
Scanner teclado = new Scanner(System.in);

		System.out.print("Bem-vindo ao programa de descontos na fruteira!");
		System.out.print("\n\nDigite a quantidade em kg (Ex: 3,0) de morangos: ");
		double pesoMorango = teclado.nextDouble();

		System.out.print("\nDigite a quantidade em kg (Ex: 1,6) de maçãs: ");
		double pesoMaca = teclado.nextDouble();

		double valorMorango = 0;
		double valorAplicadoMorango = 0;
		double valorFinalMorango = 0;

		double valorMaca = 0;
		double valorAplicadoMaca = 0;
		double valorFinalMaca = 0;

		/*
			Calcula o valor final do morango
		*/
		
		if (pesoMorango <= 5.0) {

		    valorAplicadoMorango +=  2.50;
		    valorMorango += valorAplicadoMorango * pesoMorango;
		    
		    if (valorMorango > 25) {
		        valorFinalMorango += valorMorango - (valorMorango * 0.10);
		    } else {
		        valorFinalMorango += valorMorango;
		    }

		} else {
		    
			valorAplicadoMorango +=  2.20;
		    valorMorango += valorAplicadoMorango * pesoMorango;
		    
		    if (valorMorango > 25 || pesoMorango > 8) {
		        valorFinalMorango += valorMorango - (valorMorango * 0.10);
		    } else {
		        valorFinalMorango += valorMorango;
		    }
		    
		}

		/*
		Calcula o valor final da maca
		*/

		if (pesoMaca <= 5.0) {
      
		    valorAplicadoMaca +=  1.80;
		    valorMaca += valorAplicadoMaca * pesoMaca;
		    
		    if (valorMaca > 25) {
		        valorFinalMaca += valorMaca - (valorMaca * 0.10);
		    } else {
		        valorFinalMaca += valorMaca;
		    }
		    
		} else {
		    
			valorAplicadoMaca +=  1.50;
		    valorMaca += valorAplicadoMaca * pesoMaca;
		    
		    if (valorMaca > 25 || pesoMaca > 8) {
		        valorFinalMaca += valorMaca - (valorMaca * 0.10);
		    } else {
		        valorFinalMaca += valorMaca;
		    }
		}
		double somaFinal = valorFinalMaca + valorFinalMorango;
		System.out.print("\nO valor a ser pago pelas morangos será de R$ " + formatador.format(valorFinalMorango)
		    + ", e o valor total das maçãs será de R$ " + formatador.format(valorFinalMaca) + ", finalizando a sua compra"
		    +" será necessário pagar o montante de " + formatador.format(somaFinal) + ".");

teclado.close();


// 10 – FAÇA UM PROGRAMA PARA LER O NOME DE UM PRODUTO, A QUANTIDADE ADQUIRIDA E O PREÇO UNITÁRIO.
// CALCULE E ESCREVA O TOTAL (TOTAL = QUANTIDADE ADQUIRIDA * PREÇO UNITÁRIO), O DESCONTO E O TOTAL A 
// PAGAR (TOTAL A PAGAR = TOTAL - DESCONTO), SABENDO-SE QUE:
// - SE QUANTIDADE <= 5 O DESCONTO SERÁ DE 2%
// - SE QUANTIDADE > 5 E QUANTIDADE <=10 O DESCONTO SERÁ DE 3%
// - SE QUANTIDADE > 10 O DESCONTO SERÁ DE 5%

DecimalFormat formatador = new DecimalFormat("0.00");
Scanner teclado = new Scanner(System.in);
		
		System.out.print("\nBem-vindo ao programa que calcula a a porcentagem de desconto nos seus produtos!");
		
		System.out.print("\n\nDigite o nome do produto: ");
		String nomeProduto = teclado.nextLine();
		
		System.out.print("Digite agora a quantidade adquirida do respectivo produto (Ex 1,0): ");
		double quantidade = teclado.nextDouble();
		
		System.out.print("E não menos importante, o valor unitário do produto (Ex 2,38): ");
		double precoUnitario = teclado.nextDouble();
				
		double totalBruto = quantidade * precoUnitario;
		double totalFinal = 0;
		int desconto = 0;
		
		
		if (quantidade <= 5){
			
			totalFinal += totalBruto - (totalBruto * 0.02);
			desconto += 2;
			
		} else if (quantidade > 5 && quantidade <= 10) {
			
			totalFinal += totalBruto - (totalBruto * 0.03);
			desconto += 3;
			
		} else {
			
			totalFinal += totalBruto - (totalBruto * 0.05);
			desconto += 5;
			
		}
	
		System.out.print("\nCom essa quantidade você receberá um desconto de " + desconto + "% na(o) " + nomeProduto + ".\n"
				+ "O valor a ser pago é de R$ " + formatador.format(totalFinal) + ".");

teclado.close();



// 11 – FAÇA UM PROGRAMA PARA LER AS 3 NOTAS OBTIDAS POR UM ALUNO NAS 3 AVALIAÇÕES E A MÉDIA DOS
// EXERCÍCIOS QUE FAZEM PARTE DA AVALIAÇÃO. CALCULE A MÉDIA, USANDO A FÓRMULA ABAIXO E ESCREVA O 
// CONCEITO DO ALUNO DE ACORDO COM A TABELA DE CONCEITOS MAIS ABAIXO:
// MÉDIA DE APROVEITAMENTO = (N1 + (N2 * 2) + (N3 * 3) + MÉDIA DOS EXERCÍCIOS)) / 7
// AATRIBUIÇÃO DE CONCEITOS OBEDECE A TABELA ABAIXO:
// MÉDIA DE APROVEITAMENTO CONCEITO
// > = 9,0                     A
// > = 7,5 E < 9,0             B
// > = 6,0 E < 7,5             C
// < 6,0                       D


Scanner teclado = new Scanner(System.in);
	
		System.out.print("\nBem-vindo ao programa de calculo de média!");
		System.out.print("\n\nDigite a nota obtida na 1° avaliação: ");
		double notaUM = teclado.nextDouble();
		
		System.out.print("Digite a nota obtida na 2° avaliação: ");
		double notaDOIS = teclado.nextDouble();
		
		System.out.print("Digite a nota obtida na 3° avaliação: ");
		double notaTRES = teclado.nextDouble();
		
		System.out.print("\nDigite agora a média dos exercícios que fazem parte da avaliação: ");
		double mediaReferencia = teclado.nextDouble();

		Double mediaAproveitamento = ((notaUM + (notaDOIS * 2) + (notaTRES * 3) + mediaReferencia)) / 7;
		String conceito = "";
		
		if (mediaAproveitamento >= 9.0) {
			conceito = conceito.concat("A");
			
		} else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
			conceito = conceito.concat("B");
			
		} else if (mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5) {
			conceito = conceito.concat("C");
			
		} else if (mediaAproveitamento < 6.0) {
			conceito = conceito.concat("D");
			
		} else {
			System.out.print("\nErro - verifique os números digitados ou o código!");	
		}		
		System.out.print("\nCom as respectivas notas o aluno terá o conceito " + conceito + ".");
		
teclado.close();



// 12 – UMA EMPRESA QUER VERIFICAR SE UM EMPREGADO ESTÁ QUALIFICADO PARA A APOSENTADORIA OU NÃO.
// PARA ESTAR EM CONDIÇÕES, UM DOS SEGUINTES REQUISITOS DEVE SER SATISFEITO:
// - TER NO MÍNIMO 65 ANOS DE IDADE.
// - TER TRABALHADO NO MÍNIMO 30 ANOS.
// - TER NO MÍNIMO 60 ANOS E TER TRABALHADO NO MÍNIMO 25 ANOS.
// COM BASE NAS INFORMAÇÕES ACIMA, DESENVOLVA UM PROGRAMA QUE LEIA O NOME DO EMPREGADO, O ANO
// DE SEU NASCIMENTO E O ANO DE SEU INGRESSO NA EMPRESA. O PROGRAMA DEVERÁ INFORMAR O NOME, A 
// IDADE, O TEMPO DE SERVIÇO DO EMPREGADO E A MENSAGEM “REQUERER APOSENTADORIA” OU “NÃO 
// REQUERER APOSENTADORIA”.

Scanner teclado = new Scanner(System.in);

		System.out.print("\nVocê já pode se aposentar? Esse programa vai te ajudar a descobrir. Vamos lá!");	
		System.out.print("\n\nPrimeiramente, qual é o seu nome: ");
		String nome = teclado.nextLine();
		
		System.out.print("Qual o ano do seu nascimento " + nome + ": ");
		int nascimento = teclado.nextInt();
			
		System.out.print("Em que ano você ingressou na sua empresa " + nome + ": ");
		int ingresso = teclado.nextInt();
	
		
		int anoReferencia = 2022;
		int idade = anoReferencia - nascimento;
		int tempoContribuicao = anoReferencia - ingresso;
				
		/*
		PARA ESTAR EM CONDIÇÕES, UM DOS SEGUINTES REQUISITOS DEVE SER SATISFEITO:
		TER NO MÍNIMO 65 ANOS DE IDADE.
		TER TRABALHADO NO MÍNIMO 30 ANOS.
		TER NO MÍNIMO 60 ANOS E TER TRABALHADO NO MÍNIMO 25 ANOS.
		*/
		
		int aposenta = 0;
		
		if (idade >= 65) {
			aposenta += 1;
			
		} else if (tempoContribuicao >= 30) {
			aposenta += 1;
			
		} else if (tempoContribuicao >= 25 && idade >= 60) {
			aposenta += 1;
		} 
		
		if (aposenta == 1) {
			System.out.print("\nO senhor(a) " + nome + ", está atualmente com a idade aproximada em " + idade +
					" anos,  está trabalhando a " + tempoContribuicao + " anos e REQUERER APOSENTADORIA.");		
		} else {
			System.out.print("\nO senhor(a) " + nome + ", está atualmente com a idade aproximada em " + idade +
					" anos,  está trabalhando a " + tempoContribuicao + " anos e NÃO REQUERER APOSENTADORIA.");
		}

teclado.close();
