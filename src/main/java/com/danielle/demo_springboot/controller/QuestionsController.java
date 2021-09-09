package com.danielle.demo_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionsController {

    private String[] questions = {
            "Where is Amsterdam?",
            "Where is New York?"
    };

    private String[] answers = {
            "In the Netherlands",
            "in US of A"
    };

    @GetMapping(value = "/questions")  // collection
    public String[] getQuestions() {
        return questions;
    }

    @GetMapping(value = "/questions/{nr}")  // item
    public String getQuestion(@PathVariable int nr) {
        return questions[nr - 1];
    }

    @GetMapping(value = "/questions/{nr}/answer")  // document
    public String getAnswer(@PathVariable int nr) {
        return answers[nr - 1];
    }
}
