package com.tea.user.app.main;

import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tea.common.base.constant.ProjectName;
import com.tea.common.spring.dubbo.DubboApp;

public class Main extends DubboApp {

	public Main(String zkUrl, String zkPath, String appName, String appId, String packageName) {
		super(zkUrl, zkPath, appName, appId, packageName);
	}

	private static final String AppID = ProjectName.UserApp.getAppId();
	private static final String AppName = ProjectName.UserApp.getAppName();
	private static final String PackageName = ProjectName.UserApp.getPackageName();

	static Log log = LogFactory.getLog(Main.class);

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));

		String zkaddr = "192.168.1.103:2181";
		String configPath = "/AppConfig/tea";

		if (args.length < 2) {
			log.warn("arg not set using debug setting....");
		} else {
			zkaddr = args[0];
			configPath = args[1];
		}
		// SpringConfigurerEx.SchedulerPoolSize = 4;
		// SpringConfigurerEx.ExecutorPoolSize = 4;
		// 这里开始初始化
		Main main = new Main(zkaddr, configPath, AppName, AppID, PackageName);
		main.startApp();
	}
}
