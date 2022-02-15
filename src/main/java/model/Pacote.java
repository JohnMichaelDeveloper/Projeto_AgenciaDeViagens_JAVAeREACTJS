package model;

public class Pacote {
	
	private int idPacotes;
	private String nome;
	private String origem;
	private String destino;
	private String saida;
	private String retorno;
	private String preco_Unt;
	private String inform_add;
	
	
	public int getIdPacotes() {
		return idPacotes;
	}
	public void setIdPacotes(int idPacotes) {
		this.idPacotes = idPacotes;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public String getSaida() {
		return saida;
	}
	public void setSaida(String saida) {
		this.saida = saida;
	}
	public String getRetorno() {
		return retorno;
	}
	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}
	public String getPreco_Unt() {
		return preco_Unt;
	}
	public void setPreco_Unt(String preco_Unt) {
		this.preco_Unt = preco_Unt;
	}
	public String getInform_add() {
		return inform_add;
	}
	public void setInform_add(String inform_add) {
		this.inform_add = inform_add;
	}
	@Override
	public String toString() {
		return "Pacote [idPacotes=" + idPacotes + ", nome=" + nome + ", origem=" + origem + ", destino=" + destino
				+ ", saida=" + saida + ", retorno=" + retorno + ", preco_Unt=" + preco_Unt + ", inform_add="
				+ inform_add + "]";
	}
	
	
	
	
}
