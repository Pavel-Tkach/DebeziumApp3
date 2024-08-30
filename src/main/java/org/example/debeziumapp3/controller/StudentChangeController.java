package org.example.debeziumapp3.controller;

import lombok.RequiredArgsConstructor;
import org.example.debeziumapp3.service.api.StudentChangeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/studentChange")
public class StudentChangeController {

    private final StudentChangeService studentChangeService;

    @GetMapping
    public int getAmountStudentByNative(@RequestHeader("SQL-Query") String sql) {
        return studentChangeService.getAmountStudentByNative(sql);
    }

    @PostMapping("/apply")
    public void applyChange(@RequestParam String sql) {
        studentChangeService.executeChange(sql);
    }
}
