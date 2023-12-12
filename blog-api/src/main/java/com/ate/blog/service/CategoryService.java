package com.ate.blog.service;

import com.ate.blog.vo.CategoryVo;

public interface CategoryService {
    CategoryVo findCategoryById(Long categoryId);
}
