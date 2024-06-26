package com.sbs.jsp.board.servlet;

import com.sbs.jsp.board.Rq;
import com.sbs.jsp.board.article.ArticleController;
import com.sbs.jsp.board.container.Container;
import com.sbs.jsp.board.member.MemberController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/usr/*")
public class DispatcherServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Rq rq = new Rq(req, resp);

    beforeAction(rq);

    MemberController memberController = Container.memberController;
    ArticleController articleController = Container.articleController;

    // getRequestURI
    // http://localhost:8080/usr/article/list
    // /usr/article/list 부분만 가져온다.
    String url = req.getRequestURI();

    switch (rq.getRouteMethod()) {
      case "GET" -> {
        switch (rq.getActionPath()) {
          case "/usr/article/list" -> articleController.showList(rq);
          case "/usr/article/detail" -> articleController.showDetail(rq);
          case "/usr/article/write" -> articleController.showWrite(rq);
          case "/usr/article/modify" -> articleController.showModify(rq);
          case "/usr/member/join" -> memberController.showJoin(rq);
          case "/usr/member/login" -> memberController.showLogin(rq);
          case "/usr/member/logout" -> memberController.doLogout(rq);
        }
      }
      case "POST" -> {
        switch (rq.getActionPath()) {
          case "/usr/article/write" -> articleController.doWrite(rq);
          case "/usr/article/modify" -> articleController.doModify(rq);
          case "/usr/member/join" -> memberController.doJoin(rq);
          case "/usr/member/login" -> memberController.doLogin(rq);
        }
      }

      case "DELETE" -> {
        switch (rq.getActionPath()) {
          case "/usr/article/delete" -> articleController.doDelete(rq);
        }
      }
    }
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doGet(req, resp);
  }

  private void beforeAction(Rq rq) {
    if(rq.getSessionAttr("loginedMember") != null) {
      rq.setLogined(true);
    }

    rq.setAttr("isLogined", rq.isLogined());
  }
}
