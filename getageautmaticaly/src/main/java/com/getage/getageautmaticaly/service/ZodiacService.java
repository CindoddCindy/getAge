package com.getage.getageautmaticaly.service;

import com.getage.getageautmaticaly.exception.UserNotFoundException;
import com.getage.getageautmaticaly.model.Zodiac;
import com.getage.getageautmaticaly.repository.ZodiacRepository;

import java.time.LocalDate;

public class ZodiacService {

    private ZodiacRepository zodiacRepository;

    public ZodiacService(ZodiacRepository zodiacRepository) {
        this.zodiacRepository = zodiacRepository;
    }

    public Zodiac getZodiac(Long id, String birthDate) {

        int day = 7;
        String month = "August";
        String sign="";
        if (month == "January") {
            if (day < 20)
                sign = "Capricorn";
            else
                sign = "Aquarius";
        }
        else if (month == "February") {
            if (day < 19)
                sign = "Aquarius";
            else
                sign = "Pisces";
        }
        else if(month == "March") {
            if (day < 21)
                sign = "Pisces";
            else
                sign = "Aries";
        }
        else if (month == "April") {
            if (day < 20)
                sign = "Aries";
            else
                sign = "Taurus";
        }
        else if (month == "May") {
            if (day < 21)
                sign = "Taurus";
            else
                sign = "Gemini";
        }
        else if( month == "June") {
            if (day < 21)
                sign = "Gemini";
            else
                sign = "Cancer";
        }
        else if (month == "July") {
            if (day < 23)
                sign = "Cancer";
            else
                sign = "Leo";
        }
        else if( month == "August") {
            if (day < 23)
                sign = "Leo";
            else
                sign = "Virgo";
        }
        else if (month == "September") {
            if (day < 23)
                sign = "Virgo";
            else
                sign = "Libra";
        }
        else if (month == "October") {
            if (day < 23)
                sign = "Libra";
            else
                sign = "Scorpio";
        }
        else if (month == "November") {
            if (day < 22)
                sign = "scorpio";
            else
                sign = "Sagittarius";
        }
        else if (month == "December") {
            if (day < 22)
                sign = "Sagittarius";
            else
                sign ="Capricorn";
        }

        System.out.println("The astrological sign for " + id + " " + birthDate  );
        return zodiacRepository

                .findById(id)

                .orElseThrow(UserNotFoundException::new);

    }
            }

