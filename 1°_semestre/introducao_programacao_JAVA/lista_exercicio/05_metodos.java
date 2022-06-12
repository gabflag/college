public static void main(String[] args) {
		/*
		 *	01 - DESENVOLVA UM PROGRAMA QUE LEIA A IDADE DE UM NADADOR. DESENVOLVA UM MÉTODO SEM RETORNO
		 * (“PROCEDIMENTO”) QUE RECEBA ESSA IDADE POR PARÂMETRO E INFORMEA CATEGORIA DO 
		 *  NADADOR CONFORME TABELA ABAIXO:
		 *  
		 *  IDADE				CATEGORIA
		 *  ATÉ 10 ANOS			MIRIM
		 *  11 A 14 ANOS		INFANTIL
		 *  15 A 19 ANOS		JUVENIL
		 *  ACIMA DE 19 		ADULTO
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a idade do participante: ");
		int idade = teclado.nextInt();
		teclado.close();
		categoria(idade);
	}
		static void categoria(int idade) {
				
		if (idade <= 10) {
			System.out.print("Com a idade informada ele participa da categoria: MIRIM");
		}
		if (idade >= 11 && idade <= 14) {
			System.out.print("Com a idade informada ele participa da categoria: INFANTIL");
		}
		if (idade >= 15 && idade <= 19) {
			System.out.print("Com a idade informada ele participa da categoria: JUVENIL");
		}
		if (idade > 19) {
			System.out.print("Com a idade informada ele participa da categoria: ADULTO");
		}
	
	}

########################################################################################################

public static void main(String[] args) {
		/*
		 * 02 - DESENVOLVA UM PROGRAMA QUE LEIA A QUANTIDADE DEPONTOS DE UM ALUNO EM UMA AVALIAÇÃO.
		 * DESENVOLVAUM MÉTODO SEM RETORNO (“PROCEDIMENTO”)QUE RECEBAESSA PONTUAÇÃO POR PARÂMETRO
		 * E INFORMEO CONCEITO DO ALUNO NA AVALIAÇÃO CONFORME A TABELA ABAIXO:
		 * 
		 * PONTOS			CONCEITO
		 * ATÉ 60 PONTOS	INSATISFATÓRIO
		 * 61 A 75 PONTOS	SATISFATÓRIO
		 * 76 A 90 PONTOS 	BOM
		 * ACIMA DE 90		ÓTIMO
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a nota do aluno: ");
		double nota = teclado.nextDouble();
		teclado.close();
		conceito(nota);
	}
	
		static void conceito(double nota) {
			System.out.println("\n#######################");
			if (nota <= 60) {
				System.out.print("O conceito do aluno é: INSATISFATÓRIO");
			}
			if (nota >= 61 && nota <= 75) {
				System.out.print("O conceito do aluno é: SATISFATÓRIO");
			}
			if (nota >= 76 && nota <= 90) {
				System.out.print("O conceito do aluno é: BOM");
			}
			if (nota > 90) {
				System.out.print("O conceito do aluno é: ÓTIMO");
			}
			System.out.println("\n#######################");
	}


########################################################################################################

	public static void main(String[] args) {
		/*
		 * 03 - DESENVOLVA UM PROGRAMA QUE LEIA E ARMAZENE 3 NOTAS DE UM ALUNO EM UM ARRAY.
		 * DESENVOLVA UM MÉTODO SEM RETORNO (“PROCEDIMENTO”) QUE RECEBA O ARRAY DE NOTAS DE
		 * UM ALUNO E O TIPO DE CÁLCULO A SER EXECUTADO POR PARÂMETRO. O PARÂMETRO TIPO DE 
		 * CÁLCULO SERÁ UM INTEIRO (1 OU 2) E DEVE REALIZAR O CÁLCULO CONFORME ESPECIFICADO 
		 * ABAIXO:
		 * 1– O MÉTODO CALCULA E APRESENTA A MÉDIA ARITMÉTICA DAS NOTAS DO ALUNO;
		 * 2– O MÉTODO CALCULA E APRESENTA A MÉDIA PONDERADA (PESOS: 5, 3 E 2).
		 */
		
		Scanner teclado = new Scanner(System.in);
		
//		Criando lista de Notas
		Double[] notas = new Double[3];
		
// 		Alimentando a lista de notas
		for (int i = 0; i < 3; i++) {
			System.out.print("Digite a nota do aluno: ");
			double nota = teclado.nextDouble();
			notas[i] = nota;
		}

//		Condicional para calculo
		System.out.println("Qual tipo de parametro de calculo \n 1 - Aritimética\n 2 - Ponderada(PESOS:5,3 E 2)");
		int tipoMedia = teclado.nextInt();
		teclado.close();
		
		calculo(notas,tipoMedia);
	}
		
	static void calculo (Double[] notas, int tipoMedia) {
		
		double notaFinal = 0;
		
		if (tipoMedia == 1) {
			double somaMedia = 0;
			for (int i = 0; i < 3; i++) {
				somaMedia += notas[i];
			}
			notaFinal += somaMedia / 3; 
		}
		
		if (tipoMedia == 2) {
			double somaMedia = 0;
			for (int i = 0; i < 3; i++) {
				if (i == 0) {
					somaMedia += notas[i] * 5;
				}
				if (i == 1) {
					somaMedia += notas[i] * 3;
				}
				if (i == 2) {
					somaMedia += notas[i] * 2;
				}
				
			notaFinal = somaMedia / 10;
			}
		
		}
		System.out.println("A nota final do aluno é: " + notaFinal);
	}

