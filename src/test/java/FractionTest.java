public class FractionTest {

	public static void main(String[] args) {
		int a = (int)(Math.random()*10 + 1);
		int b = (int)(Math.random()*10 + 1);
		int c = (int)(Math.random()*10 + 1);
		int d = (int)(Math.random()*10 + 1);
		System.out.println("f1:numerator=" + a + ", denominator=" + b);
		System.out.println("f2:numerator=" + c + ", denominator=" + d);
		Fraction f1 = new Fraction(a, b);
		Fraction f2 = new Fraction(c, d);
		System.out.println("f1: " + f1.getFraction());
		System.out.println("f2: " + f2.getFraction());
		System.out.println("add result:" + f1.add(f2).getNumerator() + ", " + f1.add(f2).getDenominator());
		System.out.println(f1.getFraction() + " + " + f2.getFraction() + " = " + f1.add(f2).getFraction());
		String[] ops = {"+", "-", "*", "÷"};
		if(f1.sub(f2).getNumerator() < 0){
			System.out.println("sub result:" + f2.sub(f1).getNumerator() + ", " + f2.sub(f1).getDenominator());
			System.out.println(f2.getFraction() + " - " + f1.getFraction() + " = " + f2.sub(f1).getFraction());
		}else {
			System.out.println("sub result:" + f1.sub(f2).getNumerator() + ", " + f1.sub(f2).getDenominator());
			System.out.println(f1.getFraction() + " - " + f2.getFraction() + " = " + f1.sub(f2).getFraction());
		}
	}
}
