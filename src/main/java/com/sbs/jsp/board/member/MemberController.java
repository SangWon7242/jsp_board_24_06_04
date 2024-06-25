package com.sbs.jsp.board.member;

import com.sbs.jsp.board.Rq;
import com.sbs.jsp.board.container.Container;

public class MemberController {
  private MemberService memberService;

  public MemberController() {
    memberService = Container.memberService;
  }

  public void showLogin(Rq rq) {
    rq.view("usr/member/login");
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

    boolean isJoinAvailableLoginId = memberService.findMemberByLoginId(loginId) != null;

    if(isJoinAvailableLoginId) {
      rq.historyBack("%s(은)는 이미 사용중인 로그인 아이디입니다.".formatted(loginId));
      return;
    }

    memberService.join(loginId, loginPw, name);

    rq.replace("/usr/article/list/free", "회원가입이 되었습니다.");
  }

  public void doLogin(Rq rq) {
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

    // loginId를 찾았을 때 해당 id가 없는 경우는 현재 DB에 일치하는 로그인 아이가 없다.
    MemberDto memberDto = memberService.findMemberByLoginId(loginId);

    if(memberDto == null) {
      rq.historyBack("%s(은)는 존재하지 않는 로그인 아이디입니다.".formatted(loginId));
      return;
    }

    rq.setSessionAttr("loginedMember", memberDto);

    rq.replace("/usr/article/list", "로그인 되었습니다.");
  }

  public void doLogout(Rq rq) {
    rq.removeSessionAttr("loginedMember");

    rq.replace("/usr/article/list", "로그아웃 되었습니다.");
  }
}
