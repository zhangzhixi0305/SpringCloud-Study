package com.alibaba.cloud.sentinel.feign;


import feign.Contract;
import feign.MethodMetadata;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description 解决Sentinel和Feign的兼容性问题
 * @date 2023-05-06 13:14
 */
public class SentinelContractHolder implements Contract {
    public static final Map<String, MethodMetadata> METADATA_MAP = new HashMap();
    private final Contract delegate;

    public SentinelContractHolder(Contract delegate) {
        this.delegate = delegate;
    }

    @Override
    public List<MethodMetadata> parseAndValidatateMetadata(Class<?> targetType) {
        List<MethodMetadata> metadatas = this.delegate.parseAndValidatateMetadata(targetType);
        metadatas.forEach((metadata) -> {
            MethodMetadata var10000 = (MethodMetadata) METADATA_MAP.put(targetType.getName() + metadata.configKey(), metadata);
        });
        return metadatas;
    }
}