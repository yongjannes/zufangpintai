# zufangpintai

#### 介绍

租房平台是一个功能完善的房屋租赁管理系统，包含 **租客端（H5）** 和 **管理后台（Admin）** 两大模块：

- **租客端（H5）**：面向租房用户，提供房源搜索、预约看房、合同管理等功能，旨在为租客提供便捷的租房体验。
- **管理后台（Admin）**：面向平台管理员，提供房源管理、租约管理、用户管理等功能，方便管理员高效管理平台运营。

#### 软件架构

租房平台的技术架构如下：

- **前端技术栈**：
  - 构建工具：Vite，快速构建项目，提升开发效率。
  - 核心框架：Vue3 + TypeScript，现代前端开发的黄金组合，确保代码的可维护性和扩展性。
  - 状态管理：Pinia，轻量级的状态管理库，方便管理应用状态。
  - UI组件库：
    - **Admin**：Element Plus，功能丰富、美观的组件库，提升管理后台的用户体验。
    - **H5**：Vant 4，专为移动端设计的组件库，适配各类移动设备。
  - 路由管理：Vue Router 4，灵活的路由管理，支持嵌套路由和懒加载。
  - HTTP客户端：Axios，高效、简洁的HTTP请求库，便于与后端服务交互。

- **后端技术栈**：
  - 核心框架：Spring Boot 3.0，强大的微服务框架，简化开发流程。
  - Web框架：Spring MVC，成熟的Web开发框架，支持RESTful API开发。
  - ORM框架：Mybatis + Mybatis Plus，高效的数据库操作框架，简化SQL编写。
  - 短信服务：阿里云短信服务，提供稳定、可靠的短信发送功能。
  - 认证授权：JWT（JSON Web Token），安全、高效的用户认证机制。

- **数据存储**：
  - 关系型数据库：MySQL 8.0，稳定、高效的数据库系统，支持复杂查询。
  - 缓存服务：Redis 7.0，高性能的缓存服务，提升系统响应速度。
  - 文件存储：MinIO（兼容S3协议的对象存储），安全、可靠的文件存储解决方案。

#### 安装教程

1. **克隆项目仓库**

   ```bash
   git clone https://gitee.com/yongjannes/zufangpintai.git
   cd zufangpintai
   ```

2. **后端服务部署**

   - **数据库初始化**

     ```sql
     -- 创建数据库
     CREATE DATABASE lease CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
     
     -- 导入SQL文件
     USE lease;
     SOURCE /path/to/lease/SQL/lease.sql;
     ```

   - **启动后端服务**

     - 使用IntelliJ IDEA导入后端项目：
       - 选择`lease/pom.xml`作为项目文件。
       - 等待Maven依赖下载完成。
     - 修改配置文件：
       - 配置`application.yml`中的数据库、Redis、MinIO连接信息。
       - 配置阿里云短信服务的accessKey和secretKey。
     - 启动服务：
       - 管理后台API服务：运行`web-admin`模块下的`AdminWebApplication`。
       - 租客端API服务：运行`web-app`模块下的`AppWebApplication`。

3. **前端项目部署**

   - **管理后台（rentHouseAdmin）**

     1. 进入项目目录：

        ```bash
        cd lease/rentHouseAdmin
        ```

     2. 安装依赖：

        ```bash
        npm install
        ```

     3. **配置环境变量**：修改项目根目录下的`.env.development`的文件：

        ```
        VITE_APP_BASE_URL=你的后端API地址
        ```

     4. 启动开发服务器：

        ```bash
        npm run dev
        ```

   - **租客端H5（rentHouseH5）**

     1. 进入项目目录：

        ```bash
        cd lease/rentHouseH5
        ```

     2. 安装依赖：

        ```bash
        npm install
        ```

     3. **配置环境变量**：修改项目根目录下的`.env.development`的文件：

        ```
        VITE_APP_BASE_URL=你的后端API地址
        ```

     4. 启动开发服务器：

        ```bash
        npm run dev
        ```

4. **访问系统**

   - **管理后台**：`http://localhost:4173`
   - **租客端H5**：`http://localhost:4173`
   - **API文档**：
     - 管理后台：`http://localhost:8080/doc.html`
     - 租客端：`http://localhost:8888/doc.html`

#### 使用说明

1. **租客端（H5）**
   - 用户可以通过首页的搜索功能查找房源。
   - 点击房源详情，可以查看房源的具体信息，并预约看房。
   - 用户可以在个人中心管理自己的预约记录和合同信息。

2. **管理后台（Admin）**
   - 管理员可以通过管理后台添加、编辑和删除房源信息。
   - 管理员可以管理租约信息，包括签订、续租和终止租约。
   - 管理员可以管理用户信息，包括用户权限和用户状态。

