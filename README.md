## ys-sys-parent MAVEN 	脚手架

### api-client api	客户端模块
 	api调用模块

---

### api-server api	服务端模块
 	api服务模块
- [ ] 设计登录功能（相关数据表、权限及资源）
- [ ] 页面登录功能、全局Token认证
---

### common 	通用模块
 	通用编码、开发工具类模块
>此模块目前基本完全参考springside-utils,本来可直接引用即可
    springside github url:
    https://github.com/springside/springside4.git
---

### framework-core 	核心开发框架模块
	开发框架集成模块
- [x] 添加Spring4相关依赖
- [x] druid依赖、数据库驱动依赖（已注释）
- [x] 添加ORM(Hibernate和Mybatis)依赖（已注释）
- [x] 添加dubbo依赖（已注释）
- [x] 添加模板引擎依赖(目前暂定freemark，已注释)
- [x] 网页布局和修饰的框架(SiteMesh，未添加)
- [x] 添加Spring Security依赖（已注释）
- [x] 添加Spring 消息相关依赖（已注释）
- [ ] 集成Spring4
- [ ] 集成Log4j2
- [ ] 集成SpringMvc
- [ ] 添加数据源
- [ ] 集成ORM
- [ ] 集成Dubbo
- [ ] 集成Spring Security（配置密码加密MD5+Salt）
- [ ] 集成模板引擎
- [ ] 集成SiteMesh
- [ ] 集成前端框架
---


### webapp-back-*	web端后台模块
#### 	webapp-back-persistent  
	web端后台-持久化模块
#### 	webapp-back-service 
	web端后台-业务处理模块
#### 	webapp-back-web         
	web端后台-视图模块
- [ ] 后台系统管理-用户管理
- [ ] 后台系统管理-权限管理
- [ ] 后台系统管理-资源管理
---

### webapp-front-* 	web端前台模块
#### 	webapp-front-persistent 
	web端前台-持久化模块
#### 	webapp-front-service  
	web端前台-业务处理模块
#### 	webapp-front-web       
	web端前台-视图模块
	
---

### webapp-mobile-* 	web端移动端模块 
#### 	webapp-mobile-persistent 
	web移动端-持久化模块
#### 	webapp-mobile-service
	web移动端-业务处理模块
#### 	webapp-mobile-web        
	web移动端-视图模块