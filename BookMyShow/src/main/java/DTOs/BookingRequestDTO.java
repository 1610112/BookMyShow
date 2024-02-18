package DTOs;

import Models.Show;
import Models.show_seat;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class BookingRequestDTO {
    public Long showId;
    private List<Long> seatIds;
    public BookingRequestDTO(Long show,List<Long> seatIds){
        this.showId=show;
        this.seatIds=seatIds;
    }


}
