package br.com.alura.dto;

import java.util.Date;
import java.util.List;

public class MensagemErroDto {

	private List<String> mensagem;

	private Date dataErro;

	public List<String> getMensagem() {
		return mensagem;
	}

	public void setMensagem(List<String> mensagem) {
		this.mensagem = mensagem;
	}

	public Date getDataErro() {
		return dataErro;
	}

	public void setDataErro(Date dataErro) {
		this.dataErro = dataErro;
	}

	public static MensagemErroDto build(List<String> mensagem) {

		MensagemErroDto mensagemErroDto = new MensagemErroDto();
		mensagemErroDto.setMensagem(mensagem);
		mensagemErroDto.setDataErro(new Date());
		return mensagemErroDto;
	}

}
