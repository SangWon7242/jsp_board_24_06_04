package com.sbs.jsp.board.article;

import java.util.List;

public class ArticleService {
  private ArticleRepository articleRepository;

  public ArticleService() {
    articleRepository = new ArticleRepository();
  }

  public List<ArticleDto> getArticles() {
    return articleRepository.getArticles();
  }

  public long write(String title, String body) {
    return articleRepository.write(title, body);
  }
}
