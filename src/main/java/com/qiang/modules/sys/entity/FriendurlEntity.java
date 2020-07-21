package com.qiang.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "friendurl")
public class FriendurlEntity implements Serializable {
    private static final long serialVersionUID = -9163902960357555427L;

    @TableId
    private Long id;

    /**
     * 友链名
     */
    private String friendName;

    /**
     * 友链地址
     */
    private String friendUrl;

    /**
     * 创建时间
     */
    private String createTime;
}
