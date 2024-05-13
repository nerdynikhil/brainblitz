package tech.nerdynikhil.brainblitz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.nerdynikhil.brainblitz.Question;
import tech.nerdynikhil.brainblitz.dao.QuestionDAO;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDAO questionDAO;

    public List<Question> getAllQuestions() {
        return questionDAO.findAll();
    }
}
