/**
 * @program school-bus
 * @description: OrderConvertver
 * @author: mf
 * @create: 2020/03/04 21:50
 */
package com.stylefeng.guns.rest.modular.order.converter;

import com.stylefeng.guns.rest.common.convert.DateMapper;
import com.stylefeng.guns.rest.common.persistence.model.Order;
import com.stylefeng.guns.rest.order.dto.OrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = DateMapper.class)
public interface OrderConvertver {

    @Mappings({})
    List<OrderDto> order2Res(List<Order> orders);
}