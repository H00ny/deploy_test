package com.example.demo.controller;

import com.example.demo.dto.Question;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("questions")
public class QuestionController {

  private static final List<Question> QUESTIONS = List.of(
    new Question("text1", "answer1"),
    new Question("text2", "answer2"),
    new Question("text3", "answer3"),
    new Question("text4", "answer4")
  );

  @GetMapping
  public List<Question> get() {
    return QUESTIONS;
  }
}
