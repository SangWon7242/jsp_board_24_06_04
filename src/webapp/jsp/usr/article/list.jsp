<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="../common/head.jspf" %>

<!-- 보통 구역은 섹션으로 나눈다 . -->
<section class="article-list-wrap mt-[10px]">
  <div class="container mx-auto">
    <h1 class="font-bold text-lg">게시물 리스트</h1>
    <ul class="mt-5">
      <c:forEach items="${articles}" var="article">
        <!-- li가 flex 컨테이너 된다. -->
        <!-- li가 flex가 되는 경우 그의 자식은 flex item이 된다. -->
        <li class="flex">
          <a href="/usr/article/detail/free/${article.id}" class="w-[40px] text-center hover:underline hover:text-[red]">
            ${article.id}
          </a>
          <!-- flex-grow : 성장성, 1 -->
          <a href="/usr/article/detail/free/${article.id}" class="flex-grow hover:underline hover:text-[red]">
            ${article.title}
          </a>
          <div class="flex gap-x-3">
            <a onclick="if(!confirm('정말 삭제하시겠습니까?')) return false;" href="/usr/article/delete/free/${article.id}" class="hover:underline hover:text-[red]">
              삭제
            </a>
            <a href="/usr/article/modify/free/${article.id}" class="hover:underline hover:text-[red]">
              수정
            </a>
          </div>
        </li>
      </c:forEach>
    </ul>
  </div>
</section>

<%@ include file="../common/foot.jspf" %>