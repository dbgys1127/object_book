package theater;

//방문객의 소지품 관리하는 역할
public class Bag {
    private Ticket ticket;
    private Invitation invitation;
    private Long amount;

    //방문객이 극장에 왔을때, 소지품은 초대장이 있거나, 초대장이 없거나 이다.
    //또한, 현금은 언제나 들고 있고, 티켓은 방문 후에 구매할지 결정한다.
    //따라서, 생성시 초대장 소지여부와 현금을 강제한다.
    public Bag(Invitation invitation, Long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public Bag(Long amount) {
        this(null, amount);
    }


    // 가방의 속성을 가방만 접근하게 할 수 있는 메서드
    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    //초대장소지여부
    private boolean hasInvitation() {
        return invitation != null;
    }

    //티켓소비여부
    private boolean hasTicket() {
        return ticket != null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    //현금증가
    private void plusAmount(Long amount) {
        this.amount += amount;
    }

    //현금감소
    private void minusAmount(Long amount) {
        this.amount -= amount;
    }
}
