import java.io.ObjectInputStream.GetField;

public class Main {
	
	public static void main (String []args)
	{
		WindowsFactory obj = WindowsFactory.getInstance();
		Window window = obj.selectWindow("Slideable");
		window.installWindow();
		window = obj.selectWindow("Door Based");
		window.installWindow();
		window = obj.selectWindow("Closed");
		window.installWindow();
		
	}

}
