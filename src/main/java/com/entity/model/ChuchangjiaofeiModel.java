package com.entity.model;

import com.entity.ChuchangjiaofeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 出场缴费
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-21 11:34:51
 */
public class ChuchangjiaofeiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车位名称
	 */
	
	private String cheweimingcheng;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 停车价格
	 */
	
	private String tingchejiage;
		
	/**
	 * 入场时间
	 */
	
	private String ruchangshijian;
		
	/**
	 * 出场时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuchangshijian;
		
	/**
	 * 停车时长
	 */
	
	private Integer tingcheshizhang;
		
	/**
	 * 总价格
	 */
	
	private Integer zongjiage;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 车牌号码
	 */
	
	private String chepaihaoma;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：车位名称
	 */
	 
	public void setCheweimingcheng(String cheweimingcheng) {
		this.cheweimingcheng = cheweimingcheng;
	}
	
	/**
	 * 获取：车位名称
	 */
	public String getCheweimingcheng() {
		return cheweimingcheng;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：停车价格
	 */
	 
	public void setTingchejiage(String tingchejiage) {
		this.tingchejiage = tingchejiage;
	}
	
	/**
	 * 获取：停车价格
	 */
	public String getTingchejiage() {
		return tingchejiage;
	}
				
	
	/**
	 * 设置：入场时间
	 */
	 
	public void setRuchangshijian(String ruchangshijian) {
		this.ruchangshijian = ruchangshijian;
	}
	
	/**
	 * 获取：入场时间
	 */
	public String getRuchangshijian() {
		return ruchangshijian;
	}
				
	
	/**
	 * 设置：出场时间
	 */
	 
	public void setChuchangshijian(Date chuchangshijian) {
		this.chuchangshijian = chuchangshijian;
	}
	
	/**
	 * 获取：出场时间
	 */
	public Date getChuchangshijian() {
		return chuchangshijian;
	}
				
	
	/**
	 * 设置：停车时长
	 */
	 
	public void setTingcheshizhang(Integer tingcheshizhang) {
		this.tingcheshizhang = tingcheshizhang;
	}
	
	/**
	 * 获取：停车时长
	 */
	public Integer getTingcheshizhang() {
		return tingcheshizhang;
	}
				
	
	/**
	 * 设置：总价格
	 */
	 
	public void setZongjiage(Integer zongjiage) {
		this.zongjiage = zongjiage;
	}
	
	/**
	 * 获取：总价格
	 */
	public Integer getZongjiage() {
		return zongjiage;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：车牌号码
	 */
	 
	public void setChepaihaoma(String chepaihaoma) {
		this.chepaihaoma = chepaihaoma;
	}
	
	/**
	 * 获取：车牌号码
	 */
	public String getChepaihaoma() {
		return chepaihaoma;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}