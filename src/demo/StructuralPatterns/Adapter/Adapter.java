package demo.StructuralPatterns.Adapter;

public class Adapter {
}

class YoungHuman{
    void mode2Foot(){
        System.out.println("move by 2 foot");
    }
}

interface OldHuman{
    void mode3Foot();

}

class HumanAdapter implements OldHuman{
    private YoungHuman old;

    public HumanAdapter(YoungHuman old) {
        this.old = old;
    }

    @Override
    public void mode3Foot() {
        old.mode2Foot();
        System.out.println("Chuyển sang đi bằng gậy");
    }
}
