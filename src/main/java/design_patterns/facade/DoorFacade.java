package design_patterns.facade;

public class DoorFacade {
    private DoorOpen doorOpen;
    private DoorClose doorClose;
    private DoorLock doorLock;

    public DoorFacade(DoorOpen doorOpen, DoorClose doorClose, DoorLock doorLock) {
        this.doorOpen = doorOpen;
        this.doorClose = doorClose;
        this.doorLock = doorLock;
    }

    public void manageDoor() {
        doorOpen.open();
        doorClose.close();
        doorLock.lock();
    }
}
