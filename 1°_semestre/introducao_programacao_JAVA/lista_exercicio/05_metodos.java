public static void main(String[] args) {
		/*
		 *  01 - DESENVOLVA UM PROGRAMA QUE LEIA A IDADE DE UM NADADOR. DESENVOLVA UM MÉTODO SEM RETORNO
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

//	Criando lista de Notas
	Double[] notas = new Double[3];

// 	Alimentando a lista de notas
	for (int i = 0; i < 3; i++) {
		System.out.print("Digite a nota do aluno: ");
		double nota = teclado.nextDouble();
		notas[i] = nota;
	}

//	Condicional para calculo
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


########################################################################################################


public static void main(String[] args) {
	/*
	 * 04 - FAÇA UM PROGRAMA QUE LEIA UMA MATRIZ A DE TAMANHO 3X4.EM SEGUIDA DESENVOLVA UM MÉTODO
	 * COM RETORNO (“FUNÇÃO”) QUE RECEBA COMO PARÂMETRO A MATRIZ A E CONTABILIZE OS NÚMEROS PARES.
	 * O PROGRAMA DEVE APRESENTAR QUANTOS NÚMEROS PARES A MATRIZ A POSSUI.
	 */

	Scanner teclado = new Scanner(System.in);
	double [][] matrizA = new double[3][4];

	for (int i = 0; i < matrizA.length; i++) {
		for (int j = 0; j < matrizA[i].length; j++) {
			System.out.print("Informe a posição [" + i + "][" + j + "]: ");
			matrizA [i][j] = teclado.nextDouble(); 
		}	
	}
	teclado.close();
	System.out.print("\nA quantidade de números pares na matriz informada é:"
			+ " " + pares(matrizA) + ".");

	}

static int pares (double[][] matriz) {
	int qntPares = 0;

	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++) {
			double resto = matriz[i][j] % 2;
			if (resto == 0.0) {
				qntPares+=1;
			}
		}
	}

	return qntPares;
}

########################################################################################################


public static void main(String[] args) {
	/*
	 * 05 - FAÇA UM PROGRAMA QUE LEIA UMA MATRIZ A DE TAMANHO 4X4. EM SEGUIDA DESENVOLVA 
	 * UM MÉTODO COM RETORNO (“FUNÇÃO”) QUE RECEBA COM O PARÂMETRO A MATRIZ A E SOME OS
	 * VALORES DA DIAGONAL PRINCIPAL. O PROGRAMA DEVE APRESENTAR A SOMA DA DIAGONAL PRINCIPAL 
	 * DA MATRIZ A
	 */ 

	Scanner teclado = new Scanner(System.in);
	double [][] matrizA = new double[3][4];

	for (int i = 0; i < matrizA.length; i++) {
		for (int j = 0; j < matrizA[i].length; j++) {
			System.out.print("Informe a posição [" + i + "][" + j + "]: ");
			matrizA [i][j] = teclado.nextDouble(); 
		}	
	}
	teclado.close();

}

static double pares (double[][] matriz) {
	int somaDiagonal = 0;

	for (int i = 0; i < matriz.length; i++) {
		somaDiagonal += matriz [i][i];
	}

	return somaDiagonal;
}



########################################################################################################

public static void main(String[] args) {

	/*
	 * 06 - FAÇA UM PROGRAMA QUE LEIA UMA MATRIZ A DE TAMANHO 3X3. EM SEGUIDA DESENVOLVA
	 * UM MÉTODO SEM RETORNO (“PROCEDIMENTO”) QUE RECEBA COMO PARÂMETRO A MATRIZ A E 
	 * IDENTIFIQUE A POSIÇÃO DO MENOR NÚMERO DA MATRIZ. O PROGRAMA DEVE APRESENTAR A
	 * POSIÇÃO E O MENOR ELEMENTO DA MATRIZ A.
	 */
	System.out.println("\nCrição da Matriz A, vamos lá! \n");
	Scanner teclado = new Scanner(System.in);
	double [][] matrizA = new double[3][3];

	for (int i = 0; i < matrizA.length; i++) {
		for (int j = 0; j < matrizA[i].length; j++) {
			System.out.print("Informe a posição [" + i + "][" + j + "]: ");
			matrizA [i][j] = teclado.nextDouble(); 
		}	
	}

	teclado.close();
	menor(matrizA);
}

static void menor (double[][] matriz) {
	int posicaoI = 0;
	int posicaoJ = 0;
	double menor = 0;

	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++) {
			if (matriz[i][j] < menor || (i == 0  && j == 0)) {
				menor = matriz[i][j];
				posicaoI = i;
				posicaoJ = j;
			}
		}
	}

	System.out.print("\nO menor elemento da matriz digitado: " + menor
						+ "\nSua posição é " + posicaoI + " x " + posicaoJ);			
}

########################################################################################################

