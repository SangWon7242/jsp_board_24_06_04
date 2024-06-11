package com.sbs.jsp.board.article;

import com.sbs.jsp.board.Rq;

import java.util.ArrayList;
import java.util.List;

public class ArticleController {
  public void showList(Rq rq) {
    List<ArticleDto> articleDtos = new ArrayList<>();

    for(int i = 5; i >= 1; i--) {
      articleDtos.add(new ArticleDto(i, "제목" + i, "내용" + i));
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

    rq.appendBody("<div>title : %s</div>\n".formatted(title));
    rq.appendBody("<div>body : %s</div>\n".formatted(body));
  }
}
