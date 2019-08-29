package com.rao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rao.tool.WebDriverTool;

public class Instock {
	public static void main(String[] args) throws Exception {
		WebDriver webdriver = WebDriverTool.webdriver;
		
		//进入产品流通-入库管理
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[5]/div")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[5]/ul/li")).click();
		
		//条件查询
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[type='text'][placeholder='果园名称']")).sendKeys("江西赣县龙潭山江口果园");
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("button[type='button'][class='el-button el-button--success']")).click();
		
		//刷新界面
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("i[class='el-icon-refresh']")).click();
		
		//详情
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div/div[3]/table/tbody/tr/td[8]/div/button")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div/button")).click();
		
	}
}
