public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction(int a,int b){
		setNumeratorAndDenominator(a,b);
	}
	public void setNumeratorAndDenominator(int a, int b){  // 设置分子和分母
		int c = largestCommonDivisor(a, b);         // 计算最大公约数
		numerator = a / c;
		denominator = b / c;
	}
	public int largestCommonDivisor(int a,int b){  // 求a和b的最大公约数
		if(a < b){
			int c = a;
			a = b;
			b = c;
		}
		int r = a % b;
		while(r != 0){
			a = b;
			b = r;
			r = a % b;
		}
		return b;
	}
	public int getNumerator(){
		return numerator;
	}
	public int getDenominator(){
		return denominator;
	}
	public String getFraction(){  //获得分数的表达，根据分子分母的大小关系是否化为带分数
		String str;
		if(denominator == 1) {  //分母为1，只看分子的大小
			str = String.valueOf(this.numerator);
		}else if(numerator == denominator){  //分子分母相等，输出1
			str = "1";
		}else if(numerator > denominator){  //分子大于分母，转化为带分数
			int roundNumber = numerator / denominator;
			int newNumerator = numerator - denominator * roundNumber;
			str = roundNumber + "'" + newNumerator + "/" + this.denominator;
		}else{  //否则按正常的分数输出
			str = this.numerator + "/" + this.denominator;
		}
		return str;
	}

	public Fraction add(Fraction r){  // 加法运算，通分后再运算
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = this.numerator * b + this.denominator * a;
		int newDenominator = this.denominator * b;
		Fraction result = new Fraction(newNumerator,newDenominator);
		return result;
	}

	public Fraction sub(Fraction r){  // 减法运算
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator * b - denominator * a;
		int newDenominator = denominator * b;
		Fraction result = new Fraction(newNumerator,newDenominator);
		return result;
	}

	public Fraction mul(Fraction r){ // 乘法运算
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = this.numerator * a;
		int newDenominator = this.denominator * b;
		Fraction result = new Fraction(newNumerator,newDenominator);
		return result;
	}

	public Fraction div(Fraction r){  // 除法运算
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator * b;
		int newDenominator = denominator * a;
		Fraction result = new Fraction(newNumerator,newDenominator);
		return result;
	}

}
