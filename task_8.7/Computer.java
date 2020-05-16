public class Computer {
    private Keybord keybord;
    private  Mouse mouse;
    private  Monitor monitor;

    public Computer(Keybord keybord, Mouse mouse, Monitor monitor) {
        this.keybord = keybord;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public Keybord getKeybord() {
        return keybord;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
