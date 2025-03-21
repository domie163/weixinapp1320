package com.entity.view;

import com.entity.BisaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 比赛
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-14 11:54:29
 */
@TableName("bisai")
public class BisaiView  extends BisaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BisaiView(){
	}
 
 	public BisaiView(BisaiEntity bisaiEntity){
 	try {
			BeanUtils.copyProperties(this, bisaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
