public class Circle {
	private double radius;
	
	Circle(){
		radius = 1;
	}
	
	Circle(double radius){
		this.radius = radius;
	}
	
	double getArea(){
		return (int)((radius * radius * Math.PI)*1000)/1000.0;
	}
	
	double getPerimeter(){
		return (int)((2 * radius * Math.PI)*1000)/1000.0;
	}
	
	void setRadius(double radius){
		this.radius = radius;
	}
}
