<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="../common/head.jspf" %>

<script>
  function MemberLoginForm__submitForm(form) {
    let MemberLogin__submitDone = false;

    if( MemberLogin__submitDone ) {
      alert('처리 중입니다.');
      return;
    }

    form.loginId.value = form.loginId.value.trim();

    if(form.loginId.value.length == 0) {
      alert('로그인 아이디를 입력해주세요.');
      form.loginId.focus();

      return;
    }

    form.loginPw.value = form.loginPw.value.trim();

    if(form.loginPw.value.length == 0) {
      alert('비밀번호를 입력해주세요.');
      form.loginPw.focus();

      return;
    }

    form.submit();
    MemberLogin__submitDone = true;
  }
</script>

<section class="member-login-wrap mt-[10px] min-h-[80vh] flex items-center justify-center">
  <div class="container mx-auto">
    <form method="POST" onsubmit="MemberLoginForm__submitForm(this); return false;" class="flex flex-col items-center justify-center">
      <h2 class="font-bold text-3xl">로그인</h2>
      <div class="flex flex-col gap-y-[10px] w-[400px]">
        <label class="input input-bordered flex items-center gap-2">
          <span>
            <i class="fa-solid fa-user"></i>
          </span>
          <input name="loginId" type="text" class="grow" placeholder="로그인 아이디" />
        </label>
        <label class="input input-bordered flex items-center gap-2">
          <span>
            <i class="fa-solid fa-key"></i>
          </span>
          <input name="loginPw" type="password" class="grow" placeholder="비밀번호"/>
        </label>
      </div>
      <div class="join-btn-group mt-[10px] flex w-[400px] gap-x-1">
        <button type="submit" class="btn btn-primary flex-1">로그인</button>
        <button class="flex-1 btn btn-secondary">
          <a href="/usr/article/list">취소</a>
        </button>
      </div>
    </form>
  </div>
</section>

<%@ include file="../common/foot.jspf" %>