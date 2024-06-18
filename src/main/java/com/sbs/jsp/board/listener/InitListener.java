package com.sbs.jsp.board.listener;

import com.sbs.jsp.board.App;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class InitListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    App.init();
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    // 애플리케이션 종료 시 실행할 정리 작업을 여기에 작성합니다.
    System.out.println("애플리케이션이 종료되었습니다.");
    // 예: 데이터베이스 연결 해제, 캐시 정리 등
  }
}
