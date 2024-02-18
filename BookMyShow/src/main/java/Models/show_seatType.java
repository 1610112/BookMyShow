package Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class show_seatType {
    @ManyToOne
    private Show show;
    @ManyToOne
    private SeatType seatType;
    int priceOfShowTicket;
}
