package com.sbs.jsp.board.article;

import com.sbs.jsp.board.Rq;

import java.util.List;

public class ArticleController {
  private ArticleService articleService;

  public ArticleController() {
    articleService = new ArticleService();
  }

  public void showList(Rq rq) {
    List<ArticleDto> articleDtos = articleService.findAll();

    if (articleDtos.isEmpty()) {
      rq.appendBody("게시물이 존재하지 않습니다.");
      return;
    }

    rq.setAttr("articles", articleDtos);
    rq.view("usr/article/list");
  }

  public void showWrite(Rq rq) {
    rq.view("usr/article/write");
  }

  public void doWrite(Rq rq) {
    String title = rq.getParam("title", "");

    if(title.trim().isEmpty()) {
      System.out.println("제목을 입력해주세요.");
      return;
    }

    String body = rq.getParam("body", "");

    if(body.trim().isEmpty()) {
      System.out.println("내용을 입력해주세요.");
      return;
    }

    long id = articleService.write(title, body);

    rq.appendBody("<div>%d번 게시물이 생성되었습니다.</div>\n".formatted(id));
  }

  public void showDetail(Rq rq) {
    long id = rq.getLongPathValueByIndex(1, 0);

    if(id == 0) {
      rq.appendBody("올바른 요청이 아닙니다.");
      return;
    }

    ArticleDto articleDto = articleService.findById(id);

    if(articleDto == null) {
      rq.appendBody("게시물이 존재하지 않습니다.");
      return;
    }

    rq.setAttr("article", articleDto);
    rq.view("usr/article/detail");
  }
}
