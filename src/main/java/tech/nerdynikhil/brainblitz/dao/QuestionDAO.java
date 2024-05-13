package tech.nerdynikhil.brainblitz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.nerdynikhil.brainblitz.Question;

@Repository
public interface QuestionDAO extends JpaRepository<Question, Integer> {

}
