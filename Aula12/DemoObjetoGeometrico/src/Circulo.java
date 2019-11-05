import java.lang.Math;

public class Circulo implements ObjetoGeometrico {
	private Ponto2D centro;
	private double raio;
	
	Circulo(Ponto2D centro, double raio) {
		this.centro = centro;
		this.raio = raio;
	}
	
	@Override
	public Ponto2D centro() {
		// TODO Auto-generated method stub
		return centro;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return Math.PI*raio*raio;
	}

	@Override
	public double calculaPerimetro() {
		// TODO Auto-generated method stub
		return 2.0*Math.PI*raio;
	}
	
	public String toString() {
		return "Circulo com centro em " + centro + " e raio: " + raio;
	}

}
