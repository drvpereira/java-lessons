package matriculas;

public class CalculoEspecializacao implements CalculoSituacaoFinal {

	@Override
	public void calcular(Matricula matricula) {
		double somaNotas = 0.0;
		
		for (Avaliacao av : matricula.getAvaliacao()) {
			somaNotas += av.getNota();
		}
		
		matricula.setMediaFinal(somaNotas / matricula.getAvaliacao().size());
		
		if (matricula.getMediaFinal() >= 6) {
			matricula.setAprovado(true);
		} else {
			matricula.setAprovado(false);
		}		
	}

}
