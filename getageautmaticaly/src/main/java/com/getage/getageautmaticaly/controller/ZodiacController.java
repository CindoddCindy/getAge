package com.getage.getageautmaticaly.controller;

import com.getage.getageautmaticaly.exception.UserNotFoundException;
import com.getage.getageautmaticaly.model.Zodiac;
import com.getage.getageautmaticaly.repository.UserRepository;
import com.getage.getageautmaticaly.repository.ZodiacRepository;
import com.getage.getageautmaticaly.service.ZodiacService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
@RestController
public class ZodiacController {

    private ZodiacService zodiacService;
    private ZodiacRepository zodiacRepository;

    @GetMapping("/zodiac/details/{id}")
    public Zodiac getZodiac(@PathVariable Long id, @Param("birthDate") String birthDate) {
        return zodiacService.getZodiac(id, birthDate);
    }
}
