package com.ate.blog.service;

import com.ate.blog.vo.Result;
import com.ate.blog.vo.params.PageParams;
import org.springframework.stereotype.Service;

public interface ArticleService {
    /**
     * 分页查询-文章列表
     * @param pageParams
     * @return
     */
    Result listArticle(PageParams pageParams);

    /**
     * 首页-最热文章
     * @param limit
     * @return
     */
    Result hotArticle(int limit);

    /**
     * 首页-最新文章
     * @param limit
     * @return
     */
    Result newArticle(int limit);
}
