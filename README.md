一个代码生成神器，用它我们可以通过数据库表，直接生成controller、service、mapper、entity、sql等代码。

我们在日常开发中，把数据库表设计好了之后，然后通过该工具，能够快速生成一个可以直接运行的CRUD代码。

毫不夸张的说，如果在项目中使用它，可以让你的开发效率快速提升，我们真的可以少写很多单调并且重复的代码。

JDK版本：1.8

1.在application-dev.properties文件中配置数据库信息：

2.运行Application类启动项目。

3.项目启动之后，访问swagger地址：
http://localhost:8000/swagger-ui.html#/tool/genCodeUsingGET

author：需要生成的代码作者。
dataBaseName：数据库名称。
packageName：包目录
tableName：表名称。
点击Execute按钮，即可生成代码。

点击Download file按钮，即可下载生成的代码。
