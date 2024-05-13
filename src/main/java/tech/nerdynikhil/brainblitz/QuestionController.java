package tech.nerdynikhil.brainblitz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("questions")
public class QuestionController {
    @GetMapping("allQuestions")
    public String getAllQuestions() {
        return "Hi, these are your questions!";
    }
}
