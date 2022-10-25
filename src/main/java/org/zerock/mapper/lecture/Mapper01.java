package org.zerock.mapper.lecture;

import org.apache.ibatis.annotations.Select;

public interface Mapper01 {

    @Select("SELECT NOW()")
    String getCurrentTime();

}
