package com.entity.view;

import com.entity.RuchangtingcheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 入场停车
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-21 11:34:51
 */
@TableName("ruchangtingche")
public class RuchangtingcheView  extends RuchangtingcheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RuchangtingcheView(){
	}
 
 	public RuchangtingcheView(RuchangtingcheEntity ruchangtingcheEntity){
 	try {
			BeanUtils.copyProperties(this, ruchangtingcheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
