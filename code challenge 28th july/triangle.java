package basic;
import java.lang.Math;
public class triangle {
	static double hypo (double a,double b) {
		double c=(float)Math.pow((a*a+b*b),0.5);
		return c;
	}
	public static void main(String[] args) {
		System.out.println((int)hypo(3, 4));
	}

}
