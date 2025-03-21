package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxuanshouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxuanshouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxuanshouView;


/**
 * 选手评论表
 *
 * @author 
 * @email 
 * @date 2021-03-14 11:54:29
 */
public interface DiscussxuanshouService extends IService<DiscussxuanshouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxuanshouVO> selectListVO(Wrapper<DiscussxuanshouEntity> wrapper);
   	
   	DiscussxuanshouVO selectVO(@Param("ew") Wrapper<DiscussxuanshouEntity> wrapper);
   	
   	List<DiscussxuanshouView> selectListView(Wrapper<DiscussxuanshouEntity> wrapper);
   	
   	DiscussxuanshouView selectView(@Param("ew") Wrapper<DiscussxuanshouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxuanshouEntity> wrapper);
   	
}

