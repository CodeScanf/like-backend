package com.xiaoli.like.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoli.like.model.entity.Blog;
import com.xiaoli.like.model.vo.BlogVO;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

/**
* @author xiaoli
* @description 针对表【blog】的数据库操作Service
* @createDate 2025-11-23 17:13:09
*/
public interface BlogService extends IService<Blog> {

    BlogVO getBlogVOById(long blogId, HttpServletRequest request);

    List<BlogVO> getBlogVOList(List<Blog> blogList, HttpServletRequest request);

}
