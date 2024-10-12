package theater;

//티켓 판매원
public class TicketSeller {
    //판매원은 자신이 일할 티켓판매소를 알고 있으면 된다.
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
    }
}
