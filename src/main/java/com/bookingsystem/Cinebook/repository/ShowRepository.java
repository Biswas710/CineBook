package com.bookingsystem.Cinebook.repository;

import com.bookingsystem.Cinebook.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends JpaRepository<Show,Long> {
}
