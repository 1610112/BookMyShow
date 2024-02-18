package Controllers;

import DTOs.BookingRequestDTO;
import DTOs.BookingResponseDTO;
import Models.Show;
import Services.BookingService;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private BookingService bookingService;
    public BookingResponseDTO booking(BookingRequestDTO bookingRequestDTO)
    {
        bookingService.bookingTicket(bookingRequestDTO.);
        return null;
    }
}
