package products;
import java.util.Scanner;
public class Calculator {


	public static double calculateDotProduct(Vector a, Vector b){
		return (a.getX()*b.getX()+a.getY()*b.getY()+a.getZ()*b.getZ());
	}

	public static String calculateCrossProduct(Vector v1,Vector v2){

		String iCom=String.format("%f", (v1.getY()*v2.getZ()-v2.getY()*v1.getZ()));
		String jCom=String.format("%f", (v1.getZ()*v2.getX()-v1.getX()*v2.getZ()));
		String kCom=String.format("%f",(v1.getX()*v2.getY()-v1.getY()*v2.getX()));

		if(Double.parseDouble(iCom)>=0)
			iCom="+"+iCom;

		if(Double.parseDouble(jCom)>=0)
			jCom="+"+jCom;

		if(Double.parseDouble(kCom)>=0)
			kCom="+"+kCom;

		iCom+="i";
		jCom+="j";
		kCom+="k";
		return String.format("%s %s %s", iCom,jCom,kCom);
	}

	public static void calculateVector(Point a, Point b, Vector vector){
		vector.setX(b.getX()-a.getX());
		vector.setY(b.getY()-a.getY());
		vector.setZ(b.getZ()-a.getZ());
	}

	public static void main(String [] args){

		Scanner in=new Scanner(System.in);
		System.out.println("1. Calculate the dot product"+"\n"+"2. Calculate the cross product"+"\n"+
				"Choose an option");
		int choice=in.nextInt();

		Vector v1=new Vector();
		Vector v2=new Vector();

		switch(choice){

		case 1: System.out.println("1. Use coordinates of the 2 vectors to find the dot product"+"\n"+
				"2. Use the initial and terminal points to find each of the 2 vectors and then calcuate the dot"
				+ " product of the 2 vectors\n"+"Choose an option");

		int dotChoice=in.nextInt();
		switch(dotChoice){

		case 1: System.out.println("enter the x, y, z coordinates respectively for the 1st vector");
		v1=new Vector(in.nextDouble(), in.nextDouble(), in.nextDouble());
		System.out.println("enter the x, y, z coordinates respectively for the 2nt vector");
		v2=new Vector(in.nextDouble(), in.nextDouble(), in.nextDouble());
		System.out.println("The dot product of the 2 vectors is= "+calculateDotProduct(v1,v2));
		break;

		case 2: System.out.println("Enter the start and end point of the 1st vector");
		Point p1=new Point();
		Point p2=new Point();

		calculateVector(p1,p2, v1);

		System.out.println();

		System.out.println("Enter the start and end point of the 2nd vector");
		Point p3=new Point();
		Point p4=new Point();

		calculateVector(p3,p4,v2);

		System.out.println("The dot product of the 2 vectors is= "+calculateDotProduct(v1,v2));
		break;
		
		default: System.out.println("Invalid Input");

		}
		
		case 2: System.out.println("Enter the i, j, k components respectively of the 1st vector");
		v1=new Vector(in.nextDouble(), in.nextDouble(), in.nextDouble());
		System.out.println("Enter the i, j, k components respectively of the 2nd vector");
		v2=new Vector(in.nextDouble(), in.nextDouble(), in.nextDouble());
		System.out.println("The cross product of the 2 vectors is= "+calculateCrossProduct(v1,v2));
		break;
		
		default: System.out.println("invalid input");

		}
		in.close();
	}
}
