package org.example.practice.ekaCareInterview2;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TrainRepository extends JpaRepository<Train, Long> {
    List<Train> findByFromAndTo(String from, String to);
}

