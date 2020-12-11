package cn.noload.provider.service;

import cn.noload.api.domain.DataResult;
import cn.noload.api.service.ProviderService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author hao.caosh@ttpai.cn
 * @date 2020-12-11 11:50
 */
@DubboService
public class ProviderServiceImpl implements ProviderService {
    @Override
    public DataResult get() {
        return DataResult.success(null);
    }
}
