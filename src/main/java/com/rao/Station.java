package com.rao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rao.tool.WebDriverTool;

public class Station {
	public static void main(String[] args) throws Exception {
		WebDriver webdriver = WebDriverTool.webdriver;
		
		//进入物联监控-监测站界面
//		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[4]/div")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[4]/ul/li[2]")).click();
		
		//条件查询
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[type='text'][placeholder='选择监测站类型']")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[1]")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[type='text'][placeholder='设备序列号']")).sendKeys("W867012033435501");
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("button[type='button'][class='el-button el-button--success']")).click();
		
		//刷新界面
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("i[class='el-icon-refresh']")).click();
				
		//添加
/*		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("button[type='button'][class='el-button add el-button--success is-plain']")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[type='text'][placeholder='选择果园名称']")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[7]")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[type='text'][placeholder='选择设备类型']")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[4]/div/div/ul/li[1]")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[type='text'][placeholder='请输入监测站名称']")).sendKeys("Fm1监测站1");
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[type='text'][placeholder='请输入监测站序列号']")).sendKeys("W867012033408110");
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[type='text'][placeholder='是否开发查询']")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[5]/div/div/ul/li[1]")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[type='text'][placeholder='请输入详细地址']")).sendKeys("2号路");
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("div[class='vue-google-map map']")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("button[class='el-button el-button--primary']")).click();*/
		
		//详情
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div/div[3]/table/tbody/tr/td[7]/div/button[1]")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[4]/div/div/button")).click();
		Thread.sleep(1000);
		
		//删除
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div/div[3]/table/tbody/tr/td[7]/div/button[2]")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
/*		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[2]")).click();*/
		
	}
}
