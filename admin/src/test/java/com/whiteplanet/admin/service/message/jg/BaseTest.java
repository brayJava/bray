package com.whiteplanet.admin.service.message.jg;

import com.whiteplanet.push.jg.JPushClient;
import org.junit.Before;

public abstract class BaseTest {

	protected static final String APP_KEY = "ea4be1f894593719715b8776";
    protected static final String MASTER_SECRET = "9cdd805a09a17d487ac93fa9";
    protected static final String GROUP_MASTER_SECRET = "b11314807507e2bcfdeebe2e";
    protected static final String GROUP_PUSH_KEY = "2c88a01e073a0fe4fc7b167c";

    public static final String ALERT = "您收到一条新通知，请点击查看"; //在手机上侧显示通知
    public static final String MSG_CONTENT = "您收到一条新通知，请点击查看"; //将内容推给用户设备
    public static final String MSG_CONTENT_JSON = "{\n" +
            "    \"country\": \"中国\",\n" +
            "    \"address\": \"徐汇区枫林路180号\",\n" +
            "    \"province\": \"上海\",\n" +
            "    \"city\": \"上海\",\n" +
            "    \"name\": \"复旦大学附属中山医院\",\n" +
            "    \"id\": \"e377fc82571711e7a662409d54cc04ae\"\n" +
            "  }"; //将json内容推给用户设备
    public static final String MSG_CONTENT_JSON_IM = "{\n" +
            "    \"content\":\"3\",\n" +
            "    \"headImg\":\"54fbf6889fe449f1a8e86affe505cc08\",\n" +
            "    \"introInfo\":\"主任医师\",\n" +
            "    \"msgCount\":1,\n" +
            "    \"sendTime\":1513922105000,\n" +
            "    \"senderId\":\"d01ed82d91204f438ce4f34b916a8e5a\",\n" +
            "    \"senderName\":\"weq\",\n" +
            "    \"type\":1\n" +
            "  }"; //将json内容推给用户设备
//    public static final String JSON_TEST = JSON
    public static final String REGISTRATION_ID1 = "0900e8d85ef";
    public static final String REGISTRATION_ID2 = "0a04ad7d8b4";
    public static final String REGISTRATION_ID3 = "18071adc030dcba91c0";

    
    protected JPushClient jpushClient = null;
    
    @Before
    public void before() {
        jpushClient = new JPushClient(MASTER_SECRET, APP_KEY);
        
    }

}
