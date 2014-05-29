package products;


public class Vector {
	private double x,y,z;
		
		
	Vector(double a, double b, double c){
		x=a; y=b; z=c;
	}
	
	Vector(){
		this(0,0,0);
	}
	
	public void setX(double x){
		this.x=x;
	}
	
	public void setY(double y){
		this.y=y;
	}
	
	public void setZ(double z){
		this.z=z;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public double getZ(){
		return z;
	}
	
	public void displayVector(){
		System.out.println("["+x+","+y+","+z+"]");
	}
}

