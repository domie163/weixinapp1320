package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussbisaiDao;
import com.entity.DiscussbisaiEntity;
import com.service.DiscussbisaiService;
import com.entity.vo.DiscussbisaiVO;
import com.entity.view.DiscussbisaiView;

@Service("discussbisaiService")
public class DiscussbisaiServiceImpl extends ServiceImpl<DiscussbisaiDao, DiscussbisaiEntity> implements DiscussbisaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbisaiEntity> page = this.selectPage(
                new Query<DiscussbisaiEntity>(params).getPage(),
                new EntityWrapper<DiscussbisaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbisaiEntity> wrapper) {
		  Page<DiscussbisaiView> page =new Query<DiscussbisaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbisaiVO> selectListVO(Wrapper<DiscussbisaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbisaiVO selectVO(Wrapper<DiscussbisaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbisaiView> selectListView(Wrapper<DiscussbisaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbisaiView selectView(Wrapper<DiscussbisaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
