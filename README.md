Java IDEA Dcevm Hot Reloading Demo
==================================

按[hotswap-agent-intellij-plugin](https://github.com/dmitry-zhuravlev/hotswap-agent-intellij-plugin)这个插件的说明，
安装好DCEVM，再安装好这个插件，即可。

注意：

1. 运行一个Java类时，必须使用debug模式才有效（`ctrl + shift + F9`）；如果是正常模式（`ctrl + shift + F10`），则无效。
2. 修改代码后，并不会直接生效（因为idea并没有主动编译它），需要按`cmd + shift + F9`即重新编译该文件之后，才会生效

这对于启动比较慢的程序比较有用。