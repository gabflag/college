//   Exercicio 01

    Scanner teclado = new Scanner(System.in);
		
		String[] nomes = new String[10];
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Digite o " + (i+1) + "° nome: ");
			String nome = teclado.nextLine();
			nomes[i] = nome;
		}
		
		teclado.close();
		System.out.println("\n------------------------------\nNa ordem crescente:\n");
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i] + " está na " + (i+1) + "° posição.");
		}
		
		System.out.println("\n------------------------------\nNa ordem decrescente:\n");
		for (int i = 10; i <= nomes.length && i > 0; i--) {
			System.out.println(nomes[i-1] + " está na " + (i) + "° posição.");
		}


//  Atv_02

		Scanner teclado = new Scanner(System.in);
		double[] numeros = new double[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i+1) + "° número: ");
			double numeroLido = teclado.nextDouble();
			numeros[i] = numeroLido;
		}
		
		System.out.print("\n------------\nDigite agora um valor para a variavel B: ");
		double novoNumero = teclado.nextDouble();
		
		int achei = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == novoNumero) {
				System.out.println("\nACHEI!!! O número da posição " + (i+1) + " é igual ao valor da variável B.");
				achei++;
			}		
		}
		
		if(achei == 0) {
			System.out.print("\nNão achei!");
		}
		teclado.close();


//  Atv_03 

		Scanner teclado = new Scanner(System.in);
		double[] numeros = new double[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i+1) + "° número: ");
			double numeroLido = teclado.nextDouble();
			numeros[i] = numeroLido;
		}
		
		System.out.print("\n------------\nDigite agora um valor para a variavel B: ");
		double novoNumero = teclado.nextDouble();
		
		int ocorrencia = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == novoNumero) {
				ocorrencia++;
			}		
		}
		System.out.print("\nA váriavel B aparece: " + ocorrencia + " no array.");
		teclado.close();



//  Atv_04

		/*
		 4–DESENVOLVA   UM   PROGRAMA   QUE LEIA 10 NÚMEROS (ACEITAR   SOMENTE   NÚMEROS   POSITIVOS) 
		 E ARMAZENE EM  UM ARRAY. O PROGRAMA  DEVE  INFORMAR O VALOR DO MAIOR E DO MENOR NÚMERO E
		 AS SUAS RESPECTIVAS POSIÇÕES NO ARRAY.
		 */
		
		Scanner teclado = new Scanner(System.in);
		Double[] numeros = new Double[10];
		
		int posicaoMaior = 0, posicaoMenor = 0;
		double maior = 0, menor = 0;

		int mantemLaco = 0;
		while (mantemLaco != 10) {

			System.out.print("Digite o " + (mantemLaco+1) + "° número: ");
			double numeroDigitado = teclado.nextDouble();
			
			if (numeroDigitado > 0) {
				numeros[mantemLaco] = numeroDigitado;
				if (numeroDigitado > maior) {
					maior = numeros[mantemLaco];
					posicaoMaior = mantemLaco;
				}
				if (numeroDigitado <= menor || mantemLaco == 0) {
					menor = numeros[mantemLaco];
					posicaoMenor = mantemLaco;
				}				 
				 mantemLaco++;
			 }
			
			 if (numeroDigitado < 0) {
				 System.out.println("Digite um número positivo!");
			 }
		}
		
		teclado.close();
		
		System.out.println("\n------------\nO menor valor digitado foi " + menor + 
							" e sua posição no array é " + posicaoMenor +
							"\nO maior valor digitado foi " + maior + 
							" e sua posição no array é " + posicaoMaior);


//  Atv_05

		/*
		 6–FAÇA UM PROGRAMA PARA LERA ARMAZENAR EM UM ARRAY A 
		 TEMPERATURA MÉDIA DOS MESES DO ANO.O PROGRAMA DEVE CALCULAR:
		 -MENOR TEMPERATURA MÉDIA;
		 -MAIOR TEMPERATURA MÉDIA;
		 -MÉDIA DA TEMPERATURA DO ANO;
		 -A QUANTIDADE DE MESES EM QUE A TEMPERATURA FOI INFERIOR À MÉDIA ANUAL;
		 */
		
//  Lendo temperaturas
		Scanner teclado = new Scanner(System.in);
		double[] mesesAnoTemperatura = new double[12];
		double maior = 0, menor = 0;
		int posicaoMaior = 0, posicaoMenor = 0;
		
		for (int i = 0; i < mesesAnoTemperatura.length; i++) {
			System.out.print("Digite a nota do " + (i+1) + "° mês: ");
			double tempLida = teclado.nextDouble();
			mesesAnoTemperatura [i] = tempLida;
			
			if (tempLida > maior) {
				maior = mesesAnoTemperatura[i];
				posicaoMaior = i;
			}
			if (tempLida <= menor || i == 0) {
				menor = mesesAnoTemperatura[i];
				posicaoMenor = i;
			}
		}
		teclado.close();
	
//  Media Temperaturas
		double somaTemp = 0;
		for (int i = 0; i < mesesAnoTemperatura.length; i++) {
			somaTemp += mesesAnoTemperatura[i];
		}
		double mediaTemp = somaTemp / 12;
	
//  Quantidade de veses que a temperatura foi menor
		int menorQueMedia = 0;
		for (int i = 0; i < mesesAnoTemperatura.length; i++) {
			if (mesesAnoTemperatura[i] > mediaTemp) {
				menorQueMedia ++;			
			}
		}
		
		System.out.println("\n------------\nA menor média temperatura do ano ocorreu no mês "
							+ (posicaoMenor+1) + " registrando " + menor + " C°." 
							+"\nA maior média temperatura do ano ocorreu no mês "
							+ (posicaoMaior+1) + " registrando " + maior + " C°." 	
							+ "\nA média de temperatura do ano ficou em " + mediaTemp + "C°"
							+ "\nA quantidade de meses que a temperatura foi menor do que a média"
							+ " anual foi de " + menorQueMedia + ".");

