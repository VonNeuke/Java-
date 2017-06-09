package p3;
//MyCuboid.java
public class MyCuboid extends MyRectangle {
	private double hei;
	MyCuboid(){}
	MyCuboid(double len,double wid,double hei){
		super(len,wid);
		this.hei = hei;
	}
	public void setHeight(double hei){
		this.hei = hei;
	}
	public double getHeight(){
		return hei;
	}
	public double getVolumn(){
		return getLength()*getWidth()*hei;
	}
	public double getArea(){
		return (getLength()*getWidth()+getLength()*hei+hei*getWidth())*2;
	}
	public String toString(){
		return "Length:"+getLength()+" Width:"+getWidth()+" Height:"+hei+" Area:"+getArea()+" Volumn:"+getVolumn();
	}
}
