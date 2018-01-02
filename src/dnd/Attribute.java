package dnd;

public class Attribute {
	
	private int wert;
	
	public Attribute(int wert) {
		this.wert = wert;
	}
	
	public int getModifier(int level) {
		int attributeModifier = -5 + (int)Math.floor(this.wert/2);
		
		return attributeModifier + (int)Math.floor(level/2);
	}
	
}
