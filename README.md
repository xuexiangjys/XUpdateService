# XUpdateService

使用Spring Boot简易搭建，Gradle构建，为XUpdate提供的更新服务。

## 内容

* 使用spring boot快速搭建，并使用Gradle进行构建【区别Maven】。

* 使用阿里的druid数据库连接池和tk.mybatis进行数据库的连接。

* 使用MySql作为数据库。

* 使用Html和ajax简单实现了应用版本管理界面。

* 使用了AOP对api请求进行动态日志记录。

* 实现通用的文件上传（包括多文件上传）和下载功能。

## 搭建方法

1. clone项目到本地

```
git clone https://github.com/xuexiangjys/XUpdateService.git
```

2.使用IntelliJ IDEA 导入该项目。

3.进行本地数据库的配置。

因为使用的是MySql数据库，如果你电脑上没有安装MySql的话，请先[点击安装](https://www.mysql.com/)。

* MySql安装完成后，请执行根目录下`sql`文件夹下的脚本，创建数据库表和内容。

* 配置`src/main/resources/application.yml`文件，包括服务端口、数据库配置、mybatis配置、文件上传配置等。

* 如果你需要使用mybatis的自动生成代码脚本`generator`，请配置`src/main/resources/db-mysql.properties`文件，然后执行`./gradlew mybatisGenerate`或者在Gradle的Task列表中选择`mybatisGenerate`双击即可。

4.直接运行`XHttpApiApplication`即可运行服务。

5.在浏览器中输入`http://localhost:1111/`即可打开版本更新管理界面。

![](https://github.com/xuexiangjys/XUpdateService/blob/master/img/demo.png)

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

* 请求类型: post
* url : /update/checkVersion
* 参数 :

```

```

* 响应 :

```
```