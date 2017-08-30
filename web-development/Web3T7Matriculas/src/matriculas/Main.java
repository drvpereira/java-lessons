package matriculas;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		TipoAluno t = new TipoAluno();
		t.setNome("Especialização");
		t.setClasseCalculo("matriculas.CalculoEspecializacao");
		
		Disciplina d = new Disciplina();
		d.setCargaHoraria(30);
		d.setNome("Desenvolvimento Web III");
		
		Aluno a = new Aluno();
		a.setNome("David");
		a.setTipo(t);
		
		Avaliacao av1 = new Avaliacao();
		av1.setNota(8);
		av1.setPeso(5);
		
		Avaliacao av2 = new Avaliacao();
		av2.setNota(9);
		av2.setPeso(6);
		
		Matricula m = new Matricula();
		m.setAluno(a);
		m.setDisciplina(d);
		m.setAvaliacao(new ArrayList<Avaliacao>(2));
		m.getAvaliacao().add(av1);
		m.getAvaliacao().add(av2);
		
		m.calcularSituacaoFinal();
		
		System.out.println("Média final: " + m.getMediaFinal());
		System.out.println("Aprovado? " + (m.isAprovado() ? "Sim" : "Não"));
	}
	
}
