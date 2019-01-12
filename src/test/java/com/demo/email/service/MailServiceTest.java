package com.demo.email.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {

	@Autowired
	private MailService MailService;

	@Test
	public void testSimpleMail() throws Exception {
		MailService.sendSimpleMail(new String[] { "3011131511@qq.com" }, null, "test simple mail",
				" hello this is simple mail");
	}

	@Test
	public void testHtmlMail() throws Exception {
		String content = "<html>\n<body>\n    <h3>hello world ! 这是一封Html邮件!</h3>\n" + "</body>\n</html>";
		MailService.sendHtmlMail(new String[] { "3011131511@qq.com" }, null, "test simple mail", content);
	}

	@Test
	public void sendAttachmentsMail() {
		String filePath = "e:\\tmp\\application.log";
		MailService.sendAttachmentsMail(new String[] { "3011131511@qq.com" }, null, "主题：带附件的邮件", "有附件，请查收！", filePath);
	}

	@Test
	public void sendInlineResourceMail() {
		String rscId = "neo006";
		String content = "<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ></body></html>";
		String imgPath = "C:\\Users\\summer\\Pictures\\favicon.png";
		MailService.sendInlineResourceMail(new String[] { "3011131511@qq.com" }, null, "主题：这是有图片的邮件", content, imgPath,
				rscId);
	}

}
