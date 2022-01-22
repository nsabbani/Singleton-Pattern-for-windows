
public class WindowsFactory {
    private static WindowsFactory singeltonObject;
    
    private WindowsFactory() {}
 
    public static synchronized WindowsFactory getInstance()
    {
        if (singeltonObject==null)
            singeltonObject = new WindowsFactory();
        return singeltonObject;
    }
    
    
    public Window selectWindow(String window)
    {
        if (window == null || window.isEmpty())
            return null;
        if ("Slideable".equals(window)) {
            return SlidableWindow.getInstance();
        }
        else if ("Door Based".equals(window)) {
            return DoorBasedWindow.getInstance();
        }
        else if ("Closed".equals(window)) {
            return ClosedWindow.getInstance();
        }
        return null;
    }
    
}