package com.sbs.jsp.board.container;

import com.sbs.jsp.board.article.ArticleController;
import com.sbs.jsp.board.article.ArticleRepository;
import com.sbs.jsp.board.article.ArticleService;
import com.sbs.jsp.board.member.MemberController;
import com.sbs.jsp.board.member.MemberRepository;
import com.sbs.jsp.board.member.MemberService;

public class Container {
  public static MemberRepository memberRepository;
  public static ArticleRepository articleRepository;

  public static MemberService memberService;
  public static ArticleService articleService;

  public static MemberController memberController;
  public static ArticleController articleController;

  public static void init() {
    memberRepository = new MemberRepository();
    articleRepository = new ArticleRepository();

    memberService = new MemberService();
    articleService = new ArticleService();

    memberController = new MemberController();
    articleController = new ArticleController();
  }
}
