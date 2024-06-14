<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="com.sbs.jsp.board.article.ArticleDto" %>

<%
  ArticleDto article = (ArticleDto)request.getAttribute("article");
%>

<%@ include file="../common/head.jspf" %>

<section class="article-detail-wrap mt-[10px]">
  <div class="container mx-auto">
    <div>
      <% if(article != null) { %>
      <div>
        ID : <%=article.getId()%>
      </div>
      <div>
        TITLE : <%=article.getTitle()%>
      </div>
      <div>
        BODY : <%=article.getBody()%>
      </div>
      <% } %>
    </div>
    <div class="flex gap-x-[5px] mt-[5px]">
      <a href="/usr/article/list">리스트로 이동</a>
    </div>
  </div>
</section>

<%@ include file="../common/foot.jspf" %>