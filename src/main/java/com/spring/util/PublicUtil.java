package com.spring.util;


public class PublicUtil {

	  //取得内存使用情况
    public static String getMemoryStatus() {
        StringBuffer sb = new StringBuffer();
        sb.append("\njvm内存使用情况\n最大可用内存:");
        sb.append(Runtime.getRuntime().maxMemory());
        sb.append("\n当前JVM空闲内存:");
        sb.append(Runtime.getRuntime().freeMemory());
        sb.append("\n当前JVM占用的内存总数:");
        sb.append(Runtime.getRuntime().totalMemory());
        sb.append("\n内存使用率:");
        long nMemRate = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) * 100 / Runtime.getRuntime().maxMemory();
        sb.append(nMemRate);
        sb.append("%");
        //JVM内存占用超过90%则进行邮件告警
        if (nMemRate > 90) {
//            EmailPara.listEmail
//                    .add(new SimpleTextEmail(PubConf.astrSystemMangaerRecipient, "备案系统DataServiceJVM告警", "备案系统DataService：" + sb.toString()));      
        	}
        return sb.toString();
    
    }
}
