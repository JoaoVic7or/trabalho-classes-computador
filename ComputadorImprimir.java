import java.util.Scanner;

public class ComputadorImprimir {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		//criando computador 1
		Computador pc1 = new Computador();
		//criando computador 2
		Computador pc2 = new Computador();
		//criando computador 3
		Computador pc3 = new Computador();
		pc3.setMemoriaRam(16);
		pc3.setPlacaMae("Gigabyte B450M");
		pc3.setPlacaDeVideo(true);
		pc3.setProcessador("Ryzen 5 2600");
		pc3.setArmazenamento(1000);
		//criando computador 4
		Computador pc4 = new Computador();
		pc4.setMemoriaRam(32);
		pc4.setPlacaMae("Gigabyte 550M");
		pc4.setPlacaDeVideo(true);
		pc4.setProcessador("Ryzen 7 5800X");
		pc4.setArmazenamento(2000);
		
		//coletando informações do primeiro computador
		System.out.println("Digite as informações do primeiro computador: ");
		System.out.print("Memória Ram: ");
		pc1.setMemoriaRam(scanner.nextInt());
		scanner.nextLine();
		System.out.print("Placa mãe: ");
		pc1.setPlacaMae(scanner.nextLine());
		System.out.print("Possui placa de vídeo? (true/false): ");
		pc1.setPlacaDeVideo(scanner.nextBoolean());
		scanner.nextLine();
		System.out.print("Processador: ");
		pc1.setProcessador(scanner.nextLine());
		System.out.print("Armazenamento: ");
		pc1.setArmazenamento(scanner.nextInt());
		scanner.nextLine();
		
		//coletando informações do segundo computador
		System.out.println("Agora digite as informções do segundo computador: ");
		System.out.print("Memória Ram: ");
		pc2.setMemoriaRam(scanner.nextInt());
		scanner.nextLine();
		System.out.print("Placa mãe: ");
		pc2.setPlacaMae(scanner.nextLine());
		System.out.print("Possui placa de vídeo? (true/false): ");
		pc2.setPlacaDeVideo(scanner.nextBoolean());
		scanner.nextLine();
		System.out.print("Processador: ");
		pc2.setProcessador(scanner.nextLine());
		System.out.print("Armazenamento: ");
		pc2.setArmazenamento(scanner.nextInt());
		
		//imprimindo todas as informações dos quatro computadores
		System.out.println("Informações sobre os quatro computadores: ");
		pc1.imprimir();
		pc2.imprimir();
		pc3.imprimir();
		pc4.imprimir();
		
		scanner.close();
	}
}
