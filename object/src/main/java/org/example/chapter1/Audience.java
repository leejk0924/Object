package org.example.chapter1;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        if (bag.hasInvitation()) {
            bag.setTicket(ticket);
            return 0L;
        } else {
            // ticket 구매하여 가방에 넣고,
            bag.setTicket(ticket);
            // 가방에 비용 감소
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
