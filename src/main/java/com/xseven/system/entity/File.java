package com.xseven.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author xseven
 * @since 2021-01-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="File对象", description="")
public class File implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "资源类型，1：视频；2：文档；3：图片; 4：压缩包")
    private Integer type;

    @ApiModelProperty(value = "文件名称")
    @TableField("fileName")
    private String filename;

    @ApiModelProperty(value = "文件大小")
    @TableField("fileSize")
    private Integer filesize;

    @ApiModelProperty(value = "文件路径")
    @TableField("filePath")
    private String filepath;

    @ApiModelProperty(value = "0：无需转码 1：转码中 2：已转码 3：未上传完成 4：已上传完成 -1：转码失败")
    private String status;

    @ApiModelProperty(value = "创建时间")
    @TableField("createDate")
    private Date createdate;

    @ApiModelProperty(value = "是否删除：0未删除，1已删除")
    @TableField("isDeleted")
    private Integer isdeleted;

    @ApiModelProperty(value = "文件唯一标识(webupload文件md5唯一标识)")
    @TableField("fileMd5")
    private String filemd5;


}
