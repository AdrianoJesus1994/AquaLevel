package br.com.ntank.controller;

import org.springframework.stereotype.Controller;

@Controller
public class AplicationUtil {
	
	private static AplicationUtil instancia;
	
	private boolean logado;
	
	private String idUsuário;
	

	public static AplicationUtil getInstancia() {
		if(instancia == null) {
			instancia = new AplicationUtil();
		}
		return instancia;
	}

	public boolean isLogado() {
		return logado;
	}

	public void setLogado(boolean logado) {
		this.logado = logado;
	}

	public String getIdUsuário() {
		return idUsuário;
	}

	public void setIdUsuário(String idUsuário) {
		this.idUsuário = idUsuário;
	}
	
	
	
	

}


