package com.getage.getageautmaticaly.repository;


import com.getage.getageautmaticaly.model.Zodiac;
import com.getage.getageautmaticaly.service.ZodiacService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface ZodiacRepository extends JpaRepository<Zodiac, Long> {
    Optional<Zodiac> findByBirthDate(Long id, LocalDate birthDate);


}
