<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="../common/head.jspf" %>

<!-- 보통 구역은 섹션으로 나눈다 . -->
<section class="article-list-wrap mt-[10px]">
  <div class="container mx-auto">
    <h1 class="font-bold text-lg">게시물 리스트</h1>
    <table class="table">
      <colgroup>
        <col style="width: 100px;">
        <col>
        <col style="width: 100px;">
      </colgroup>
      <thead>
        <tr class="text-center">
          <th>번호</th>
          <th>제목</th>
          <th>작성자</th>
          <th>비고</th>
        </tr>
      </thead>
      <tbody>
      <c:forEach items="${articles}" var="article">
        <tr>
          <th class="text-center">${article.id}</th>
          <td>
            <a href="/usr/article/detail/free/${article.id}" class="flex-grow hover:underline hover:text-[red]">
              ${article.title}
            </a>
          </td>
          <td class="text-center">
            ${article.extra__writerName}
          </td>
          <td class="text-center">
            <a onclick="if(!confirm('정말 삭제하시겠습니까?')) return false;" href="/usr/article/delete/free/${article.id}?_method=DELETE" class="hover:underline hover:text-[red]">
              삭제
            </a>

            <a href="/usr/article/modify/free/${article.id}" class="hover:underline hover:text-[red]">
              수정
            </a>
          </td>
        </tr>
      </c:forEach>
      </tbody>
    </table>
  </div>
</section>

<%@ include file="../common/foot.jspf" %>