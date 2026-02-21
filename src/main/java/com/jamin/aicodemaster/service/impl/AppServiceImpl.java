package com.jamin.aicodemaster.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.jamin.aicodemaster.model.entity.App;
import com.jamin.aicodemaster.mapper.AppMapper;
import com.jamin.aicodemaster.service.AppService;
import org.springframework.stereotype.Service;

/**
 * 应用 服务层实现。
 *
 * @author <a href="https://github.com/Jamin-cn">Jamin</a>
 */
@Service
public class AppServiceImpl extends ServiceImpl<AppMapper, App>  implements AppService{

}
