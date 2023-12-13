package com.ate.blog.controller;


import com.ate.blog.service.CommentsService;
import com.ate.blog.vo.Result;
import com.ate.blog.vo.params.CommentParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("comments")
public class CommentsController {

    @Autowired
    private CommentsService commentsService;

    @GetMapping("article/{id}")
    public Result comments(@PathVariable("id") Long id) {
        return Result.success(commentsService.commentsByArticleId(id));
    }

    @PostMapping("create/change")
    public Result comment(@RequestBody CommentParam commentParam) {
        return commentsService.comment(commentParam);
    }
}
