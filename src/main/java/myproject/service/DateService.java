package myproject.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DateService {

    public String getDate() {
        return String.valueOf(LocalDate.now());
    }
}
