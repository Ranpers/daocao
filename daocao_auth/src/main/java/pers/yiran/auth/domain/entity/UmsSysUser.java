package pers.yiran.auth.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("ums_sys_user")
public class UmsSysUser implements Serializable {
    @TableId
    private Long id;
    private String username;
    private String nickname;
    private String email;
    private String mobile;
    private Integer sex ;
    private String avatar;
    private String password;
    private Integer status;
    private String creator;
    private String updater;
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
    private String remark;
    //逻辑删除 MyBatis-Plus默认 0 未删除 1 已删除
    @TableLogic
    private Integer deleted;
}