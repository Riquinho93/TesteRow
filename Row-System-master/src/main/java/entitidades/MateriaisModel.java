package entitidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.mail.imap.protocol.UID;

@Entity
@Table(name = "tbMateriais")
public class MateriaisModel {
	private Long materiaisId;
	private UID iddMateriais;
	private String nome;
	private String qtd;
	private String medida;
	private boolean answer;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getMateriaisId() {
		return materiaisId;
	}

	public void setMateriaisId(Long materiaisId) {
		this.materiaisId = materiaisId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getQtd() {
		return qtd;
	}

	public void setQtd(String qtd) {
		this.qtd = qtd;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public UID getIddMateriais() {
		return iddMateriais;
	}

	public void setIddMateriais(UID iddMateriais) {
		this.iddMateriais = iddMateriais;
	}

	public boolean isAnswer() {
		return answer;
	}

	public void setAnswer(boolean answer) {
		this.answer = answer;
	}
	
}
