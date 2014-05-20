package com.star.smt.author;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

import com.star.smt.bean.Author;
import com.star.smt.util.FileUtils;
import com.star.smt.util.HttpUtils;

public class AuthorFactory {
	
	//记录日志
	private static Logger logger = Logger.getLogger(AuthorFactory.class.getName());
	//认证配置文件路径
	private final static String AUTHOR_PRO_PATH = "src/smt/config/author.properties";
	//认证信息
	private static Author author = new Author();
	
	/**
	 * 初始化认证信息，准备认证
	 */
	public static void init(){
		Properties pro = new Properties();
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(AUTHOR_PRO_PATH);
			pro.load(new FileInputStream(AUTHOR_PRO_PATH));
			author.setAuthorUrl(pro.getProperty(Author.AUTHOR_URL));
			author.setClientId(pro.getProperty(Author.CLIENT_ID));
			author.setSite(pro.getProperty(Author.SITE));
			author.setState(pro.getProperty(Author.STATE));
			author.setRedirectUrl(Author.REDIRECT_URL);
			author.setAopSignature(Author.AOP_SIGNATURE);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.warning("找不到指定文件：" + AUTHOR_PRO_PATH);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.warning("读取文件失败：" + AUTHOR_PRO_PATH);
		}finally{
			FileUtils.closeInputStream(inputStream);
		}
	}
	
	/**
	 * 开始认证，获取认证路经
	 */
	public static String getAuthorURL(){
		Author author = getAuthor();
		if(author == null){
			init();
			author = getAuthor();
		}
		return HttpUtils.getAuthorUrl(author);
	}
	
	/**
	 * 获取认证信息,必须先初始化
	 * @return
	 */
	public static Author getAuthor(){
		return author;
	}
	
	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args) {
		AuthorFactory.init();
		System.out.println(AuthorFactory.getAuthorURL());
	}
	
}
