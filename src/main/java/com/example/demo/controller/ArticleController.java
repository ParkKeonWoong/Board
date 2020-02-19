// package com.example.demo.controller;

// import java.util.ArrayList;
// import java.util.List;

// import com.example.demo.domain.Article;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
 
// @Controller
// public class ArticleController {
   
//   @RequestMapping("/list")
//   public List<Article> test() {
//     List<Article> list = new ArrayList<Article>();
     
//     for(int i=1; i<=10; i++) {
//             Article article = new Article();
//             article.setSeq(i);
//             article.setText("This is text");
//             article.setTitle("This is title");
//             article.setWriter("I am writer");
             
//             list.add(article);
//     }
//     return list;
//   }
 
//   @RequestMapping("article/{seq}")
//   public Article detail(@PathVariable("seq") long seq) {
 
//         Article article = new Article();
//         article.setSeq(seq);
//         article.setText("This is text");
//         article.setTitle("This is title");
//         article.setWriter("I am writer");
 
//     return article;
//   }
// }