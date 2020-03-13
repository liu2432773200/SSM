package com.liu.service.impl;

import com.liu.entity.FileUploadRecord;
import com.liu.mapper.FileUploadRecordMapper;
import com.liu.service.FileUploadRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 附件(文件)上传记录 服务实现类
 * </p>
 *
 * @author lyh
 * @since 2020-01-10
 */
@Service
public class FileUploadRecordServiceImpl implements FileUploadRecordService {
	@Autowired
	private FileUploadRecordMapper fileUploadRecordMapper;

	@Override
	public List<FileUploadRecord> list() {
		return fileUploadRecordMapper.getAlls();
	}
}
