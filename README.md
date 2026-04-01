# 外卖订餐系统后端

Spring Boot + JPA + JWT 实现的外卖后端，包含用户、菜品、订单管理。

## 技术栈
Spring Boot 2.7 · JPA · MySQL · JWT · BCrypt



## 遇到的坑
- Java 8 不支持 `Map.of()` → 改用 `HashMap`
- 实体类 getter 冲突 → 删除重复方法
- 接口 404 → 检查包扫描



