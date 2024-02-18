package Repositories;

import Models.show_seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatRepository extends JpaRepository<show_seat,Long> {
    @Override
    List<show_seat> findAllById(Iterable<Long> longs);
}
