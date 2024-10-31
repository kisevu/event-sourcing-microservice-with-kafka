package com.ameda.kevin.works.repository;

import com.ameda.kevin.works.entity.OrderEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderEventRepository extends MongoRepository<OrderEvent,String> {
}
