package com.sbs.jsp.board.member;

import com.sbs.jsp.board.container.Container;

public class MemberService {
  private MemberRepository memberRepository;

  public MemberService() {
    memberRepository = Container.memberRepository;
  }
}
