<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../common/head.jspf" %>

<section class="member-join-wrap mt-[10px]">
  <div class="container mx-auto">
    <form method="POST" onsubmit="MemberSave__submitForm(this); return false;">
      <div class="flex flex-col gap-y-[10px]">
        <label class="input input-bordered flex items-center gap-2">
          <span>
            <i class="fa-solid fa-user"></i>
          </span>
          <input type="text" class="grow" placeholder="로그인 아이디" />
        </label>
        <label class="input input-bordered flex items-center gap-2">
          <span>
            <i class="fa-solid fa-key"></i>
          </span>
          <input type="password" class="grow" placeholder="비밀번호"/>
        </label>
        <label class="input input-bordered flex items-center gap-2">
          <span>
            <i class="fa-solid fa-address-card"></i>
          </span>
          <input type="text" class="grow" placeholder="이름" />
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