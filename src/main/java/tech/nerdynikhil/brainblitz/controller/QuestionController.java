package tech.nerdynikhil.brainblitz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.nerdynikhil.brainblitz.Question;
import tech.nerdynikhil.brainblitz.service.QuestionService;

import java.util.List;

@RestController
@RequestMapping ("questions")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }
}
