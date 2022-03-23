1 – TRÊS SENHORAS (DONA BRANCA, DONA ROSA E DONA VIOLETA) PASSEAVAM PELO PARQUE QUANDO DONA 
BRANCA DISSE:
      “NÃO É CURIOSO QUE ESTEJAMOS USANDO VESTIDOS DE CORES BRANCA, ROSA E VIOLETA, EMBORA 
      NENHUMA DE NÓS ESTEJA USANDO UM VESTIDO DE COR IGUAL AO NOSSO PRÓPRIO NOME”?
      “UMA SIMPLES COINCIDÊNCIA” – RESPONDEU A SENHORA COM O VESTIDO VIOLETA.
QUAL A COR DO VESTIDO DE CADA UMA DAS SENHORAS? 
Resposta:

Dona Branca – vestindo rosa (Como a dona branca fez a pergunta e alguém com vestido violeta respondeu, a dona branca só pode estar usando rosa);
Dona Violeta – vestindo branco (Se a dona branca usa rosa, então só resta para a dona violeta usar branco); 
Dona Rosa – vestido violeta (O único vestido possível para ela será o violeta).
  
2 – UMA LESMA ESTÁ SUBINDO UM MURO DE 10 METROS. DURANTE O DIA, ELA CONSEGUE SUBIR DOIS METROS,
PORÉM TODAS AS NOITES, ELA ESCORREGA E DESCE UM METRO. EM QUANTO TEMPO ELA CONSEGUIRÁ CHEGAR 
AO TOPO DO MURO?
Resposta: 9 dias 


3 – UMA FAMÍLIA RESOLVEU PASSEAR DE CARRO. NELE ENTRARAM 1 AVÔ, 2 PAIS, 2 FILHOS E 1 NETO. QUAL O 
NÚMERO MÍNIMO DE PESSOAS DENTRO DO VEÍCULO, AFINAL?
Resposta: 3
  
4 – SE O AMANHÃ DE ONTEM ERA SEXTA-FEIRA, QUE DIA É O DIA DEPOIS DE AMANHÃ DE ONTEM?
Resposta: Sábado  
  
5 – CRIE UM ALGORITMO QUE LEIA UM VALOR NUMÉRICO INTEIRO E APRESENTE COMO RESULTADO O SEU 
ANTECESSOR E O SEU SUCESSOR.

package teste;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
	    
    Scanner teclado = new Scanner(System.in); 

    System.out.print("Digite o número: "); 
    int numero_01 = teclado.nextInt(); 

    int antecessor_01 = numero_01 - 1; 
    int sucessor_01 = numero_01 + 1; 

    System.out.println("O seu número é " + numero_01 + ", o antecessor dele é: " + antecessor_01 + ", e o sucesso é: " + sucessor_01 + "."); 
	}
}
  

6 – CRIE UM ALGORITMO QUE LEIA A IDADE DE UMA PESSOA EXPRESSA EM ANOS, MESES E DIAS E ESCREVA A 
IDADE DESSA PESSOA EXPRESSA APENAS EM DIAS. CONSIDERAR O ANO COM 365 DIAS E OS MESES COM 30
DIAS.

package teste;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
	    
    Scanner teclado = new Scanner(System.in); 

    System.out.print("O ano do seu nascimento: "); 
    int ano = teclado.nextInt(); 

    System.out.print("Digite o mês do seu nascimento: "); 
    int mes = teclado.nextInt(); 

    System.out.print("Digite o dia do seu nascimento: "); 
    int dia = teclado.nextInt(); 

    int dias_total_vivo = (2022 - ano) * 365 + mes * 30 + dia; 

    System.out.print("Você está vivo há: " + dias_total_vivo); 
	}
}


7 – CRIE UM ALGORITMO PARA LER O NÚMERO TOTAL DE ELEITORES DE UM MUNICÍPIO, O NÚMERO DE VOTOS 
BRANCOS, NULOS E VÁLIDOS. O ALGORITMO DEVE CALCULAR E ESCREVER O PERCENTUAL QUE CADA UM 
REPRESENTA EM RELAÇÃO AO TOTAL DE ELEITORES.

