
public class mainClass {
	public static void main(String[] args) {
		System.out.println(max4(440, 80, 90, 150));
		System.out.println(min3(440, 80, 90));
		System.out.println(min4(440, 80, 90, 150));	
	}
	public static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max) {
			max = b;
		} else if ( c > max) {
			max = c;
		} else if ( d > max) {
			max = d;
		}
		
		return max;
	}
	
	public static int min3(int a, int b, int c) {
		int min = a;
		if (b < min) {
			min = b;
		} else if ( c < min) {
			min = c;
		} 
		
		return min;
	}
	
	public static int min4(int a, int b, int c, int d) {
		int min = a;
		if (b < min) {
			min = b;
		} else if ( c < min) {
			min = c;
		} else if ( d < min) {
			min = d;
		}
		
		return min;
	}
	
	
}
