package Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seat extends Base{
    private String seatName;
    @ManyToOne
    Screen screen;
    @ManyToOne
    SeatType seatType;

    private int row;
    private int col;
}
