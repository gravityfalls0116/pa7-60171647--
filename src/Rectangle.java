
public class Rectangle extends Shape{
	int[] line1;
	int[] line2;
	public Rectangle(int x, int y, int z, int p){
		int[] userline1={x,y};
		int[] userline2={x+z,y+p};
		line1=userline1;
		line2=userline2;
	}
	public double getArea(){
		double result=1;
		for(int i=0; i<line1.length; i++){
			double line=line2[i]-line1[i];
			result=result*line;
		}
		return result;
	}

	public double getLength() {
		double result=0;
		for(int i=0; i<line1.length; i++){
			double line=(line2[i]-line1[i])*2;
			result+=line;
		}
		return result;
	}
	
	public void draw(){
		System.out.println(this.getClass()+" "+"("+line1[0]+", "+line1[1]+")"+"-("+line2[0]+", "+line2[1]+")");
	}

}
