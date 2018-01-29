--配置hosts
127.0.0.1 slf.eureka.center
127.0.0.1 slf.eureka.center1
127.0.0.1 slf.eureka.center2
127.0.0.1 slf.eureka.center3

--启动集群服务注册应用
java -jar eureka-0.0.1.jar --spring.profiles.active=eureka1
java -jar eureka-0.0.1.jar --spring.profiles.active=eureka2
java -jar eureka-0.0.1.jar --spring.profiles.active=eureka3
--访问
http://slf.eureka.center1:9001/


--启动单台应用
java -jar eureka-0.0.1.jar

http://slf.eureka.center:9000/

E:\workspace\SpringCloud\dest



--健康监控访问
--显示一个auto-configuration的报告，该报告展示所有auto-configuration候选者及它们被应用或未被应用的原因
http://slf.eureka.center:9000/autoconfig

--显示一个应用中所有Spring Beans的完整列表
http://slf.eureka.center:9000/beans

--显示一个所有@ConfigurationProperties的整理列表
http://slf.eureka.center:9000/configprops

--执行一个线程转储
http://slf.eureka.center:9000/dump


--暴露来自Spring　ConfigurableEnvironment的属性
http://slf.eureka.center:9000/env

--展示应用的健康信息（当使用一个未认证连接访问时显示一个简单的’status’，使用认证连接访问则显示全部信息详情）
http://slf.eureka.center:9000/health

--显示任意的应用信息
http://slf.eureka.center:9000/info

--展示当前应用的’指标’信息
http://slf.eureka.center:9000/metrics

--显示一个所有@RequestMapping路径的整理列表
http://slf.eureka.center:9000/mappings

--允许应用以优雅的方式关闭（默认情况下不启用）
http://slf.eureka.center:9000/shutdown

--显示trace信息（默认为最新的一些HTTP请求）
http://slf.eureka.center:9000/trace

--查看日志
http://slf.eureka.center:9000/loggers




