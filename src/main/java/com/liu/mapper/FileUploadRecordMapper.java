package com.liu.mapper;

import com.liu.entity.FileUploadRecord;

import java.util.List;

/**
 * <p>
 * 附件(文件)上传记录 Mapper 接口
 * </p>
 *
 * @author lyh
 * @since 2020-01-10
 */
public interface FileUploadRecordMapper {
	List<FileUploadRecord> getAlls();
}
