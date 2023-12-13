package com.ate.blog.service;

import com.ate.blog.vo.CategoryVo;
import com.ate.blog.vo.Result;

public interface CategoryService {
    CategoryVo findCategoryById(Long categoryId);

    Result findAll();
}
