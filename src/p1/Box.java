package p1;
//Box.java
public class Box {
	private double len;
	private double wid;
	private double hei;
	Box(){}
	Box(double len,double wid,double hei){
		this.len = len;
		this.wid = wid;
		this.hei = hei;	
	}
	public double getVolume(){
		return len*wid*hei;
	}
}