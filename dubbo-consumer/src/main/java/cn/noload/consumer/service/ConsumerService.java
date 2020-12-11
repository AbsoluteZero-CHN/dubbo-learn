package cn.noload.consumer.service;

import cn.noload.api.domain.DataResult;
import cn.noload.api.service.ProviderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author hao.caosh@ttpai.cn
 * @date 2020-12-11 13:55
 */
@Service
public class ConsumerService {

    @DubboReference
    private ProviderService providerService;

    public DataResult get() {
        return providerService.get();
    }
}
