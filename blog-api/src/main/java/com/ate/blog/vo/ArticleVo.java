package com.ate.blog.vo;

import com.ate.blog.dao.pojo.SysUser;
import com.ate.blog.dao.pojo.Tag;
import lombok.Data;

import java.util.List;

@Data
public class ArticleVo {

    private Long id;

    private String title;

    private String summary;

    private int commentCounts;

    private int viewCounts;

    private int weight;
    /**
     * 创建时间
     */
    private String createDate;

    private String author;

    private List<TagVo> tags;

}