//  Atv_07

		/*
		 7–FAÇA UM PROGRAMA QUE LEIA UMA MATRIZ A DE TAMANHO 3X3.
		 EM SEGUIDA O PROGRAMA DEVE SOLICITAR UM NÚMERO AO USUÁRIO E 
		 GERAR UMA MATRIZ RESULTADO (OS ELEMENTOS DA MATRIZ A MULTIPLICADO
		 PELO VALOR INFORMADO PELO USUÁRIO). 
		 APRESENTE A MATRIZ AE A MATRIZ RESULTADO.
		 */
	
//  Criando a matriz A
		Scanner teclado = new Scanner(System.in);
		double [][] matrizA = new double[3][3];
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print("Informe a posição [" + i + "][" + j + "]: ");
				matrizA [i][j] = teclado.nextDouble(); 
			}	
		}
		
//  Matriz B sendo calculada com valor indicado:
		System.out.print("\nDigite o valor para multiplicar a matriz A: ");
		double multiplicador = teclado.nextDouble();
		
		double [][] matrizB = new double[3][3];
		
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				matrizB[i][j] = multiplicador * (matrizA [i][j]); 
			}	
		}
		
//  Imprimindo matriz A
		System.out.println("---------------------\nMatriz A\n");
		for(int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println("");
		}
		
//  Imprimindo matriz B
		System.out.println("---------------------\nMatriz A\n");
		for(int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				System.out.print(matrizB[i][j] + " ");
			}
			System.out.println("");
		}
		teclado.close();

//  Atv_08
		/*
		 8–FAÇA UM  PROGRAMA  QUE  LEIA UMA  MATRIZ A 
		 E  UMA  MATRIZ B,AMBAS DE  TAMANHO 3X3. O PROGRAMA DEVE 
		 GERAR UMA MATRIZ RESULTADO QUE É A SOMA DA MATRIZ A COM A 
		 MATRIZ B. APRESENTE A MATRIZA,B E RESULTADO.
		 */
		
		
		//Criando a matriz A
		Scanner teclado = new Scanner(System.in);
		
		double [][] matrizA = new double[3][3];
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print("Informe a posição na MATRIZ A [" + i + "][" + j + "]: ");
				matrizA [i][j] = teclado.nextDouble(); 
			}	
		}
		
		//Criando a matriz B
		System.out.println("");
		double [][] matrizB = new double[3][3];
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				System.out.print("Informe a posição na MATRIZ B [" + i + "][" + j + "]: ");
				matrizB [i][j] = teclado.nextDouble(); 
			}	
		}
		
		//Somando as Matrizes
		double [][] matrizSoma = new double[3][3];
		for (int i = 0; i < matrizSoma.length; i++) {
			for (int j = 0; j < matrizSoma[i].length; j++) {
				matrizSoma [i][j] = (matrizA [i][j]) + (matrizB [i][j]);
			}
		}
	
		
		//Imprimindo matriz A
		System.out.println("---------------------\nMatriz A\n");
		for(int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println("");
		}
		
		//Imprimindo matriz B
		System.out.println("---------------------\nMatriz A\n");
		for(int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				System.out.print(matrizB[i][j] + " ");
			}
			System.out.println("");
		}
		
		//Imprimindo a soma das matrizes
		System.out.println("---------------------\nMatriz A\n");
		for(int i = 0; i < matrizSoma.length; i++) {
			for (int j = 0; j < matrizSoma[i].length; j++) {
				System.out.print(matrizSoma[i][j] + " ");
			}
			System.out.println("");
		}
				
		teclado.close();

//Atv_09

		/*
		 9 – FAÇA UM  PROGRAMA  QUE  LEIA UMA  MATRIZ A DE TAMANHO 4X4.
		 O PROGRAMA  DEVE  IDENTIFICAR  QUAL  O MENOR ELEMENTO E A SUA POSIÇÃO NA MATRIZ.
		 */
		
    Scanner teclado = new Scanner(System.in);
		int posicaoMenorI = 0, posicaoMenorJ = 0;
		double menor = 0;
		double laco = 1;
		double [][] matrizA = new double[4][4];
		
    for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print("Informe a posição na MATRIZ A [" + i + "][" + j + "]: ");
				double numeroDigitado = teclado.nextDouble();
				matrizA [i][j] = numeroDigitado;
				
				if (numeroDigitado <= menor || laco == 1) {
					menor = numeroDigitado;
					posicaoMenorI = i;
					posicaoMenorJ = j;
					laco = 0;
				}	
			}	
		}
		
		System.out.println("\n---------------------\nO menor elemento na matriz é: " + menor
							+ "\nEstá localizado na posição [" +posicaoMenorI+"]["+posicaoMenorJ+"].");
		
//  Imprimindo matriz A
		System.out.println("---------------------\nMatriz A\n");
		for(int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println("");
		}
	  teclado.close();

//Atv_10

import java.util.Scanner;
import java.util.Arrays;

		Scanner teclado = new Scanner(System.in);
		double[] numeros = new double[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i+1) + "° número: ");
			double numeroLido = teclado.nextDouble();
			numeros[i] = numeroLido;
		}
		
		System.out.println("");
		Arrays.sort(numeros);
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		teclado.close();	
	


