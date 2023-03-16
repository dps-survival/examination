package com.examination.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.examination.sys.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 奕阳
 * @since 2023-03-15 11:55:14
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
