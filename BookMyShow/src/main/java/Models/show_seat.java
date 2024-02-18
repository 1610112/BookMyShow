package Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class show_seat {
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    private ShowSeatStatus showSeatStatus;


}
