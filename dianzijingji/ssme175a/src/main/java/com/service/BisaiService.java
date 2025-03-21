package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BisaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BisaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BisaiView;


/**
 * 比赛
 *
 * @author 
 * @email 
 * @date 2021-03-14 11:54:29
 */
public interface BisaiService extends IService<BisaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BisaiVO> selectListVO(Wrapper<BisaiEntity> wrapper);
   	
   	BisaiVO selectVO(@Param("ew") Wrapper<BisaiEntity> wrapper);
   	
   	List<BisaiView> selectListView(Wrapper<BisaiEntity> wrapper);
   	
   	BisaiView selectView(@Param("ew") Wrapper<BisaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BisaiEntity> wrapper);
   	
}

