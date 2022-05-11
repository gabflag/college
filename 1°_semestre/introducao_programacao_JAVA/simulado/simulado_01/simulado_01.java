/*
		1 – O LABORATÓRIO DE MEDICAMENTOS SANTO REMÉDIO LTDA. DESEJA SABER QUAL O VALOR DEVE 
		SER COBRADO SOBRE O SEU NOVO MEDICAMENTO (MILAGREIRO) A SER COMERCIALIZADO.
		O LABORATÓRIO DESEJA TER UM LUCRO DE 50% COM A VENDA DO MILAGREIRO.
		SABE-SE QUE O LABORATÓRIO ALÉM DO CUSTO DE FABRICAÇÃO TEM UM CUSTO REFERENTE AOS 
		IMPOSTOS (IPI – 10%, ICMS – 20%, PIS/COFINS – 20%).
		CRIE UM PROGRAMA QUE LEIA O CUSTO DE FABRI 
*/
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor de fabricação do medicamento:\nR$ ");
		double valorBruto = teclado.nextDouble();
		teclado.close();
		
		double custoImpostoIPI = (valorBruto * 1.10) - valorBruto ;
		double custoImpostoICMS = (valorBruto * 1.20) - valorBruto;
		double custoImpostoPIS = (valorBruto * 1.20) - valorBruto;
		double valorFinal =  (custoImpostoIPI + custoImpostoICMS + custoImpostoPIS + valorBruto) * 1.50;
		
		System.out.print("\nO valor final do medicamento com impostos pagos (IPI, ICMS, PIS)" 
							+ " e 50% de lucro será de R$ "+ formatador.format(valorFinal) + ".");



/*
		LABORATÓRIO DE MEDICAMENTOS SANTO REMÉDIO LTDA. ESTÁ VENDENDO SEU MEDICAMENTO
		CURA TUDO COM A SEGUINTE TABELA DE DESCONTOS:
		
		- VALOR DA VENDA ATÉ 20 MIL REAIS, DESCONTO DE 5%.
		- ACIMA DE 20 MIL E ABAIXO DE 50 MIL, DESCONTO DE 10%
		- ACIMA DE 50 MIL, DESCONTO DE 15%
		
		DESENVOLVA UM PROGRAMA QUE LEIA A QUANTIDADE DE CAIXAS DE CURA TUDO VENDIDO.
		CALCULE E IMPRIMA O VALOR A SER PAGO PELO CLIENTE SABENDO-SE QUE O PREÇO DA CAIXA DO 
		MEDICAMENTO É DE R$ 50,00.
*/
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Quantas caixas do CURA TUDO você deseja comprar"
						+ " (valor sem desconto 50 reais/caixa). Vamos lá:\nQuantidade: ");
		int quantidadeCaixa = teclado.nextInt();		
		teclado.close();
		
		int valorBruto = quantidadeCaixa * 50;
		double descontoAplicado = 0;
		double valorComDesconto = 0;
		
		if (valorBruto < 20000) {
			valorComDesconto += valorBruto - (valorBruto * 0.05);
			descontoAplicado += 5;
		}
		
		if (valorBruto >= 20000 && valorBruto <= 50000) {
			valorComDesconto += valorBruto - (valorBruto * 0.10);
			descontoAplicado += 10;
		}
		
		if (valorBruto > 50000) {
			valorComDesconto += valorBruto - (valorBruto * 0.15);
			descontoAplicado += 15;
		}
		
		System.out.print("\nO medicamento recebeu o desconto de " + descontoAplicado 
							+ "%" + " pela quantidade comprada e o valor final a ser pago será de R$ " 
							+ formatador.format(valorComDesconto) + '.');



