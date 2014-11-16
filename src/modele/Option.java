package modele;

public class Option {
	public static int maxX;
	public static int maxY;

	public Option() {
		this.maxX = 10;
		this.maxY = 10;
	}

	public static int getMaxX() {
		return maxX;
	}

	public void setMaxX(int maxX) {
		Option.maxX = maxX;
	}

	public static int getMaxY() {
		return maxY;
	}

	public void setMaxY(int maxY) {
		Option.maxY = maxY;
	}

}
