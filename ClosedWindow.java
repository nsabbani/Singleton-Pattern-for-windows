public class ClosedWindow implements Window {
 
private static ClosedWindow closedWindow;
    
    private ClosedWindow() {}
 
    public static synchronized ClosedWindow getInstance()
    {
        if (closedWindow==null)
            closedWindow = new ClosedWindow();
        return closedWindow;
    }
    @Override
    public void installWindow()
    {
        System.out.println("Installing a closed window. ");
    }

}