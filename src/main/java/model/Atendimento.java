package model;

public class Atendimento {

	
	private int idAtend;
	private String nome;
	private String email;
	private String data_do_atend;
	private String duvida;
	private String satisfacao;
	
	
	
	public int getIdAtend() {
		return idAtend;
	}
	public void setIdAtend(int idAtend) {
		this.idAtend = idAtend;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getData_do_atend() {
		return data_do_atend;
	}
	public void setData_do_atend(String data_do_atend) {
		this.data_do_atend = data_do_atend;
	}
	public String getDuvida() {
		return duvida;
	}
	public void setDuvida(String duvida) {
		this.duvida = duvida;
	}
	public String getSatisfacao() {
		return satisfacao;
	}
	public void setSatisfacao(String satisfacao) {
		this.satisfacao = satisfacao;
	}
	
	@Override
	public String toString() {
		return "Atendimento [idAtend=" + idAtend + ", nome=" + nome + ", email=" + email + ", data_do_atend="
				+ data_do_atend + ", duvida=" + duvida + ", satisfacao=" + satisfacao + "]";
	}
	
	
}
