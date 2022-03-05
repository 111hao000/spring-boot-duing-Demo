package com.duing.service;

import com.duing.mapper.GuestMapper;
import com.duing.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestMapper mapper;


    @Override
    public List<Guest> getGuests() {
        return mapper.getGuests();
//        return tkGuestMapper.selectAll();
    }

    @Override
    /**
     * cacheNames = "guests"
     * 执行缓存的名字
     * key = "#id"
     * 键值
     * condition = "#id>1"
     * 判断是否要进行缓存，当id>1时进行缓存
     */

    @Cacheable(cacheNames = "guests",key = "#id",condition = "#id>1")
    public Guest getGuestById(int id) {
        System.out.println("查询第"+id+"位嘉宾");
        return mapper.getGuestById(id);
    }

    /**
     * 设置key的值和cacheable保持一致
     * 方式一：拿到参数的id key = "#guest.id"
     * 方式二：拿到结果的id key = "#result.id"
     * @param guest
     * @return
     */
    @Override
    @CachePut(cacheNames = "guest",key = "#guest.id")
    public Guest updateGuest(Guest guest) {
        System.out.println("更新第"+guest.getId()+"位嘉宾");
        mapper.updateGuest(guest);
        return guest;
    }

    @CacheEvict(cacheNames = "guest",key = "#id")
    @Override
    public void deleteGuest(int id) {
        System.out.println("删除第"+id+"位嘉宾");
        mapper.deleteGuest(id);
    }
}
