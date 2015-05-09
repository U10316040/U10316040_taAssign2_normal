public class Rectangle {
	private double length,width;
	
	Rectangle(){
		length = 1;
		width = 1;
	}
	
	Rectangle(double length,double width){
		this.length = length;
		this.width = width;
	}
	
	double getArea(){
		return (int)((length * width *1000)/(1000.0));
	}
	
	double getPerimeter(){
		return (int)((2 * (length + width) * 1000)/(1000.0));
	}

	void setSide(double length,double width){
		this.length = length;
		this.width = width;
	}
}