public static void main(String[] args) {
	/*
	 * 07 - DESENVOLVA UM PROGRAMA QUE IDENTIFIQUE TODOS OS NÚMEROS PRIMOS MENORES QUE 100.
	 * DESENVOLVA UM MÉTODO COM RETORNO (“FUNÇÃO”) QUE RECEBA UM NÚMERO COMO PARÂMETRO	
	 * E INFORME SE ELE É UM NÚMERO PRIMO.LEMBRANDO QUE O NÚMERO 1 NÃO É PRIMO E QUE TODO
	 * NÚMERO PRIMO TEM DOIS DIVISORES (O NÚMERO 1 E ELE MESMO).
	 */


	System.out.print("\nPrograma para descobrir se o número é primo, vamos lá!");
	Scanner teclado = new Scanner(System.in);
	System.out.print("\nDigite um número: ");
	double numeroUser = teclado.nextDouble();
	teclado.close();


//Definindo se o número do usuário é primo
	if(eprimo(numeroUser)) {
    		System.out.println("\nSeu número é primo.");
	}
	else {
		 System.out.println("\nSeu número NÃO é primo.");
	}


	//Imprimindo relação de números primos de zero a cem.
	System.out.print("\nAbaixo a relação de números primos de zero a cem\n");
	for (double i = 2; i <= 100; i++) {
	    if( eprimo(i) ) {
		System.out.print("\n" + i + " é primo.");
	    }
	}

}
	
//Função para definir se número é primo ou não
private static boolean eprimo(double numero) {
for (int i = 2; i < numero; i++) {
    if (numero % i == 0.0)
	return false;   
}
return true;
}


########################################################################################################

public static void main(String[] args) {
	/*
	 DESENVOLVA UM PROGRAMA ONDE O USUÁRIO INFORMA TRÊS NÚMEROS. DESENVOLVA 
	 UM MÉTODO COM RETORNO (“FUNÇÃO”) QUE VERIFIQUE SE ESSES VALORES (PASSADOS POR PARÂMETROS) 
	 FORMAM UM TRIÂNGULO. CASO FORMEM UM TRIÂNGULO O SISTEMA DEVE TER UM MÉTODO SEM RETORNO 
	 (“PROCEDIMENTO”) QUE RECEBA ESSES VALORES COMO PARÂMETROS E CLASSIFIQUE ESSE TRIÂNGULO.
	 DEFINIÇÕES:

	 - PARA SER UM TRIÂNGULO O COMPRIMENTO DE CADA LADO DE UM TRIÂNGULO DEVE SER MENOR QUE A SOMA
	   DO COMPRIMENTO DOS OUTROS DOIS LADOS. CADA NÚMERO INFORMADO PELO USUÁRIO CONSISTE EM UM LADO.

	 - UM TRIÂNGULO EQUILÁTERO TEM TODOS OS LADOS IGUAIS, JÁ O TRIÂNGULO ISÓSCELES TEM DOIS LADOS 
	   IGUAIS E O TRIÂNGULO ESCALENO TEM OS TRÊS LADOS DIFERENTES.

	   O SISTEMA DEVE INFORMAR SE OS NÚMEROS FORMAM OU NÃO UM TRIÂNGULO E QUAL A SUA CLASSIFICAÇÃO.
	 */

	System.out.println("\nDigite três números, vamos lá! \n");
	Scanner teclado = new Scanner(System.in);
	double [] lista = new double[3];

	for (int i = 0; i < 3; i++) {
		System.out.print("Informe o número: ");
		lista[i] = teclado.nextDouble(); 

	}
	teclado.close();

	int ladosIguais = triangulo(lista);
	String[] tipo = {"TRIÂNGULO EQUILÁTERO", "TRIÂNGULO ISÓSCELES", "TRIÂNGULO ESCALENO" };

	if (ladosIguais == 3) {
		System.out.print("\nCom o número digitado temos um triangulo");
		System.out.print("\nO tipo dele é: " + tipo[lados(lista)]);

	} else {
		System.out.print("\nCom o número digitado NÃO temos um triangulo!");
	}
}
		
//Função para definir se é um tringulo
static int triangulo(double[] lista) {

double [] listaSoma = new double[3];
int triangulo = 0;

for	(int i = 0; i < 3; i++) {
	double soma = 0;

	//Descobrindo os diferentes
	for (int j = 0; j < 3; j++) {
		if (j != i) {
			double elemento = lista[j];
			listaSoma[j] = elemento;
		}	
	}

	//Somando os diferentes
	for (int n = 0; n < 3; n++) {
		soma+=listaSoma[n];
	}

	//É um triangulo
	if (lista[i] < soma) {
		triangulo++;
	}
}

return triangulo;		
}
    
//Funcao para definir a quantidade de lados iguais
static int lados(double[] lista) {
int lados = 0;
for (int i = 0; i < 3; i++ ) {
	int provisorio = 0;
	for (int j = 0; j < 3; j++ ) {
		if(lista[i] == lista[j] && i != j) {
			provisorio++;
		}
	}
	if(provisorio > lados) {
		lados = provisorio;
	}
}

return lados;
}


########################################################################################################


########################################################################################################

