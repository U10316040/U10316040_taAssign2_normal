public class RegularTriangle {
	private double side;
	
	RegularTriangle(){
		side = 1;
	}
	
	RegularTriangle(double side){
		this.side = side;
	}
	
	double getArea(){
		return (int)((Math.sqrt(3) * side * side)*1000)/(4.0 * 1000) ;
	}
	
	double getPerimeter(){
		return (int)(3 * side* 1000)/1000.0 ;
	}
	
	void setSide(double side){
		this.side = side;
	}
	
}
