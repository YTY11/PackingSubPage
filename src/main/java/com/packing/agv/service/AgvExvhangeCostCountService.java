package com.packing.agv.service;

import com.packing.agv.entity.AgvExvhangeCostCount;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @Description:
 * @create 2021-02-16 14:14
 */
public interface AgvExvhangeCostCountService {

    //白天
    public String getLdrtoagv08(String loader); //08:30~09:30
    public String getLdrtoagv09(String loader); //09:30~10:30
    public String getLdrtoagv10(String loader); //10:30~11:30
    public String getLdrtoagv11(String loader); //11:30~12:30
    public String getLdrtoagv12(String loader); //12:30~13:30
    public String getLdrtoagv13(String loader); //13:30~14:30
    public String getLdrtoagv14(String loader); //14:30~15:30
    public String getLdrtoagv15(String loader); //15:30~16:30
    public String getLdrtoagv16(String loader); //16:30~17:30
    public String getLdrtoagv17(String loader); //17:30~18:30
    public String getLdrtoagv18(String loader); //18:30~19:30
    public String getLdrtoagv19(String loader); //19:30~20:30

    //夜天
    String getWanLdrtoagv1(String loader);
    String getWanLdrtoagv2(String loader);
    String getWanLdrtoagv3(String loader);
    String getWanLdrtoagv4(String loader);
    String getWanLdrtoagv42(String loader);

    String getWanLdrtoagv5(String loader);
    String getWanLdrtoagv6(String loader);
    String getWanLdrtoagv7(String loader);
    String getWanLdrtoagv8(String loader);
    String getWanLdrtoagv9(String loader);
    String getWanLdrtoagv10(String loader);
    String getWanLdrtoagv11(String loader);
    String getWanLdrtoagv12(String loader);


    String getTime(); //獲取時間

    //获取达成前7天数据
    ArrayList<AgvExvhangeCostCount> getReachDataSeven(String loader,String sTime);

    //获取前七天日期
    ArrayList<String> getSevenDate();
}
