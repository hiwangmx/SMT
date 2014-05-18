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

	/**
	 * 参数签名(_aop_signature)为所有参数key + value 字符串拼接后排序，
	 * 把排序结果拼接为字符串data后通过bytesToHexString(HAMC-RSA1(data, appSecret))计算签名。
	 *  验证签名的方式为对参数执行同样的签名，比较传入的签名结果和计算的结果是否一致，一致为验签通过。
	 */
	
	// app注册时，分配给app的唯一标示，又称appKey
	public static final String CLIENT_ID = "client_id";
	// 参数标识当前授权的站点，直接填写aliexpress
	public static final String SITE = "site";
	// app的入口地址，授权临时令牌会以queryString的形式跟在该url后返回
	public static final String REDIRECT_URL = "redirect_uri";
	// 可选，app自定义参数，回跳到redirect_uri时，会原样返回
	public static final String STATE = "state";
	// 签名
	public static final String AOP_SIGNATURE = "aop_signature";

	private String clientId;
	private String site;
	private String redirectUrl;
	private String state;
	private String aopSignature;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAopSignature() {
		return aopSignature;
	}

	public void setAopSignature(String aopSignature) {
		this.aopSignature = aopSignature;
	}

}
