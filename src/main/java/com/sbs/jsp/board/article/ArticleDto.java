package com.sbs.jsp.board.article;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDto {
  private long id;
  private String regDate;
  private String updateDate;
  private String title;
  private String body;

  public ArticleDto(Map<String, Object> articleMap) {
    this.id = (int) articleMap.get("id");
    this.regDate = (String) articleMap.get("regDate");
    this.updateDate = (String) articleMap.get("updateDate");
    this.title = (String) articleMap.get("title");
    this.body = (String) articleMap.get("body");
  }
}
