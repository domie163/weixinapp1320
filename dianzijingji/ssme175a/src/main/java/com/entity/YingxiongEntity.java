package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 英雄
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-14 11:54:29
 */
@TableName("yingxiong")
public class YingxiongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YingxiongEntity() {
		
	}
	
	public YingxiongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 英雄名称
	 */
					
	private String yingxiongmingcheng;
	
	/**
	 * 真名
	 */
					
	private String zhenming;
	
	/**
	 * 类型
	 */
					
	private String leixing;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	/**
	 * 技能介绍
	 */
					
	private String jinengjieshao;
	
	/**
	 * 背景介绍
	 */
					
	private String beijingjieshao;
	
	/**
	 * 英雄技巧
	 */
					
	private String yingxiongjiqiao;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：英雄名称
	 */
	public void setYingxiongmingcheng(String yingxiongmingcheng) {
		this.yingxiongmingcheng = yingxiongmingcheng;
	}
	/**
	 * 获取：英雄名称
	 */
	public String getYingxiongmingcheng() {
		return yingxiongmingcheng;
	}
	/**
	 * 设置：真名
	 */
	public void setZhenming(String zhenming) {
		this.zhenming = zhenming;
	}
	/**
	 * 获取：真名
	 */
	public String getZhenming() {
		return zhenming;
	}
	/**
	 * 设置：类型
	 */
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
	/**
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
	/**
	 * 设置：技能介绍
	 */
	public void setJinengjieshao(String jinengjieshao) {
		this.jinengjieshao = jinengjieshao;
	}
	/**
	 * 获取：技能介绍
	 */
	public String getJinengjieshao() {
		return jinengjieshao;
	}
	/**
	 * 设置：背景介绍
	 */
	public void setBeijingjieshao(String beijingjieshao) {
		this.beijingjieshao = beijingjieshao;
	}
	/**
	 * 获取：背景介绍
	 */
	public String getBeijingjieshao() {
		return beijingjieshao;
	}
	/**
	 * 设置：英雄技巧
	 */
	public void setYingxiongjiqiao(String yingxiongjiqiao) {
		this.yingxiongjiqiao = yingxiongjiqiao;
	}
	/**
	 * 获取：英雄技巧
	 */
	public String getYingxiongjiqiao() {
		return yingxiongjiqiao;
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
