package com.xiaoli.like.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoli.like.model.dto.thumb.DoThumbRequest;
import com.xiaoli.like.model.entity.Thumb;
import jakarta.servlet.http.HttpServletRequest;

/**
* @author xiaoli
* @description 针对表【thumb】的数据库操作Service
* @createDate 2025-11-23 17:13:21
*/
public interface ThumbService extends IService<Thumb> {
    /**
     * 点赞
     * @param doThumbRequest
     * @param request
     * @return {@link Boolean }
     */
    Boolean doThumb(DoThumbRequest doThumbRequest, HttpServletRequest request);

    /**
     * 取消点赞
     * @param doThumbRequest
     * @param request
     * @return {@link Boolean }
     */
    Boolean undoThumb(DoThumbRequest doThumbRequest, HttpServletRequest request);

}
