package primitiveDatatypes;

public class AreaAndPerimeter {
	public static void main(String[] args) {
	
		final double width = 5.5;
		final double height = 8.5; 
		
			double perimeter = 2*(height + width);
			double area = width * height; 
			
			System.out.printf("Perimeter är 2*(%.1f + %.1f)", height, width, perimeter);
			
			System.out.printf("Area är %.1f * %.1f = %.2f \n", height, width, area);
		
		
	}
}
