package cn.noload.consumer.resources;

import cn.noload.api.domain.DataResult;
import cn.noload.consumer.service.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hao.caosh@ttpai.cn
 * @date 2020-12-11 14:16
 */
@RestController
@RequestMapping("/api/consumer")
public class ConsumerResource {

    private final ConsumerService consumerService;

    public ConsumerResource(
            ConsumerService consumerService) {
        this.consumerService = consumerService;
    }

    @GetMapping("/get")
    public DataResult get() {
        return consumerService.get();
    }
}
