package br.farn.web3.isp;

import java.awt.Point;

public interface Gps {

	Point pegarLocalizacaoAtual();
	
	void tracarRota(Point destino);
	
	double calcularDistancia(Point origem, Point destino);

}
