package Services;

import Models.Booking;
import Models.Show;
import Models.show_seat;
import Repositories.ShowRespository;
import Repositories.ShowSeatRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    ShowRespository showRespository;
    ShowSeatRepository showSeatRepository;
    public Booking bookingTicket(Long showId, List<Long> seatIds){
        Optional<Show> optionalShow=showRespository.findById(showId);
        if(optionalShow.isPresent())
        {
            List<show_seat> showseats=showSeatRepository.findAllById(seatIds);
        }
        return null;

    }
}
