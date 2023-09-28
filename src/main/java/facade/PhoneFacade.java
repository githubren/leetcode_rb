package facade;

public class PhoneFacade {

    private final WindowManager mWindowManager;
    private final Canvas mCanvas;
    private final EventManager mEventManager;

    public PhoneFacade(WindowManager windowManager, Canvas canvas, EventManager eventManager) {
        this.mWindowManager = windowManager;
        this.mCanvas = canvas;
        this.mEventManager = eventManager;
    }


    public void init(){
        mWindowManager.createWindow();
        mCanvas.draw();
        mEventManager.event();
    }

    public void clear(){
        mEventManager.remove();
        mCanvas.clear();
        mWindowManager.destroyWindow();
    }

}
