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
    String getWanLdrtoagv1(String loader); //07:30~08:30
    String getWanLdrtoagv2(String loader); //06:30~07:30
    String getWanLdrtoagv3(String loader); //05:30~06:30
    String getWanLdrtoagv4(String loader); //04:30~05:30
    String getWanLdrtoagv5(String loader); //03:30~04:30
    String getWanLdrtoagv6(String loader); //02:30~03:30
    String getWanLdrtoagv7(String loader); //01:30~02:30
    String getWanLdrtoagv8(String loader); //00:30~01:30
    String getWanLdrtoagv9(String loader); //23:30~00:30
    String getWanLdrtoagv10(String loader); //22:30~23:30
    String getWanLdrtoagv11(String loader); //21:30~22:30
    String getWanLdrtoagv12(String loader); //20:30~21:30


    String getTime(); //獲取時間

    //获取达成前7天数据
    ArrayList<AgvExvhangeCostCount> getReachDataSeven(String loader,String sTime);

    //获取前七天日期
    ArrayList<String> getSevenDate();
}
