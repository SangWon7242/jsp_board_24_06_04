<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../common/head.jspf" %>

<script>
  function MemberSave__submitForm(form) {
    let JoinForm__submitDone = false;

    if( JoinForm__submitDone ) {
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

    form.loginPwConfirm.value = form.loginPwConfirm.value.trim();

    if(form.loginPwConfirm.value.length == 0) {
      alert('비밀번호 확인을 입력해주세요.');
      form.loginPwConfirm.focus();

      return;
    }

    if(form.loginPw.value != form.loginPwConfirm.value) {
      alert('로그인 비번이 일치하지 않습니다.');
      form.loginPwConfirm.focus();

      return;
    }

    form.name.value = form.name.value.trim();

    if(form.name.value.length == 0) {
      alert('이름을 입력해주세요.');
      form.name.focus();

      return;
    }

    form.submit();
    JoinForm__submitDone = true;
  }
</script>

<section class="member-join-wrap mt-[10px]">
  <div class="container mx-auto">
    <form method="POST" onsubmit="MemberSave__submitForm(this); return false;">
      <div class="flex flex-col gap-y-[10px]">
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
        <label class="input input-bordered flex items-center gap-2">
          <span class="opacity-[0.5]">
            <i class="fa-solid fa-key"></i>
          </span>
          <input name="loginPwConfirm" type="password" class="grow" placeholder="비밀번호 확인"/>
        </label>
        <label class="input input-bordered flex items-center gap-2">
          <span>
            <i class="fa-solid fa-address-card"></i>
          </span>
          <input name="name" type="text" class="grow" placeholder="이름" />
        </label>
      </div>
      <div class="join-btn-group mt-[10px]">
        <button type="submit" class="btn btn-primary">가입</button>
        <button>
          <a href="/usr/article/list" class="btn btn-secondary">취소</a>
        </button>
      </div>
    </form>
  </div>
</section>

<%@ include file="../common/foot.jspf" %>