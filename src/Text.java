
public class Text implements Drawable{
	private String output;
	public Text(String str){
		output=str;
	}
	public void draw(){
		System.out.println(output);
	}

}
