package com.sbs.jsp.board.member;

import com.sbs.jsp.board.util.MysqlUtil;
import com.sbs.jsp.board.util.SecSql;

public class MemberRepository {
  public void join(String loginId, String loginPw, String name) {
    SecSql sql = new SecSql();
    sql.append("INSERT INTO `member`");
    sql.append("SET regDate = NOW()");
    sql.append(", updateDate = NOW()");
    sql.append(", loginId = ?", loginId);
    sql.append(", loginPw = ?", loginPw);
    sql.append(", name = ?", name);

    MysqlUtil.insert(sql);
  }

  public MemberDto findByLoginId(String loginId) {
    SecSql sql = new SecSql();
    sql.append("SELECT *");
    sql.append("FROM `member`");
    sql.append("WHERE loginId = ?", loginId);

    MemberDto memberDto = new MemberDto(MysqlUtil.selectRow(sql));

    if(memberDto == null) return null;

    return memberDto;
  }
}
