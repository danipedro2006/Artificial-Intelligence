package basics;

public class Neuron {
	 double x1, x2, w1, w2;

	public Neuron(double x1, double x2, double w1, double w2) {
		this.x1 = x1;
		this.x2 = x2;
		this.w1 = w1;
		this.w2 = w2;
	}
	
	public double getY1() {
		double wx, y1;
		wx=(x1*w1)+(x2*w2);//propagation function
		y1=Math.tanh(wx);
		return y1;
	}
}
