package com.packing.agv.mapper;


import org.apache.ibatis.annotations.Param;

import java.sql.Date;

public interface AgvExvhangeCostCountMapper {
     String getLdrtoagv08(@Param("loader") String loader); //08:30~09:30
     String getLdrtoagv09(@Param("loader") String loader); //09:30~10:30
     String getLdrtoagv10(@Param("loader") String loader); //10:30~11:30
     String getLdrtoagv11(@Param("loader") String loader); //11:30~12:30
     String getLdrtoagv12(@Param("loader") String loader); //12:30~13:30
     String getLdrtoagv13(@Param("loader") String loader); //13:30~14:30
     String getLdrtoagv14(@Param("loader") String loader); //14:30~15:30
     String getLdrtoagv15(@Param("loader") String loader); //15:30~16:30
     String getLdrtoagv16(@Param("loader") String loader); //16:30~17:30
     String getLdrtoagv17(@Param("loader") String loader); //17:30~18:30
     String getLdrtoagv18(@Param("loader") String loader); //18:30~19:30
     String getLdrtoagv19(@Param("loader") String loader); //19:30~20:30
     String getTime(); //獲取時間
}