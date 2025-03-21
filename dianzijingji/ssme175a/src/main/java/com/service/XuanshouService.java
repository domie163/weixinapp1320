package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuanshouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuanshouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuanshouView;


/**
 * 选手
 *
 * @author 
 * @email 
 * @date 2021-03-14 11:54:29
 */
public interface XuanshouService extends IService<XuanshouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuanshouVO> selectListVO(Wrapper<XuanshouEntity> wrapper);
   	
   	XuanshouVO selectVO(@Param("ew") Wrapper<XuanshouEntity> wrapper);
   	
   	List<XuanshouView> selectListView(Wrapper<XuanshouEntity> wrapper);
   	
   	XuanshouView selectView(@Param("ew") Wrapper<XuanshouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuanshouEntity> wrapper);
   	
}