/*
		3 – O LABORATÓRIO DE MEDICAMENTOS SANTO REMÉDIO LTDA. UTILIZA 10 COMPONENTES (MATÉRIAS 
		PRIMA) PARA FABRICAR O MEDICAMENTO CURA TUDO.
		FAÇA UM PROGRAMA ONDE O USUÁRIO IRÁ INFORMAR O PREÇO DE CADA UM DOS 10 COMPONENTES 
		UTILIZADOS NA FABRICAÇÃO DO CURA TUDO.
		DEPOIS DE LER TODOS OS PREÇOS, O PROGRAMA DEVE APRESENTAR O MAIOR PREÇO LIDO E O MENOR 
		PREÇO LIDO.
*/
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);

		double menorValor = 0;
		double maiorValor = 0;
		
		for (int i = 0; i < 10; i++) {
			
			System.out.print("Digite o valor do " + (i+1) + "° produto: R$ ");
			double valorDigitado = teclado.nextDouble();
			
			//Primeiro laco
			if (i == 0) {
				menorValor += valorDigitado;
			}
			
			//Segundo laco	
			if (i == 1) {
				if (valorDigitado < menorValor){
					maiorValor += menorValor;
					menorValor += valorDigitado;
				} else {
					maiorValor += valorDigitado;
				}
			}
			
			//Demais lacos	
			if (i > 1) {
				if (valorDigitado < menorValor) {
					menorValor = valorDigitado;
				}
				
				if (valorDigitado >  maiorValor) {
					maiorValor = valorDigitado;
				}
			}
			}
			
		System.out.print("\nMaior e menor valor encontrado nos dez componentes necessários para a produção do medicamento."
						+ "\nMenor valor: R$ " + formatador.format(menorValor)
						+ "\nMaior valor: R$ " + formatador.format(maiorValor));
		teclado.close();


/*
		4 – FAÇA UM PROGRAMA PARA O MESMO PROBLEMA DA QUESTÃO 3, MAS AGORA A QUANTIDADE DE 
		COMPONENTES (MATÉRIAS PRIMAS) NÃO SERÁ FIXA. O PROGRAMA DEVE PERGUNTAR SE O USUÁRIO
		DESEJA INFORMAR MAIS UM COMPONENTE. (“DESEJA INFORMAR MAIS UM COMPONENTE? 1 – SIM, 2 – NÃO).
		
		AO FINAL O PROGRAMA DEVE INFORMAR:
		- QUANTOS COMPONENTES FORAM INFORMADOS;
		- MÉDIA (EM REAIS) DOS COMPONENTES INFORMADOS;
		- O MAIOR PREÇO INFORMADO;
		- O MENOR PREÇO INFORMADO;
*/
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);

		double menorValor = 0;
		double maiorValor = 0;
		double mediaValores = 0;

		int i = 0;
		boolean laco = true;
		
		while (laco) {
			
			System.out.print("\nDESEJA INFORMAR MAIS UM COMPONENTE? 1 – SIM, 2 – NÃO: ");
			int opcaoInserir = teclado.nextInt();
			
			if (opcaoInserir == 1) {
				
				System.out.print("Digite o valor do " + (i+1) + "° produto: R$ ");
				double valorDigitado = teclado.nextDouble();

				//Primeiro laco
				if (i == 1) {
					menorValor += valorDigitado;
				}

				//Segundo laco	
				if (i == 2) {
					if (valorDigitado < menorValor){
						maiorValor += menorValor;
						menorValor += valorDigitado;
					} else {
						maiorValor += valorDigitado;
					}
				}
				
				//Demais lacos
				if (i > 1) {
					if (valorDigitado < menorValor) {
						menorValor = valorDigitado;
					}
					
					if (valorDigitado >  maiorValor) {
						maiorValor = valorDigitado;
					}
				}
				
				mediaValores += valorDigitado;
				i+=1;
				
				} else {
					laco = false;
				}
			}
				
		System.out.print("\nOs resultados obtidos com os valores informados:\n"
						+ "\n - Foram informados " + i + " componentes;"
						+ "\n - A média dos preço do componente está em torno de R$ " + formatador.format(mediaValores / i)
						+ "\n - Menor valor: R$ " + formatador.format(menorValor) + ";"
						+ "\n - Maior valor: R$ " + formatador.format(maiorValor) + ".");
		teclado.close();

		
