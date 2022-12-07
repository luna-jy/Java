package label;

public class Label implements Resizable, Colorable{
	int width, height;
	String background, foreground, text;
	Label(String background, int height, int width, String foreground, String text){
		this.width  = width;
		this.height = height;
		this.background = background;
		this.foreground = foreground;
		this.text = text;
	}
	
	@Override
	public void setBackground(String color) {
		background = color;
	}

	@Override
	public void setForeground(String color) {
		foreground = color;
	}

	@Override
	public void resize(int width, int height) {
		this.width = width;
		this.height = height; 
	}

}
