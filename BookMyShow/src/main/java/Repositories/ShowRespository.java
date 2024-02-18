package Repositories;

import Models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShowRespository extends JpaRepository<Show,Long> {
    @Override
    Optional<Show> findById(Long aLong);
}
