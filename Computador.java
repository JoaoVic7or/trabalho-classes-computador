
public class Computador {
	
	//Atributos
	private int memoriaRam;
	private String placaMae;
	private Boolean placaDeVideo;
	private String processador;
	private int armazenamento;

	
	//Construtores
	public Computador() {

	}
	
	public Computador(int memoriaRam, String placaMae, Boolean placaDeVideo, String processador, int armazenamento) {
		this.memoriaRam = memoriaRam;
		this.placaMae = placaMae;
		this.placaDeVideo = placaDeVideo;
		this.processador = processador;
		this.armazenamento = armazenamento;
	}
	
	//setters e getters
	public int getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public String getPlacaMae() {
		return placaMae;
	}

	public void setPlacaMae(String placaMae) {
		this.placaMae = placaMae;
	}

	public Boolean getPlacaDeVideo() {
		return placaDeVideo;
	}

	public void setPlacaDeVideo(Boolean placaDeVideo) {
		this.placaDeVideo = placaDeVideo;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public int getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}

	//metodo de exibição
	public void imprimir() {
		System.out.println("Memoria Ram: " + memoriaRam + "GB");
		System.out.println("Placa mae: " + placaMae);
		System.out.println("Placa de video: " + placaDeVideo);
		System.out.println("Processador: " + processador);
		System.out.println("Armazenamento: " + armazenamento + "GB");
	}
	
}
