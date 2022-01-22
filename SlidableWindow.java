public class SlidableWindow implements Window {
 
	
private static SlidableWindow window;
    
    private SlidableWindow() {}
 
    public static synchronized SlidableWindow getInstance()
    {
        if (window==null)
            window = new SlidableWindow();
        return window;
    }
    @Override
    public void installWindow()
    {
        System.out.println("Installing a slidable window");
    }
    
    
}