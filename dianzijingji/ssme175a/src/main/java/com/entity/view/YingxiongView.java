package com.entity.view;

import com.entity.YingxiongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 英雄
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-14 11:54:29
 */
@TableName("yingxiong")
public class YingxiongView  extends YingxiongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YingxiongView(){
	}
 
 	public YingxiongView(YingxiongEntity yingxiongEntity){
 	try {
			BeanUtils.copyProperties(this, yingxiongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
