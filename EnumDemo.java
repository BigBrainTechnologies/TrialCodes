package basicPrograms;

public class EnumDemo {
	public static void main(String[] args) {
		TrafficSignalColor color = TrafficSignalColor.RED;

		System.out.println(color.getAction()); // Outputs "stop"
		
		TrafficSignalColor gcolor = TrafficSignalColor.GREEN;

		System.out.println(gcolor.getAction());
	}
	
}
