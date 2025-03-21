package com.entity.vo;

import com.entity.BisaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 比赛
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-14 11:54:29
 */
public class BisaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 赛区
	 */
	
	private String saiqu;
		
	/**
	 * 战队介绍
	 */
	
	private String zhanduijieshao;
		
	/**
	 * 队标照片
	 */
	
	private String duibiaozhaopian;
		
	/**
	 * 战队成员
	 */
	
	private String zhanduichengyuan;
		
	/**
	 * 战队数据
	 */
	
	private String zhanduishuju;
		
	/**
	 * 近期比赛
	 */
	
	private String jinqibisai;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：赛区
	 */
	 
	public void setSaiqu(String saiqu) {
		this.saiqu = saiqu;
	}
	
	/**
	 * 获取：赛区
	 */
	public String getSaiqu() {
		return saiqu;
	}
				
	
	/**
	 * 设置：战队介绍
	 */
	 
	public void setZhanduijieshao(String zhanduijieshao) {
		this.zhanduijieshao = zhanduijieshao;
	}
	
	/**
	 * 获取：战队介绍
	 */
	public String getZhanduijieshao() {
		return zhanduijieshao;
	}
				
	
	/**
	 * 设置：队标照片
	 */
	 
	public void setDuibiaozhaopian(String duibiaozhaopian) {
		this.duibiaozhaopian = duibiaozhaopian;
	}
	
	/**
	 * 获取：队标照片
	 */
	public String getDuibiaozhaopian() {
		return duibiaozhaopian;
	}
				
	
	/**
	 * 设置：战队成员
	 */
	 
	public void setZhanduichengyuan(String zhanduichengyuan) {
		this.zhanduichengyuan = zhanduichengyuan;
	}
	
	/**
	 * 获取：战队成员
	 */
	public String getZhanduichengyuan() {
		return zhanduichengyuan;
	}
				
	
	/**
	 * 设置：战队数据
	 */
	 
	public void setZhanduishuju(String zhanduishuju) {
		this.zhanduishuju = zhanduishuju;
	}
	
	/**
	 * 获取：战队数据
	 */
	public String getZhanduishuju() {
		return zhanduishuju;
	}
				
	
	/**
	 * 设置：近期比赛
	 */
	 
	public void setJinqibisai(String jinqibisai) {
		this.jinqibisai = jinqibisai;
	}
	
	/**
	 * 获取：近期比赛
	 */
	public String getJinqibisai() {
		return jinqibisai;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
