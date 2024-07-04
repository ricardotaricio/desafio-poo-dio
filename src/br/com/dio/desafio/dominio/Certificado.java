package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Objects;

public class Certificado {
	private EmpresaTreinamento empresa;
	private Dev dev;
	private Conteudo conteudo;
	private LocalDate dataEmissao;
	
	public Certificado(EmpresaTreinamento empresa, Dev dev, Conteudo conteudo) {
		this.empresa = empresa;
		this.dev = dev;
		this.conteudo = conteudo;
		this.dataEmissao = LocalDate.now();
	}
	
	public Conteudo getConteudo() {
		return conteudo;
	}
	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
	}
	public LocalDate getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public Dev getDev() {
		return dev;
	}
	public void setDev(Dev dev) {
		this.dev = dev;
	}
	public EmpresaTreinamento getEmpresa() {
		return empresa;
	}
	public void setEmpresa(EmpresaTreinamento empresa) {
		this.empresa = empresa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudo, dev);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Certificado other = (Certificado) obj;
		return Objects.equals(conteudo, other.conteudo) && Objects.equals(dev, other.dev);
	}

	@Override
	public String toString() {
		return "\nCertificado [empresa=" + empresa + ", dev=" + dev + ", conteudo=" + conteudo + ", dataEmissao="
				+ dataEmissao + "]";
	}


}
