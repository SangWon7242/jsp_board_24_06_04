package com.sbs.jsp.board.article;

import com.sbs.jsp.board.Rq;
import com.sbs.jsp.board.container.Container;
import com.sbs.jsp.board.member.MemberDto;

import java.util.List;

public class ArticleController {
  private ArticleService articleService;

  public ArticleController() {
    articleService = Container.articleService;
  }

  public void showList(Rq rq) {
    List<ArticleDto> articleDtos = articleService.findAll();

    if (articleDtos.isEmpty()) {
      rq.historyBack("게시물이 존재하지 않습니다.");
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
      rq.historyBack("제목을 입력해주세요.");
      return;
    }

    String body = rq.getParam("body", "");

    if(body.trim().isEmpty()) {
      rq.historyBack("내용을 입력해주세요.");
      return;
    }

    MemberDto memberDto = (MemberDto) rq.getSessionAttr("loginedMember");

    long id = articleService.write(title, body, memberDto.getId());

    rq.replace("/usr/article/detail/free/%d".formatted(id), "%d번 게시물이 생성되었습니다.".formatted(id));
  }

  public void showDetail(Rq rq) {
    long id = rq.getLongPathValueByIndex(1, 0);

    if(id == 0) {
      rq.historyBack("번호를 입력해주세요.");
      return;
    }

    ArticleDto articleDto = articleService.findById(id);

    if(articleDto == null) {
      rq.historyBack("해당 게시물이 존재하지 않습니다.");
      return;
    }

    rq.setAttr("article", articleDto);
    rq.view("usr/article/detail");
  }

  public void doDelete(Rq rq) {
    long id = rq.getLongPathValueByIndex(1, 0);

    if(id == 0) {
      rq.historyBack("번호를 입력해주세요.");
      return;
    }

    ArticleDto articleDto = articleService.findById(id);

    if(articleDto == null) {
      rq.historyBack("해당 게시물이 존재하지 않습니다.");
      return;
    }

    articleService.delete(id);

    rq.replace("/usr/article/list/free", "%d번 게시물이 삭제되었습니다.".formatted(id));
  }

  public void showModify(Rq rq) {
    long id = rq.getLongPathValueByIndex(1, 0);

    if(id == 0) {
      rq.historyBack("번호를 입력해주세요.");
      return;
    }

    ArticleDto articleDto = articleService.findById(id);

    if(articleDto == null) {
      rq.historyBack("해당 게시물이 존재하지 않습니다.");
      return;
    }

    rq.setAttr("article", articleDto);
    rq.view("usr/article/modify");
  }

  public void doModify(Rq rq) {
    long id = rq.getLongPathValueByIndex(1, 0);
    String title = rq.getParam("title", "");
    String body = rq.getParam("body", "");

    articleService.modify(id, title, body);
    rq.replace("/usr/article/detail/free/%d".formatted(id), "%d번 게시물이 수정되었습니다.".formatted(id));
  }
}
