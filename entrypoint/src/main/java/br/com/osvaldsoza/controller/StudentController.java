package br.com.osvaldsoza.controller;

import br.com.osvaldsoza.aluno.usecase.StudentRecord;
import br.com.osvaldsoza.converter.StudentRequestConverter;
import br.com.osvaldsoza.request.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/studenties")
public class StudentController {

    @Autowired
    private StudentRecord studentRecord;

    @Autowired
    private StudentRequestConverter studentRequestConverter;

    @GetMapping
    public String doYouHearMe() {
        return "I Hear You!";
    }

    @PostMapping
    public void save(@RequestBody StudentRequest studentRequest) {
        var student = studentRequestConverter.toStudenty(studentRequest);
        this.studentRecord.save(student);
    }
}
