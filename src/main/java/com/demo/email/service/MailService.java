package com.demo.email.service;

public interface MailService {

	/**
	 * 发送普通邮件
	 * 
	 * @param to      目标地址
	 * @param subject 标题
	 * @param content 内容
	 */
	void sendSimpleMail(String[] to, String[] cc, String subject, String content);

	/**
	 * 发送html格式邮件
	 * 
	 * @param to
	 * @param subject
	 * @param content
	 */
	void sendHtmlMail(String[] to, String[] cc, String subject, String content);

	/**
	 * 发送带附件的邮件
	 * 
	 * @param to
	 * @param subject
	 * @param content
	 * @param filePath
	 */
	void sendAttachmentsMail(String[] to, String[] cc, String subject, String content, String filePath);

	/**
	 * 发送带静态资源的邮件
	 * 
	 * @param to
	 * @param subject
	 * @param content
	 * @param rscPath
	 * @param rscId
	 */
	void sendInlineResourceMail(String[] to, String[] cc, String subject, String content, String rscPath, String rscId);
}
