package com.star.smt.bean;
/**
 *
 * @author: 王明星(WangMingXing)
 * @En_Name: Star
 * @E-mail: hiwangmx@gmail.com
 * @version:
 * @Created Time: 2014年5月18日 下午3:04:10
 * @Description:
 *
 **/

public class Author {

	//app注册时，分配给app的唯一标示，又称appKey
	public static final String CLIENT_ID = "client_id";
	//参数标识当前授权的站点，直接填写aliexpress
	public static final String SITE = "site";
	//app的入口地址，授权临时令牌会以queryString的形式跟在该url后返回
	public static final String REDIRECT_URL = "redirect_uri";
	//可选，app自定义参数，回跳到redirect_uri时，会原样返回
	public static final String STATE = "state";
	//签名
	public static final String AOP_SIGNATURE = "aop_signature";
	
	
}
