package com.sbs.jsp.board.article;

import com.sbs.jsp.board.util.MysqlUtil;
import com.sbs.jsp.board.util.SecSql;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ArticleRepository {

  public static long write(String title, String body) {
    SecSql sql = new SecSql();
    sql.append("INSERT INTO article");
    sql.append("SET regDate = NOW()");
    sql.append(", updateDate = NOW()");
    sql.append(", title = ?", title);
    sql.append(", `body` = ?", body);

    int id = MysqlUtil.insert(sql);

    return id;
  }

  public static List<ArticleDto> findAll() {
    SecSql sql = new SecSql();
    sql.append("SELECT *");
    sql.append("FROM article");
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
    sql.append("SELECT *");
    sql.append("FROM article");
    sql.append("WHERE id = ?", id);

    ArticleDto articleDto = new ArticleDto(MysqlUtil.selectRow(sql));

    if(articleDto == null) return null;

    return articleDto;
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
