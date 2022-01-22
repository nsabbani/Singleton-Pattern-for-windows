public class DoorBasedWindow implements Window {
 
private static DoorBasedWindow doorBasedWindow;
    
    private DoorBasedWindow() {}
 
    public static synchronized DoorBasedWindow getInstance()
    {
        if (doorBasedWindow==null)
            doorBasedWindow = new DoorBasedWindow();
        return doorBasedWindow;
    }
    @Override
    public void installWindow()
    {
        System.out.println("Installing a door based window.");
    }
    

}