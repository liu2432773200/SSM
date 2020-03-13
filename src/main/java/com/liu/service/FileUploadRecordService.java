package com.liu.service;

import com.liu.entity.FileUploadRecord;

import java.util.List;

/**
 * <p>
 * 附件(文件)上传记录 服务类
 * </p>
 *
 * @author lyh
 * @since 2020-01-10
 */
public interface FileUploadRecordService {
	List<FileUploadRecord> list();
}
