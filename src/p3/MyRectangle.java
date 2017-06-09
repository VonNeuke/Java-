package p3;
//MyRectangle.java
public class MyRectangle {
	private double len;
	private double wid;
	MyRectangle(){}
	MyRectangle(double len,double wid){
		this.len = len;
		this.wid = wid;
	}
	public double getLength(){
		return len;
	}
	public double getWidth(){
		return wid;
	}
	public void setLength(double len){
		this.len = len;
	}
	public void setWidth(double wid){
		this.wid = wid;
	}
	public double getArea(){
		return len*wid;
	}
	public String toString(){
		return "Length:"+len+" Width:"+wid+" Area:"+getArea();
	}
}