package teste;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
	    
    Scanner teclado = new Scanner(System.in); 

    System.out.print("Digite o número total de eleitores: "); 
    float n_total_eleitores = teclado.nextInt(); 

    System.out.print("Número total votos nulos: "); 
    float n_votos_nulos = teclado.nextInt(); 

    System.out.print("Número total votos brancos: "); 
    float n_votos_brancos = teclado.nextInt();

    float n_votos_validos = (n_total_eleitores - n_votos_nulos) - n_votos_brancos; 
    float percentual_nulos = 100 * n_votos_nulos / n_total_eleitores; 
    float percentual_brancos = 100 * n_votos_brancos / n_total_eleitores; 
    float percentual_validos = 100 * n_votos_validos / n_total_eleitores; 

    System.out.println("\n\nA quantidade de votos nulos para essa eleição foi " + percentual_nulos + "%, para votos em branco tivemos uma quantidade de " + percentual_brancos + "%, e a quantidade de votos validos ficou em " + percentual_validos + "%."); 

	}
}


8 – ESCREVA UM ALGORITMO PARA LER O SALÁRIO ATUAL DE UM FUNCIONÁRIO E O PERCENTUAL DA DATA BASE.
CALCULAR O VALOR DO NOVO SALÁRIO E ESCREVER O SALÁRIO ATUAL O E NOVO SALÁRIO DO FUNCIONÁRIO.
  
package teste;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
	    
    Scanner teclado = new Scanner(System.in); 

    System.out.print("Qual o seu salário atual: "); 
    float salario = teclado.nextInt(); 


    System.out.print("Qual será a porcentagem de correção do seu salário para esse ano: "); 
    float correcao_salarial = teclado.nextInt(); 

    float novo_salario = salario + (salario * correcao_salarial / 100); 

    System.out.println("\nO seu salario atual é R$ " + salario + ".");    
    System.out.println("O seu novo salairo será de R$ " + salario + " com a porcentagem indicada."); 

	}
}



9 – O CUSTO DE UM CARRO NOVO PARA O CONSUMIDOR É A SOMA DO CUSTO DE FÁBRICA COM A PORCENTAGEM 
DO DISTRIBUIDOR E DOS IMPOSTOS (APLICADOS AO CUSTO DE FÁBRICA). SUPONDO QUE O PERCENTUAL DO 
DISTRIBUIDOR SEJA DE 28% E DOS IMPOSTOS DE 45%. ESCREVA UM ALGORITMO PARA LER O MODELO DE UM 
CARRO, O SEU CUSTO DE FÁBRICA E ESCREVA O MODELO DO CARRO E SEU CUSTO FINAL AO CONSUMIDOR.
package teste;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
	    
    Scanner teclado = new Scanner(System.in); 

    System.out.print("Qual o modelo do carro: "); 
    String modelo_carro = teclado.nextLine(); 


    System.out.print("Qual o valor de produção do veículo (sem lucro e impostos): "); 
    float valor_bruto = teclado.nextFloat(); 
    
    double lucro = 28, imposto = 45; 
    int valor_final = valor_bruto + (valor_bruto * lucro /100);	 

    System.out.print("\n\nO modelo do carro " + modelo_carro + "terá o custo final para o consumidor aproximado em " ); 

	}
}



10 – UMA REVENDEDORA DE CARROS USADOS PAGA AO SEU VENDEDOR UM SALÁRIO FIXO POR MÊS, MAIS UMA 
COMISSÃO FIXA PARA CADA CARRO VENDIDO E MAIS 5% DO VALOR DAS VENDAS POR ELE EFETUADAS. ESCREVA 
UM ALGORITMO QUE LEIA O NÚMERO DE CARROS POR ELE VENDIDOS, O VALOR TOTAL DE SUAS VENDAS, O 
SALÁRIO FIXO E O VALOR QUE ELE RECEBE POR CARRO VENDIDO. O ALGORITMO DEVE CALCULAR E 
APRESENTAR O SALÁRIO FINAL DO VENDEDOR.
  
