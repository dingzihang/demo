package com.dzh.itchat4j.wechat.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.zhouyafeng.itchat4j.core.Core;
import cn.zhouyafeng.itchat4j.service.impl.LoginServiceImpl;
import cn.zhouyafeng.itchat4j.utils.MyHttpClient;
import cn.zhouyafeng.itchat4j.utils.enums.URLEnum;
import cn.zhouyafeng.itchat4j.utils.tools.CommonTools;

@Controller
@RequestMapping("/test2")
public class QRcodeUtil {
	
	private static Logger LOG = LoggerFactory.getLogger(QRcodeUtil.class);

	@Value("#{config['local.disk.path']}")
	private static String diskPath;
	@Value("#{config['remote.access.host']}")
	private String remotePath;
	
	private static Core core = Core.getInstance();
	private static MyHttpClient myHttpClient = core.getMyHttpClient();
	
	public static String createQR() {
		String qrPath = diskPath + File.separator + "QR.jpg";
		String qrUrl = URLEnum.QRCODE_URL.getUrl() + core.getUuid();
		HttpEntity entity = myHttpClient.doGet(qrUrl, null, true, null);
		try {
			OutputStream out = new FileOutputStream(qrPath);
			byte[] bytes = EntityUtils.toByteArray(entity);
			out.write(bytes);
			out.flush();
			out.close();
		} catch (Exception e) {
			LOG.info(e.getMessage());
			return null;
		}
		return "QR.jpg";
	}

}
