package com.zufang.lease.web.admin.custom.converter;

import com.zufang.lease.model.enums.ItemType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @Title: StringToItemTypeConverter
 * @Author 殇枫
 * @Package com.zufang.lease.web.admin.custom.converter
 * @Date 2025/7/27
 * @description:
 */
@Component
public class StringToItemTypeConverter implements Converter<String, ItemType> {
    @Override
    public ItemType convert(String code) {

        for (ItemType value : ItemType.values()) {
            if (value.getCode().equals(Integer.valueOf(code))) {
                return value;
            }
        }
        throw new IllegalArgumentException("code非法");
    }
}