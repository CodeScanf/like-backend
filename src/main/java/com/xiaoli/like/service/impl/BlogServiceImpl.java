package com.xiaoli.like.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoli.like.mapper.BlogMapper;
import com.xiaoli.like.model.entity.Blog;
import com.xiaoli.like.service.BlogService;
import org.springframework.stereotype.Service;

/**
* @author xiaoli
* @description 针对表【blog】的数据库操作Service实现
* @createDate 2025-11-23 17:13:08
*/
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog>
    implements BlogService{

}




