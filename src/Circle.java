
public class Circle extends Shape{
	private int[] centerPoint;
	private int radius;
	public Circle(int xpoint, int ypoint, int UserRadius){
		int[] userPoint={xpoint,ypoint};
		centerPoint=userPoint;
		radius=UserRadius;
	}
	public double getArea(){
		double result=(Math.pow(radius,2)*3.14);
		return result;
	}
	public double getLength(){
		double result=((radius*2)*3.14);
		return result;
	}
	public void draw(){
		System.out.println(this.getClass()+"Center ("+centerPoint[0]+", "+centerPoint[1]+")"+"-radius ("+radius+")");
	}

}
