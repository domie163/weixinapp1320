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


import com.dao.DiscussxuanshouDao;
import com.entity.DiscussxuanshouEntity;
import com.service.DiscussxuanshouService;
import com.entity.vo.DiscussxuanshouVO;
import com.entity.view.DiscussxuanshouView;

@Service("discussxuanshouService")
public class DiscussxuanshouServiceImpl extends ServiceImpl<DiscussxuanshouDao, DiscussxuanshouEntity> implements DiscussxuanshouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxuanshouEntity> page = this.selectPage(
                new Query<DiscussxuanshouEntity>(params).getPage(),
                new EntityWrapper<DiscussxuanshouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxuanshouEntity> wrapper) {
		  Page<DiscussxuanshouView> page =new Query<DiscussxuanshouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxuanshouVO> selectListVO(Wrapper<DiscussxuanshouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxuanshouVO selectVO(Wrapper<DiscussxuanshouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxuanshouView> selectListView(Wrapper<DiscussxuanshouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxuanshouView selectView(Wrapper<DiscussxuanshouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