package teste;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
	    
	    System.out.print("Bem-vindo ao programa de cálculo salário, vamos lá!");


	    Scanner teclado = new Scanner(System.in);

	    System.out.print("Qual o salário fixo do vendedor: ");
	    float salario_inicial = teclado.nextFloat();		
	    
	    System.out.print("Número de carros vendidos nesse mês: ");
	    int n_carro_vendido = teclado.nextInt();

	    System.out.print("Qual o valor total das vendas realizadas pelo vendedor R$ ");
	    float valor_total = teclado.nextFloat();

	    double comissao_por_carro = (valor_total / n_carro_vendido) * 0.05;
	    double salario_final = salario_inicial + (comissao_por_carro * n_carro_vendido);
	    Double salario_final_preciso = Precision.round(salario_final , 3);

	    System.out.println("\nO sálario final do vendedor em questão ficará em R$ " + salario_final + " .");

	}
}



11 – FAÇA UM ALGORITMO QUE LEIA TRÊS NOTAS DE UM ALUNO. CALCULE E ESCREVA A MÉDIA FINAL DESTE 
ALUNO. CONSIDERE QUE A MÉDIA É PONDERADA E QUE O PESO DAS NOTAS É RESPECTIVAMENTE 2, 3 E 5.
  
package teste;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
	    
	    System.out.print("Bem vindo ao programa de calculo de média, vamos lá!");


	    Scanner teclado = new Scanner(System.in);
	    
	    System.out.print("Digite a 1° nota do aluno: ");
	    float nota_01 = teclado.nextFloat();


	    System.out.print("Digite a 2° nota do aluno: ");
	    float nota_02 = teclado.nextFloat();


	    System.out.print("Digite a 3° nota do aluno: ");
	    float nota_03 = teclado.nextFloat();
	    
	    int peso_01 = 2, peso_02 = 3, peso_03 = 5;
		

	    float media_ponderada= (nota_01 * peso_01) + (nota_02 * peso_02)+ (nota_03 * peso_03) / (peso_01 + peso_02 + peso_03);
	     
	    System.out.println("\nA média ponderada do com as respectivas notas informadas ficará em: " + media_ponderada + " .");   

	}
}




12 – MARIAZINHA COMPROU UM SACO DE RAÇÃO PARA GATOS COM PESO EM QUILOS. ELA POSSUI DOIS GATOS,
O CARAMELO E O FRAJOLA, PARA OS QUAIS FORNECE A QUANTIDADE DE RAÇÃO EM GRAMAS. A QUANTIDADE 
DIÁRIA DE RAÇÃO FORNECIDA PARA CADA GATO É SEMPRE A MESMA. FAÇA UM ALGORITMO QUE RECEBA O PESO 
DO SACO DE RAÇÃO E A QUANTIDADE DE RAÇÃO FORNECIDA PARA CADA GATO, CALCULE O APRESENTE QUANTO 
RESTARÁ DE RAÇÃO NO SACO APÓS CINCO DIAS


package teste;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
	    
	    System.out.print("Bem-vindo ao programa de cálculo de ração para 2 gatos, vamos lá!");


	    Scanner teclado = new Scanner(System.in);
	    
	    System.out.print("Digite o peso (Kg) do saco de ração: ");
	    double peso_racao = teclado.nextDouble();

	    System.out.print("Quantidade de ração diária (ex: 0.100) para o gato Caramelo: ");
	    double qnt_caramelo = teclado.nextDouble();

	    System.out.print("Quantidade de ração diária (ex: 0.100) para o gato Frajola: ");
	    double qnt_frajola = teclado.nextDouble();
	
	    double qnt_racao_consumida = (qnt_caramelo * 5) + (qnt_frajola * 5);
	    double qnt_racao_disponivel = peso_racao - qnt_racao_consumida;
	    
	    System.out.println("\nA quantidade de ração disponivel no final do quinto dia será de " + qnt_racao_disponivel + " Kg.");   

	}
}
