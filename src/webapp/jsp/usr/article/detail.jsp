<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="../common/head.jspf" %>


<style>
  .article-main-cont {
    border-radius: 20px;
    box-shadow: 0 3px 3px rgba(0, 0, 0, 0.3);
    min-height: 400px;
    padding: 20px;
 }
</style>


<section class="article-detail-wrap mt-[10px]">
  <div class="container mx-auto">
    <div class="article-main-cont">
      <c:if test="${article != null}">
        <div class="article-id">
          <span class="badge badge-secondary">ID</span>
          <span> :</span>
          <span class="badge badge-primary badge-outline">
            ${article.id}
          </span>
        </div>
        <div class="article-title">
          <span class="badge badge-primary">TITLE</span>
          <span> : </span>
          <span class="tit">
            ${article.title}
          </span>
        </div>
        <div class="article-body">
          <span class="badge badge-accent">BODY</span>
          <div class="article-body__cont mt-[10px]">
            ${article.body}
          </div>
        </div>
      </c:if>
    </div>
    <div class="flex gap-x-[5px] mt-[5px]">
      <a href="/usr/article/list" class="btn btn-primary">리스트로 이동</a>
    </div>
  </div>
</section>

<%@ include file="../common/foot.jspf" %>