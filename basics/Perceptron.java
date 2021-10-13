package basics;

import java.util.Random;

public class Perceptron {
	public static void main(String[] args) {
		double x1=1.4;
		double x2=-0.33;
		double w1=new Random().nextDouble();
		double w2=new Random().nextDouble();
		
		Neuron n=new Neuron(x1,x2,w1,w2);
		System.out.println("Input 1 (x1):"+x1);
		System.out.println("Input 2 (x2):"+x2);
		System.out.println("Output (y1):"+n.getY1());
	}
}
