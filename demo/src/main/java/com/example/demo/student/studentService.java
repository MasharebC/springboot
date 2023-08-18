package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class studentService {

    public List<student> getStudents(){
        return List.of(
                new student(1L,
                        "Mashareb",
                        "mashareb@gmail.com",
                        LocalDate.of(2002, Month.FEBRUARY,4),
                        21
                )
        );
    }
}
