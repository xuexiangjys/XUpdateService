# XUpdateService

使用Spring Boot简易搭建，Gradle构建，为XUpdate提供的更新服务。

## 内容

* 使用spring boot快速搭建，并使用Gradle进行构建【区别Maven】。

* 使用阿里的druid数据库连接池和tk.mybatis进行数据库的连接。

* 使用MySql作为数据库。

* 提供了应用版本后台管理所需的API服务，使用Html和ajax简单实现了应用版本管理界面。

* 使用了AOP对api请求进行动态日志记录。

* 实现通用的文件上传（包括多文件上传）和下载功能。

* 增加了请求流量以及请求权限的控制。

* 支持浏览器跨域请求。

## 搭建方法

1. clone项目到本地

```
git clone https://github.com/xuexiangjys/XUpdateService.git
```

2.使用IntelliJ IDEA 导入该项目。

3.进行本地数据库的配置。

因为使用的是MySql数据库，如果你电脑上没有安装MySql的话，请先[点击安装](https://www.mysql.com/)。你可以安装`MySQL Community Server`和`MySQL Workbench`,建议下载的MySql版本是5.7。

* MySql安装完成后，请执行根目录下`sql`文件夹下的脚本，创建数据库表和内容。

* 配置`src/main/resources/application.yml`文件，包括服务端口、数据库配置、mybatis配置、文件上传配置等。

* 如果你需要使用mybatis的自动生成代码脚本`generator`，请配置`src/main/resources/db-mysql.properties`文件，然后执行`./gradlew mybatisGenerate`或者在Gradle的Task列表中选择`mybatisGenerate`双击即可。

4.直接运行`XUpdateServiceApplication`即可运行服务。

5.在浏览器中输入`http://localhost:1111/`即可打开版本更新管理界面。

![](https://github.com/xuexiangjys/XUpdateService/blob/master/img/demo.png)

## 程序打包

1.执行`./gradlew bootRepackage`或点击Gradle任务栏点击`bootRepackage`，如下图：

![](https://github.com/xuexiangjys/XUpdateService/blob/master/img/1.png)

2.打包后的是jar文件，打包路径：`build/libs/` 下，如下图：

![](https://github.com/xuexiangjys/XUpdateService/blob/master/img/2.png)

3.最后执行jar包即可

```
java -jar build/libs/xxxxx.jar
```

## 版本更新管理后台

由于使用Java编写web管理后台不是很好看，因此我特地去学习了最近比较火的Vue.js编写了一个简洁优美的管理后台供大家参考。

项目地址: https://github.com/xuexiangjys/xupdate-management

### 项目预览

![](https://github.com/xuexiangjys/xupdate-management/blob/master/art/2.png)

----------------

## API构成

### 管理接口

#### 1、注册APK的版本信息

* 请求类型: post
* url : /update/addVersionInfo
* 参数 :

```
{
    "updateStatus":2,
    "modifyContent":"1、优化api接口。\r\n2、添加使用demo演示。\r\n3、新增自定义更新服务API接口。\r\n4、优化更新提示界面。",
    "appKey":"test",
    "versionName":"1.0.3",
    "versionCode":4
}
```

* 响应 :

```
{
    "Msg":"",
    "Code":0,
    "Data":{
        "versionId":12,
        "updateStatus":2,
        "modifyContent":"1、优化api接口。\r\n2、添加使用demo演示。\r\n3、新增自定义更新服务API接口。\r\n4、优化更新提示界面。",
        "appKey":"test",
        "versionName":"1.0.3",
        "versionCode":4
    }
}
```

#### 2、上传APK

* 请求类型: post【multipart/form-data】
* url : /update/uploadApk
* 参数 :

```
file=[文件]
versionId=12
```
* 响应 :

```
{
    "Code":0,
    "Msg":"",
    "Data":true
}
```

#### 3、添加版本信息

* 请求类型: post【multipart/form-data】
* url : /update/addAppVersion
* 参数 :

```
file=[文件]

appVersionInfo= {
    "updateStatus":2,
    "modifyContent":"1、优化api接口。\r\n2、添加使用demo演示。\r\n3、新增自定义更新服务API接口。\r\n4、优化更新提示界面。",
    "appKey":"test",
    "versionName":"1.0.3",
    "versionCode":4
}

```

* 响应 :

```
{
    "Code":0,
    "Msg":"",
    "Data":true
}
```

### 版本更新接口

#### 1、版本信息检查

* 请求类型: post
* url : /update/checkVersion
* 参数 :

```
versionCode=1,
appKey=com.xuexiang.xupdatedemo 
```

* 响应 :

```
{
    "Msg":"",
    "Code":0,
    "Data":{
        "apkMd5":"E4B79A36EFB9F17DF7E3BB161F9BCFD8",
        "versionId":11,
        "updateStatus":1,
        "downloadUrl":"xupdate_demo_1.0.2.apk",
        "modifyContent":"1、优化api接口。\r\n2、添加使用demo演示。\r\n3、新增自定义更新服务API接口。\r\n4、优化更新提示界面。",
        "appKey":"com.xuexiang.xupdatedemo",
        "apkSize":1649,
        "uploadTime":"2018-07-30 09:47:25",
        "versionName":"1.23.4",
        "versionCode":34
    }
}
```

#### 2、最新版本下载

* 请求类型: get
* url : /update/apk/{fileName:.+}
* 响应 : 文件流
