package com.ate.blog.service;

import com.ate.blog.vo.Result;
import com.ate.blog.vo.TagVo;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface TagService {

    List<TagVo> findTagsByArticleId(Long articleId);

    Result hots(int limit);
}
