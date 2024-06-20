<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script>
function ArticleSave__submitForm(form) {
	form.title.value = form.title.value.trim();

	if(form.title.value.length == 0) {
		alert('제목을 입력해주세요.');
		form.title.focus();
		return;
	}

	form.body.value = form.body.value.trim();

	if(form.body.value.length == 0) {
		alert('내용을 입력해주세요.');
		form.body.focus();
		return;
	}

	form.submit();
}
</script>

<%@ include file="../common/head.jspf" %>

<section class="article-modify-wrap mt-[10px]">
  <div class="container mx-auto">
    <form method="POST" onsubmit="ArticleSave__submitForm(this); return false;">
      <div class="flex flex-col gap-y-[5px]">
        <span class="badge badge-primary badge-outline">제목</span>
        <div>
          <input name="title" type="text" maxlength="50" placeholder="제목을 입력해주세요." class="input input-bordered w-full" value="${article.title}">
        </div>
      </div>

      <div class="flex flex-col gap-y-[5px] mt-[10px]">
        <span class="badge badge-secondary badge-outline">내용</span>
        <div>
          <textarea name="body" cols="30" rows="10" placeholder="내용을 입력해주세요." class="textarea textarea-bordered w-full">${article.body}</textarea>
        </div>
      </div>

      <div class="flex gap-x-[5px] mt-[10px]">
        <button type="submit" class="btn btn-primary">수정</button>
        <a href="/usr/article/list" class="btn btn-secondary">취소</a>
      </div>
    </form>
  </div>
</section>

<%@ include file="../common/foot.jspf" %>