package matriculas;

public class CalculoMestrado implements CalculoSituacaoFinal {

	@Override
	public void calcular(Matricula matricula) {

		if (matricula.getMediaFinal() >= 8) {
			matricula.setAprovado(true);
		} else {
			matricula.setAprovado(false);
		}
		
	}

}
