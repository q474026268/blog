package com.ate.blog.service;

import com.ate.blog.dao.pojo.Comment;
import com.ate.blog.vo.Result;
import com.ate.blog.vo.params.CommentParam;

public interface CommentsService {

    /**
     * 根据文章id 查询所有的评论列表
     * @param id
     * @return
     */
    Result commentsByArticleId(Long id);


    Result comment(CommentParam commentParam);
}
