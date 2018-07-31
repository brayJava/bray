package com.whiteplanet.admin.domain.aop;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

import java.time.Clock;
/**
 * @description: 日志管理
 * @author wuzhiyuan
 * @date 2017年12月7日  上午11:34:57
 * @version 1.0
 */
@Aspect
@Service
public class LoggerAdvice {
	
	private Logger logger = Logger.getLogger(this.getClass());

	private long startTime = 0L;

	private long endTime = 0L;

	private static final String USER_LIST = "userList";

	private static final String FEED_LIST = "feedList";

	@Before("within(com.whiteplanet.admin.controller..*) && @annotation(loggerManage)")
	public void addBeforeLogger(JoinPoint joinPoint, LoggerManage loggerManage) {
		if(USER_LIST.equals(loggerManage.serviceType())
				|| FEED_LIST.equals(loggerManage.serviceType()))
			startTime = Clock.systemDefaultZone().millis();
		logger.info("执行 " + loggerManage.description() + " 开始");
		logger.info(joinPoint.getSignature().toString());
		logger.info(parseParames(joinPoint.getArgs()));
	}
	
	@AfterReturning("within(com.whiteplanet.admin.controller..*) && @annotation(loggerManage)")
	public void addAfterReturningLogger(JoinPoint joinPoint, LoggerManage loggerManage) {
		logger.info("执行 " + loggerManage.description() + " 结束");
		if(USER_LIST.equals(loggerManage.serviceType())
				|| FEED_LIST.equals(loggerManage.serviceType())) {
			endTime = Clock.systemDefaultZone().millis();
			logger.info(loggerManage.description()+"所用时间："+(endTime - startTime)+"ms");
		}
	}
	
	@AfterThrowing(pointcut = "within(com.whiteplanet.admin.controller..*) && @annotation(loggerManage)", throwing = "ex")
	public void addAfterThrowingLogger(JoinPoint joinPoint, LoggerManage loggerManage, Exception ex) {
		logger.error("执行 " + loggerManage.description() + " 异常", ex);
	}

	private String parseParames(Object[] parames) {
		if (null == parames || parames.length <= 0) {
			return "";
		}
		StringBuffer param = new StringBuffer("传入参数[{}] ");
		for (Object obj : parames) {
			param.append(ToStringBuilder.reflectionToString(obj)).append("  ");
		}
		return param.toString();
	}
	
}
