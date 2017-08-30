package matriculas;

import org.springframework.beans.factory.BeanCreationException;

public class TipoAluno {

	private int id;
	
	private String nome;
	
	private String classeCalculo;

	public CalculoSituacaoFinal getCalculo() {
		try {
			Class<?> classe = Class.forName(classeCalculo);
			return (CalculoSituacaoFinal) classe.newInstance();
		} catch (Exception e) {
			throw new BeanCreationException(
					"N‹o foi poss’vel instanciar a classe '" +
					classeCalculo + "'");
		}
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasseCalculo() {
		return classeCalculo;
	}

	public void setClasseCalculo(String classeCalculo) {
		this.classeCalculo = classeCalculo;
	}
	
}
