package com.rao;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.rao.tool.WebDriverTool;

public class AllRun {

	public static void main(String[] args) throws Exception {
		Thread.sleep(3000);
		System.setProperty("webdriver.chrome.driver", "D:/JOBSoftware/chromedriver_win32/chromedriver.exe");
		WebDriver webDriver = WebDriverTool.webdriver;
		webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		
		// 与浏览器同步非常重要，必须等待浏览器加载完毕
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//打开目标地址
		webDriver.get("");
		
		//登录
		Login.main(args);
		Thread.sleep(1000);
		
		//首页
		Home.main(args);
		Thread.sleep(1000);
		
		//果园管理-果园列表
		Garden.main(args);
		Thread.sleep(1000);
		
		//果园管理-地块列表
		Massif.main(args);
		Thread.sleep(1000);
		
		webDriver.navigate().refresh();
		
		//农事活动-农事记录
		Farm.main(args);
		Thread.sleep(1000);
		
		//农事活动-种植记录
		Plant.main(args);
		Thread.sleep(1000);
		
		//农事活动-采摘记录
		Pick.main(args);
		Thread.sleep(1000);
	
		
		webDriver.navigate().refresh();
		
		//物联监控-监控管理
		Monitor.main(args);
		Thread.sleep(1000);
		
		//webDriver.navigate().refresh();
		
		//物联监控-监测站管理
		Station.main(args);
		Thread.sleep(1000);
		
		webDriver.navigate().refresh();
		
		//产品流通-入库管理
		Instock.main(args);
		Thread.sleep(1000);
		
		//webDriver.navigate().refresh();
		
		//产品流通-入库管理
		Outstock.main(args);
		Thread.sleep(1000);
		
		webDriver.navigate().refresh();
		
		//审核管理-精品二维码审核
		Qrcode.main(args);
		Thread.sleep(1000);
		
		//webDriver.navigate().refresh();
		
		//用户中心-用户管理
		User.main(args);
		Thread.sleep(1000);
		
		//用户中心-管理员管理
		Admin.main(args);
		Thread.sleep(1000);
		
		webDriver.navigate().refresh();
		
		//用户中心-反馈管理
		Feedback.main(args);
		Thread.sleep(1000);
		
		webDriver.navigate().refresh();
		
		//设置-指南维护
		Guide.main(args);
		Thread.sleep(1000);
		
		//设置-消息发布
		Message.main(args);
		Thread.sleep(1000);
		
		//设置-作物百科
		Wiki.main(args);
		Thread.sleep(1000);
		
		//设置-系统参数设置
		Systems.main(args);
		Thread.sleep(1000);
		
		//设置-标签参数设定
		Label.main(args);
		Thread.sleep(1000);
		
		//设置-系统作物管理
		Systemcrop.main(args);
		Thread.sleep(1000);
		
		//退出浏览器
		Thread.sleep(2000);
		webDriver.quit();
	}
}
