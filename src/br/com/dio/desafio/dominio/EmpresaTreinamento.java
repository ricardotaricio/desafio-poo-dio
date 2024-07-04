package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmpresaTreinamento {
	private String nome;
	private List<Bootcamp> bootcamps = new ArrayList<Bootcamp>();
	private Set<Certificado> certificadosEmitidos = new HashSet<Certificado>();

	public void emitirCertificados() {
		bootcamps.forEach(bootcamp -> bootcamp.getDevsInscritos().forEach(dev -> {
					dev.getConteudosConcluidos().forEach(conteudo -> 
						certificadosEmitidos.add(new Certificado(this, dev, conteudo)));
				}));
	}
	
	public EmpresaTreinamento(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Bootcamp> getBootcamps() {
		return bootcamps;
	}
	public void setBootcamps(List<Bootcamp> bootcamps) {
		this.bootcamps = bootcamps;
	}
	public Set<Certificado> getCertificadosEmitidos() {
		return this.certificadosEmitidos;
	}

	@Override
	public String toString() {
		return "EmpresaTreinamento [nome=" + nome + "]";
	}
}
