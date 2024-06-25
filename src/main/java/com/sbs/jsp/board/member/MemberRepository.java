package com.sbs.jsp.board.member;

import com.sbs.jsp.board.util.MysqlUtil;
import com.sbs.jsp.board.util.SecSql;

import java.util.Map;

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

  public MemberDto findMemberByLoginId(String loginId) {
    SecSql sql = new SecSql();
    sql.append("SELECT *");
    sql.append("FROM `member`");
    sql.append("WHERE loginId = ?", loginId);

    Map<String, Object> memberMap = MysqlUtil.selectRow(sql);

    if(memberMap.isEmpty()) return null;

    return new MemberDto(memberMap);
  }
}
