package com.pubsub.redis.pubsubmessage.constant;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/10/15
 * @Description: 网关枚举类
 **/
public enum RouteEnum {
    /**
     * 路由枚举
     */
    ROUTE_LIST("route.list", "route_update_topic"),
    ROUTE_UPDATE("route.list", "route_update_topic"),
    ROUTE_DELETE("route.list", "route_delete_topic"),
    ROUTE_SAVE("route.list", "route_save_topic");

    @Getter
    @Setter
    private String key;

    @Getter
    @Setter
    private String topic;

    RouteEnum(String key, String topic) {
        this.key = key;
        this.topic = topic;
    }

    public static RouteEnum get(String key) {
        for (RouteEnum c : RouteEnum.values()) {
            if (c.key == key) {
                return c;
            }
        }
        return null;
    }
}
