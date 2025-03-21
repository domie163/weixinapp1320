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


import com.dao.XuanshouDao;
import com.entity.XuanshouEntity;
import com.service.XuanshouService;
import com.entity.vo.XuanshouVO;
import com.entity.view.XuanshouView;

@Service("xuanshouService")
public class XuanshouServiceImpl extends ServiceImpl<XuanshouDao, XuanshouEntity> implements XuanshouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuanshouEntity> page = this.selectPage(
                new Query<XuanshouEntity>(params).getPage(),
                new EntityWrapper<XuanshouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuanshouEntity> wrapper) {
		  Page<XuanshouView> page =new Query<XuanshouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuanshouVO> selectListVO(Wrapper<XuanshouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuanshouVO selectVO(Wrapper<XuanshouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuanshouView> selectListView(Wrapper<XuanshouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuanshouView selectView(Wrapper<XuanshouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
