package theater;

// 관람객
public class Audience {
    private Bag bag;

    //관람객은 가방을 항상 소유한다.
    public Audience(Bag bag) {
        this.bag = bag;
    }

    //외부에서 가방에 접근하지 못하게 한다.
//    public Bag getBag() {
//        return bag;
//    }

    // 돈을 지불하고 티켓을 챙기는 것은 청중 스스로 한다.
    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
