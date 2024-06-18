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
}
