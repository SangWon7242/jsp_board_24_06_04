package com.sbs.jsp.board.member;

import com.sbs.jsp.board.Rq;
import com.sbs.jsp.board.container.Container;

public class MemberController {
  private MemberService memberService;

  public MemberController() {
    memberService = Container.memberService;
  }

  public void showLogin(Rq rq) {
    rq.print("로그인");
  }

  public void showJoin(Rq rq) {
    rq.view("usr/member/join");
  }

  public void doJoin(Rq rq) {
    String loginId = rq.getParam("loginId", "");

    if(loginId.trim().isEmpty()) {
      rq.historyBack("아이디를 입력해주세요.");
      return;
    }

    String loginPw = rq.getParam("loginPw", "");

    if(loginPw.trim().isEmpty()) {
      rq.historyBack("비밀번호를 입력해주세요.");
      return;
    }

    String name = rq.getParam("name", "");

    if(name.trim().isEmpty()) {
      rq.historyBack("이름을 입력해주세요.");
      return;
    }

    memberService.join(loginId, loginPw, name);

    rq.replace("/usr/article/list/free", "회원가입이 되었습니다.");
  }
}
