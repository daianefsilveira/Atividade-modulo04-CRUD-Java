package model;

public class Passagens {
	private int codPassagens;
	private String origem;
	private String destino;
	private String trecho;
	private String dataIda;
	private String dataVolta;
	private int qtdPassageiros;
	
	public Passagens() {
		super();
	}
	
	public Passagens(int codPassagens, String origem, String destino, String trecho, String dataIda, String dataVolta,
			int qtdPassageiros) {
		super();
		this.codPassagens = codPassagens;
		this.origem = origem;
		this.destino = destino;
		this.trecho = trecho;
		this.dataIda = dataIda;
		this.dataVolta = dataVolta;
		this.qtdPassageiros = qtdPassageiros;
	}
	
	public int getCodPassagens() {
		return codPassagens;
	}
	
	public void setCodPassagens(int codPassagens) {
		this.codPassagens = codPassagens;
	}
	
	public String getOrigem() {
		return origem;
	}
	
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public String getTrecho() {
		return trecho;
	}
	
	public void setTrecho(String trecho) {
		this.trecho = trecho;
	}
	
	public String getDataIda() {
		return dataIda;
	}
	
	public void setDataIda(String dataIda) {
		this.dataIda = dataIda;
	}
	
	public String getDataVolta() {
		return dataVolta;
	}
	
	public void setDataVolta(String dataVolta) {
		this.dataVolta = dataVolta;
	}
	
	public int getQtdPassageiros() {
		return qtdPassageiros;
	}
	
	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}
}
	
	
	
	
	