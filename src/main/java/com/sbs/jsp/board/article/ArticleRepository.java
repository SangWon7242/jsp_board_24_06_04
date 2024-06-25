package com.sbs.jsp.board.article;

import com.sbs.jsp.board.util.MysqlUtil;
import com.sbs.jsp.board.util.SecSql;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ArticleRepository {

  public static long write(String title, String body, long memberId) {
    SecSql sql = new SecSql();
    sql.append("INSERT INTO article");
    sql.append("SET regDate = NOW()");
    sql.append(", updateDate = NOW()");
    sql.append(", title = ?", title);
    sql.append(", `body` = ?", body);
    sql.append(", memberId = ?", memberId);

    int id = MysqlUtil.insert(sql);

    return id;
  }

  public static List<ArticleDto> findAll() {
    SecSql sql = new SecSql();
    sql.append("SELECT A.*, M.name AS extra__writerName");
    sql.append("FROM article AS A");
    sql.append("INNER JOIN `member` AS M");
    sql.append("ON M.id = A.memberId");
    sql.append("ORDER BY id DESC");

    List<Map<String, Object>> articlesMap = MysqlUtil.selectRows(sql);

    List<ArticleDto> articleDtos = new ArrayList<>();

    for(Map<String, Object> articleMap : articlesMap) {
      articleDtos.add(new ArticleDto(articleMap));
    }

    return articleDtos;
  }

  public static ArticleDto findById(long id) {
    SecSql sql = new SecSql();
    sql.append("SELECT A.*, M.name AS extra__writerName");
    sql.append("FROM article AS A");
    sql.append("INNER JOIN `member` AS M");
    sql.append("ON M.id = A.memberId");
    sql.append("WHERE A.id = ?", id);

    Map<String, Object> articleMap = MysqlUtil.selectRow(sql);

    if(articleMap.isEmpty()) return null;

    return new ArticleDto(articleMap);
  }

  public void delete(long id) {
    SecSql sql = new SecSql();
    sql.append("DELETE");
    sql.append("FROM article");
    sql.append("WHERE id = ?", id);

    MysqlUtil.delete(sql);
  }

  public void modify(long id, String title, String body) {
    SecSql sql = new SecSql();
    sql.append("UPDATE article");
    sql.append("SET updateDate = NOW()");
    sql.append(", title = ?", title);
    sql.append(", `body` = ?", body);
    sql.append("WHERE id = ?", id);

    MysqlUtil.update(sql);
  }
}
