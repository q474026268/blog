package com.ate.blog.service;

import com.ate.blog.vo.Result;
import com.ate.blog.vo.params.ArticleParam;
import com.ate.blog.vo.params.PageParams;

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

    /**
     * 首页-文章归档
     * @return
     */
    Result listArchives();

    /**
     * 查看文章详情
     * @param articleId
     * @return
     */
    Result findArticleById(Long articleId);

    /**
     * 文章发布服务
     * @return
     */
    Result publish(ArticleParam articleParam);
}
