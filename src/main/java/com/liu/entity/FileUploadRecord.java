package com.liu.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Objects;

/**
 * <p>
 * 附件(文件)上传记录
 * </p>
 *
 * @author lyh
 * @since 2020-01-10
 */
public class FileUploadRecord implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 文件编号
     */
    private Long id;

    /**
     * 文件名称
     */
    private String name;

    /**
     * 文件大小
     */
    private Long size;

    /**
     * 文件后缀名
     */
    private String suffix;

    /**
     * 文件访问的磁盘目录
     */
    private String fileUrl;

    /**
     * 是否有效(1=是;0=否)
     */
    private Byte isActive;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Byte getIsActive() {
        return isActive;
    }

    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileUploadRecord that = (FileUploadRecord) o;
        return id.equals(that.id) &&
                name.equals(that.name) &&
                size.equals(that.size) &&
                suffix.equals(that.suffix) &&
                fileUrl.equals(that.fileUrl) &&
                isActive.equals(that.isActive) &&
                createTime.equals(that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, size, suffix, fileUrl, isActive, createTime);
    }

    @Override
    public String toString() {
        return "FileUploadRecord{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", suffix='" + suffix + '\'' +
                ", fileUrl='" + fileUrl + '\'' +
                ", isActive=" + isActive +
                ", createTime=" + createTime +
                '}';
    }
}
