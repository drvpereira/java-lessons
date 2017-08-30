package matriculas;

public class CalculoGraduacao implements CalculoSituacaoFinal {

	@Override
	public void calcular(Matricula matricula) {
		int somaPesos = 0;
		double somaNotas = 0.0;
		
		for (Avaliacao av : matricula.getAvaliacao()) {
			somaPesos += av.getPeso();
			somaNotas += av.getPeso() * av.getNota();
		}
		
		matricula.setMediaFinal(somaNotas / somaPesos);
		if (matricula.getMediaFinal() >= 7) {
			matricula.setAprovado(true);
		} else {
			matricula.setAprovado(false);
		}		
	}

}
