<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
  int a = 9;

  out.println(a); // resp.getWriter().append(a);
%>

<!-- 방식 1 -->
<h1>
  <%out.println("안녕");%>
</h1>

<!-- 방식 2 -->
<h1><%="안녕"%></h1>

<!-- 방식 3 -->
<h1>안녕</h1>