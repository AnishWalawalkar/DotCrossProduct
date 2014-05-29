package products;
import java.util.*;

public class Point {
	
	private double x,y,z;
	
	Point(){
		Scanner in=new Scanner(System.in);
		System.out.println("enter the the x, y, z coordinates of the point");
		x=in.nextDouble();
		y=in.nextDouble();
		z=in.nextDouble();
		in.close();
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
}


