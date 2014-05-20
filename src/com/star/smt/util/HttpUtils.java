package com.star.smt.util;

import com.star.smt.bean.Author;

public class HttpUtils {

	/**
	 * 根据author获取认证URL
	 * @param author
	 * @return
	 */
	public static String getAuthorUrl(Author author){
		StringBuilder sb = new StringBuilder();
		sb.append(author.getAuthorUrl())
			.append(Author.CLIENT_ID + "=" + author.getClientId())
			.append("&" + Author.SITE + "=" + author.getSite())
			.append("&" + Author.REDIRECT_URL + "=" + author.getRedirectUrl())
			.append("&" + Author.STATE + "=" + author.getState())
			.append("&" + Author.AOP_SIGNATURE + "=" + author.getAopSignature());
		return sb.toString();
	}
	
}
