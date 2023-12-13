package com.ate.blog.service;

import com.ate.blog.vo.Result;
import com.ate.blog.vo.TagVo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TagService {

    List<TagVo> findTagsByArticleId(Long articleId);

    Result hots(int limit);

    /**
     * 查询所有的文章标签
     * @return
     */
    Result findAll();
}
