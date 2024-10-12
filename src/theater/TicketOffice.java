package theater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//티켓 판매처
public class TicketOffice {
    //돈
    private Long amount;

    //티켓 보유
    private List<Ticket> tickets = new ArrayList<>();

    //티켓 판매처는 오픈할때 항상 돈과 티켓들을 갖고 있어야한다.
    public TicketOffice(Long amount, Ticket ... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    //티켓 판매처는 티켓을 방문객에게 준다. 이는 곳 티켓 한장이 티켓판매소에서 사라지는 것을 의미한다.
    private Ticket getTicket() {
        return tickets.remove(0);
    }

    //티켓을 판매하면 보유 금액이 증가한다.
    private void plusAmount(Long amount) {
        this.amount += amount;
    }

    //금액이 차감될 수 있다.
    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }
}
