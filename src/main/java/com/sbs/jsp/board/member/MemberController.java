package com.sbs.jsp.board.member;

import com.sbs.jsp.board.Rq;

public class MemberController {
  private MemberService memberService;

  public MemberController() {
    memberService = new MemberService();
  }

  public void showLogin(Rq rq) {
    rq.appendBody("로그인");
  }
}
