import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class CalculateFrame {
	private JFrame frame;
	private JTextField InputR,areaAns,perAns;
	private JTextField InputS,areaAns2,perAns2;
	private JTextField InputL,InputW,areaAns3,perAns3;
	private JLabel Circle,radius,area,perimeter;
	private JLabel RegularTriangle,Side,area2,perimeter2;
	private JLabel Rectangle,length,width,area3,perimeter3;
	private Circle a = new Circle();
	private RegularTriangle b = new RegularTriangle();
	private Rectangle c = new Rectangle();
	
	public static void main(String[] args) {
		
		CalculateFrame window = new CalculateFrame();
		window.frame.setVisible(true);
	}
	
	public CalculateFrame() {
		initialize();
	}
	
	// Initialize the objects of the frame
	private void initialize() {
		//set frame
		frame = new JFrame("U10316040_GeoCalculate");
		frame.setBounds(100, 100, 688, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);//none layout
		
		//Circle
		Circle = new JLabel("Circle:");
		Circle.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13)); //set font
		Circle.setBounds(38, 29, 46, 15);
		frame.getContentPane().add(Circle);
		
		radius = new JLabel("Radius:");
		radius.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		radius.setBounds(54, 64, 46, 15);
		frame.getContentPane().add(radius);
		
		InputR = new JTextField();
		InputR.setBounds(109, 62, 96, 21);
		frame.getContentPane().add(InputR);
		InputR.setColumns(10);
		
		area = new JLabel("The area is:");
		area.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		area.setBounds(54, 106, 81, 15);
		frame.getContentPane().add(area);
		
		perimeter = new JLabel("The perimeter is:");
		perimeter.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		perimeter.setBounds(54, 147, 107, 15);
		frame.getContentPane().add(perimeter);
		
		areaAns = new JTextField();
		areaAns.setBounds(129, 104, 96, 21);
		frame.getContentPane().add(areaAns);
		areaAns.setColumns(10);
		
		perAns = new JTextField();
		perAns.setBounds(160, 145, 96, 21);
		frame.getContentPane().add(perAns);
		perAns.setColumns(10);
		
		JButton calculate = new JButton("calculate");
		//Button action
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double radius;
				try{
					radius = Double.parseDouble(InputR.getText());
					if(radius > 0){   
						a.setRadius(radius);
						perAns.setText(Double.toString(a.getPerimeter()));
						areaAns.setText(Double.toString(a.getArea()));
					}
					else //invalid radius
						JOptionPane.showMessageDialog(null, "Input error");
				}catch(Exception e1){     
					JOptionPane.showMessageDialog(null, "Input error");//invalid radius
				}
			}
		});
		
		calculate.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		calculate.setBounds(293, 61, 96, 23);
		frame.getContentPane().add(calculate);
		
		JButton remove = new JButton("remove");
		remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InputR.setText(null);
				perAns.setText(null);
				areaAns.setText(null);
			}
		});
		remove.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		remove.setBounds(414, 61, 87, 23);
		frame.getContentPane().add(remove);
		
		RegularTriangle = new JLabel("Regular Triangle");
		RegularTriangle.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		RegularTriangle.setBounds(38, 207, 123, 23);
		frame.getContentPane().add(RegularTriangle);
		
		Side = new JLabel("Side:");
		Side.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		Side.setBounds(54, 244, 46, 15);
		frame.getContentPane().add(Side);
		
		area2 = new JLabel("The area is:");
		area2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		area2.setBounds(54, 282, 81, 15);
		frame.getContentPane().add(area2);
		
		perimeter2 = new JLabel("The perimeter is:");
		perimeter2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		perimeter2.setBounds(54, 325, 107, 15);
		frame.getContentPane().add(perimeter2);
		
		InputS = new JTextField();
		InputS.setColumns(10);
		InputS.setBounds(106, 242, 96, 21);
		frame.getContentPane().add(InputS);
		
		areaAns2 = new JTextField();
		areaAns2.setColumns(10);
		areaAns2.setBounds(139, 282, 96, 21);
		frame.getContentPane().add(areaAns2);
		
		perAns2 = new JTextField();
		perAns2.setColumns(10);
		perAns2.setBounds(160, 322, 96, 21);
		frame.getContentPane().add(perAns2);
		
		JButton calculate2 = new JButton("calculate");
		calculate2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double side;
				try{
					side = Double.parseDouble(InputS.getText());
					if(side >= 0){
						b.setSide(side);
						perAns2.setText(Double.toString(b.getPerimeter()));
						areaAns2.setText(Double.toString(b.getArea()));
					}
					else
						JOptionPane.showMessageDialog(null, "Input error");
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Input error");
				}
			}
			
		});
		
		calculate2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		calculate2.setBounds(293, 242, 96, 23);
		frame.getContentPane().add(calculate2);
		
		JButton remove2 = new JButton("remove");
		remove2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputS.setText(null);
				perAns2.setText(null);
				areaAns2.setText(null);
			}
		});
		remove2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		remove2.setBounds(414, 242, 87, 23);
		frame.getContentPane().add(remove2);
		
		//Rectangle
		Rectangle = new JLabel("Rectangle");
		Rectangle.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		Rectangle.setBounds(38, 370, 123, 23);
		frame.getContentPane().add(Rectangle);
		
		length = new JLabel("length:");
		length.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		length.setBounds(54, 407, 46, 15);
		frame.getContentPane().add(length);
		
		width = new JLabel("width:");
		width.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		width.setBounds(210, 407, 46, 15);
		frame.getContentPane().add(width);
		
		area3 = new JLabel("The area is:");
		area3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		area3.setBounds(54, 449, 81, 15);
		frame.getContentPane().add(area3);
		
		perimeter3 = new JLabel("The perimeter is:");
		perimeter3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		perimeter3.setBounds(54, 492, 107, 15);
		frame.getContentPane().add(perimeter3);
		
		InputL = new JTextField();
		InputL.setColumns(10);
		InputL.setBounds(109, 405, 96, 21);
		frame.getContentPane().add(InputL);
		
		InputW = new JTextField();
		InputW.setColumns(10);
		InputW.setBounds(256, 405, 96, 21);
		frame.getContentPane().add(InputW);
		
		JButton calculate3 = new JButton("calculate");
		calculate3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double L, W;
				try{
					L = Double.parseDouble(InputL.getText());
					W = Double.parseDouble(InputW.getText());
					if(L > 0 && W > 0){
						c.setSide(L, W);
						perAns3.setText(Double.toString(c.getPerimeter()));
						areaAns3.setText(Double.toString(c.getArea()));
					}
					else
						JOptionPane.showMessageDialog(null, "Input error");
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Input error");
				}
			}
		});
		
		calculate3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		calculate3.setBounds(405, 407, 96, 23);
		frame.getContentPane().add(calculate3);
		
		JButton remove3 = new JButton("remove");
		remove3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputW.setText(null);
				InputL.setText(null);
				perAns3.setText(null);
				areaAns3.setText(null);
			}
		});
		
		remove3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		remove3.setBounds(528, 407, 87, 23);
		frame.getContentPane().add(remove3);
		
		areaAns3 = new JTextField();
		areaAns3.setColumns(10);
		areaAns3.setBounds(139, 449, 96, 21);
		frame.getContentPane().add(areaAns3);
		
		perAns3 = new JTextField();
		perAns3.setColumns(10);
		perAns3.setBounds(160, 486, 96, 21);
		frame.getContentPane().add(perAns3);
	}

}
