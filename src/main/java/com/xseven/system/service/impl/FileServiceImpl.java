package com.xseven.system.service.impl;

import com.xseven.system.entity.File;
import com.xseven.system.mapper.FileMapper;
import com.xseven.system.service.FileService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xseven
 * @since 2021-01-08
 */
@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, File> implements FileService {

}
