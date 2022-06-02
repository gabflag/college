//Abaixo está um exemplo de funcao calculando um salario com os devidos descontos. Nao se atenha a logica do programa, mas sim, 
//a estrutura utilizada para a criacao e utilizacao de funcao.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int mantemLaco = 1;
		do {
			//Recebendo a info do salario
			System.out.println("Digite o salário bruto: ");
			double salarioBruto = teclado.nextDouble();
				
			double salario = calcula(salarioBruto);
	
			//Imprimindo as informações
			System.out.println("Salário Bruto é R$ " + salarioBruto + ".");
			System.out.println("Salário Bruto é R$ " + salario + ".");
			
			System.out.println("Você quer informar mais um salario (1 a para SIM e 2 para NAO): ");
			mantemLaco = teclado.nextInt();
			
		} while(mantemLaco==1);	
		teclado.close();
		}
	static double calcula(double salarioBruto) {
    
			// Definindo salario - INSS
			double salario = 0;
			if(salarioBruto <= 1500) {
				salario = salarioBruto * 0.95;
			} else {
				
				if (salarioBruto > 3000) {
					salario =  salarioBruto * 0.85;
				} else {
					salario =  salarioBruto * 0.90;
				}
			}
			
			//Definindo salario liquido - Imposto de Renda
			double salarioLiquido = 0;
			if(salario <= 2000) {
				salarioLiquido = salario;
			} else {
				
				if (salario > 5000) {
					salarioLiquido =  salario * 0.75;
				} else {
					salarioLiquido =  salario * 0.85;
				}
			}
			return salarioLiquido;
	}
}

