public class GameController {
 private boolean [] buttons = new boolean[4];
    

    public GameController() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = false; 
        }
    }

    public  boolean isPressed(int button) {
        if (button >= 0 && button < buttons.length) {
            return buttons[button];
        }
        return false;
    }
    
    public void setButton(int button, boolean pressed) {
        this.buttons[button] = pressed;

        }
    }
    

