package theater;

// 관람객
public class Audience {
    private Bag bag;

    //관람객은 가방을 항상 소유한다.
    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }
}
