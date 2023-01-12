import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int senha, senhacorreta;
		int tentativas = 3;
		senhacorreta = 2308;

		System.out.print("Digite sua senha: ");
		senha = sc.nextInt();

		while (senha != senhacorreta && tentativas > 0) {
			System.out.print("Senha incorreta, restam " + tentativas + " tentativas: ");
			senha = sc.nextInt();
			tentativas--;
		}

		if (senha == senhacorreta) {
			int x, mes;
			String dia, mesnome;

			System.out.print("Insira o mês: ");
			mes = sc.nextInt();

			switch (mes) {
			case 1:
				mesnome = "Janeiro";
				break;
			case 2:
				mesnome = "Fevereiro";
				break;
			case 3:
				mesnome = "Março";
				break;
			case 4:
				mesnome = "Abril";
				break;
			case 5:
				mesnome = "Maio";
				break;
			case 6:
				mesnome = "Junho";
				break;
			case 7:
				mesnome = "Julho";
				break;
			case 8:
				mesnome = "Agosto";
				break;
			case 9:
				mesnome = "Setembro";
				break;
			case 10:
				mesnome = "Outubro";
				break;
			case 11:
				mesnome = "Novembro";
				break;
			case 12:
				mesnome = "Dezembro";
				break;
			default:
				mesnome = "Mes inexistente";
				break;

			}

			System.out.print("Insira um dia do mês de " + mesnome + " de 2023: ");
			x = sc.nextInt();

			switch (mes) {
			case 1:
				switch (x) {
				case 1, 8, 15, 22, 29:
					dia = "Domingo";
					break;
				case 2, 9, 16, 23, 30:
					dia = "Segunda-feira";
					break;
				case 3, 10, 17, 24, 31:
					dia = "Terça-feira";
					break;
				case 4, 11, 18, 25:
					dia = "Quarta-feira";
					break;
				case 5, 12, 19, 26:
					dia = "Quinta-feira";
					break;
				case 6, 13, 20, 27:
					dia = "Sexta-feira";
					break;
				case 7, 14, 21, 28:
					dia = "Sabado";
					break;
				default:
					dia = "Valor Invalido";

				}
				System.out.println("Dia da semana: " + dia);
				break;

			case 2:
				switch (x) {
				case 5, 12, 19, 26:
					dia = "Domingo";
					break;
				case 6, 13, 20, 27:
					dia = "Segunda-feira";
					break;
				case 7, 14, 21, 28:
					dia = "Terça-feira";
					break;
				case 1, 8, 15, 22:
					dia = "Quarta-feira";
					break;
				case 2, 9, 16, 23:
					dia = "Quinta-feira";
					break;
				case 3, 10, 17, 24:
					dia = "Sexta-feira";
					break;
				case 4, 11, 18, 25:
					dia = "Sabado";
					break;
				default:
					dia = "Valor Invalido";

				}
				System.out.println("Dia da semana: " + dia);
				break;

			case 3:
				switch (x) {
				case 5, 12, 19, 26:
					dia = "Domingo";
					break;
				case 6, 13, 20, 27:
					dia = "Segunda-feira";
					break;
				case 7, 14, 21, 28:
					dia = "Terça-feira";
					break;
				case 1, 8, 15, 22, 29:
					dia = "Quarta-feira";
					break;
				case 2, 9, 16, 23, 30:
					dia = "Quinta-feira";
					break;
				case 3, 10, 17, 24, 31:
					dia = "Sexta-feira";
					break;
				case 4, 11, 18, 25:
					dia = "Sabado";
					break;
				default:
					dia = "Valor Invalido";

				}
				System.out.println("Dia da semana: " + dia);
				break;
			case 4:
				switch (x) {
				case 2, 9, 16, 23, 30:
					dia = "Domingo";
					break;
				case 3, 10, 17, 24:
					dia = "Segunda-feira";
					break;
				case 4, 11, 18, 25:
					dia = "Terça-feira";
					break;
				case 5, 12, 19, 26:
					dia = "Quarta-feira";
					break;
				case 6, 13, 20, 27:
					dia = "Quinta-feira";
					break;
				case 7, 14, 21, 28:
					dia = "Sexta-feira";
					break;
				case 1, 8, 15, 22, 29:
					dia = "Sabado";
					break;
				default:
					dia = "Valor Invalido";

				}
				System.out.println("Dia da semana: " + dia);
				break;
			case 5:
				switch (x) {
				case 7, 14, 21, 28:
					dia = "Domingo";
					break;
				case 1, 8, 15, 22, 29:
					dia = "Segunda-feira";
					break;
				case 2, 9, 16, 23, 30:
					dia = "Terça-feira";
					break;
				case 3, 10, 17, 24, 31:
					dia = "Quarta-feira";
					break;
				case 4, 11, 18, 25:
					dia = "Quinta-feira";
					break;
				case 5, 12, 19, 26:
					dia = "Sexta-feira";
					break;
				case 6, 13, 20, 27:
					dia = "Sabado";
					break;
				default:
					dia = "Valor Invalido";

				}
				System.out.println("Dia da semana: " + dia);
				break;
			case 6:
				switch (x) {
				case 4, 11, 18, 25:
					dia = "Domingo";
					break;
				case 5, 12, 19, 26:
					dia = "Segunda-feira";
					break;
				case 6, 13, 20, 27:
					dia = "Terça-feira";
					break;
				case 7, 14, 21, 28:
					dia = "Quarta-feira";
					break;
				case 1, 8, 15, 22, 29:
					dia = "Quinta-feira";
					break;
				case 2, 9, 16, 23, 30:
					dia = "Sexta-feira";
					break;
				case 3, 10, 17, 24:
					dia = "Sabado";
					break;
				default:
					dia = "Valor Invalido";

				}
				System.out.println("Dia da semana: " + dia);
				break;
			case 7:
				switch (x) {
				case 2, 9, 16, 23, 30:
					dia = "Domingo";
					break;
				case 3, 10, 17, 24, 31:
					dia = "Segunda-feira";
					break;
				case 4, 11, 18, 25:
					dia = "Terça-feira";
					break;
				case 5, 12, 19, 26:
					dia = "Quarta-feira";
					break;
				case 6, 13, 20, 27:
					dia = "Quinta-feira";
					break;
				case 7, 14, 21, 28:
					dia = "Sexta-feira";
					break;
				case 1, 8, 15, 22, 29:
					dia = "Sabado";
					break;
				default:
					dia = "Valor Invalido";

				}
				System.out.println("Dia da semana: " + dia);
				break;

			case 8:
				switch (x) {
				case 6, 13, 20, 27:
					dia = "Domingo";
					break;
				case 7, 14, 21, 28:
					dia = "Segunda-feira";
					break;
				case 1, 8, 15, 22, 29:
					dia = "Terça-feira";
					break;
				case 2, 9, 16, 23, 30:
					dia = "Quarta-feira";
					break;
				case 3, 10, 17, 24, 31:
					dia = "Quinta-feira";
					break;
				case 4, 11, 18, 25:
					dia = "Sexta-feira";
					break;
				case 5, 12, 19, 26:
					dia = "Sabado";
					break;
				default:
					dia = "Valor Invalido";

				}
				System.out.println("Dia da semana: " + dia);
				break;

			case 9:
				switch (x) {
				case 3, 10, 17, 24:
					dia = "Domingo";
					break;
				case 4, 11, 18, 25:
					dia = "Segunda-feira";
					break;
				case 5, 12, 19, 26:
					dia = "Terça-feira";
					break;
				case 6, 13, 20, 27:
					dia = "Quarta-feira";
					break;
				case 7, 14, 21, 28:
					dia = "Quinta-feira";
					break;
				case 1, 8, 15, 22, 29:
					dia = "Sexta-feira";
					break;
				case 2, 9, 16, 23, 30:
					dia = "Sabado";
					break;
				default:
					dia = "Valor Invalido";

				}
				System.out.println("Dia da semana: " + dia);
				break;

			case 10:
				switch (x) {
				case 1, 8, 15, 22, 29:
					dia = "Domingo";
					break;
				case 2, 9, 16, 23, 30:
					dia = "Segunda-feira";
					break;
				case 3, 10, 17, 24, 31:
					dia = "Terça-feira";
					break;
				case 4, 11, 18, 25:
					dia = "Quarta-feira";
					break;
				case 5, 12, 19, 26:
					dia = "Quinta-feira";
					break;
				case 6, 13, 20, 27:
					dia = "Sexta-feira";
					break;
				case 7, 14, 21, 28:
					dia = "Sabado";
					break;
				default:
					dia = "Valor Invalido";

				}
				System.out.println("Dia da semana: " + dia);
				break;

			case 11:
				switch (x) {
				case 5, 12, 19, 26:
					dia = "Domingo";
					break;
				case 6, 13, 20, 27:
					dia = "Segunda-feira";
					break;
				case 7, 14, 21, 28:
					dia = "Terça-feira";
					break;
				case 1, 8, 15, 22, 29:
					dia = "Quarta-feira";
					break;
				case 2, 9, 16, 23, 30:
					dia = "Quinta-feira";
					break;
				case 3, 10, 17, 24:
					dia = "Sexta-feira";
					break;
				case 4, 11, 18, 25:
					dia = "Sabado";
					break;
				default:
					dia = "Valor Invalido";

				}
				System.out.println("Dia da semana: " + dia);
				break;

			case 12:
				switch (x) {
				case 3, 10, 17, 24, 31:
					dia = "Domingo";
					break;
				case 4, 11, 18, 25:
					dia = "Segunda-feira";
					break;
				case 5, 12, 19, 26:
					dia = "Terça-feira";
					break;
				case 6, 13, 20, 27:
					dia = "Quarta-feira";
					break;
				case 7, 14, 21, 28:
					dia = "Quinta-feira";
					break;
				case 1, 8, 15, 22, 29:
					dia = "Sexta-feira";
					break;
				case 2, 9, 16, 23, 30:
					dia = "Sabado";
					break;
				default:
					dia = "Valor Invalido";

				}
				System.out.println("Dia da semana: " + dia);
				break;

			}
		}

		else {
			System.out.println("Bloqueado");
		}

		sc.close();
	}

}