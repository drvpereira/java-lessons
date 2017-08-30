package calculadora;

public class CalculadoraServiceImpl implements CalculadoraService {

	@Override
	public int dividir(int a, int b) {
		return a / b;
	}

	@Override
	public int multiplicar(int a, int b) {
		return a * b;
	}

	@Override
	public int somar(int a, int b) {
		return a + b;
	}

	@Override
	public int subtrair(int a, int b) {
		return a - b;
	}

}
