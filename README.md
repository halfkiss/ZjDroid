ZjDroid
=======

Android app dynamic reverse tool based on Xposed framework.


一、ZjDroid工具介绍

ZjDroid是基于Xposed Framewrok的动态逆向分析模块，逆向分析者可以通过ZjDroid完成以下工作：
1、DEX文件的内存dump
2、基于Dalvik关键指针的内存BackSmali，有效破解主流加固方案
3、敏感API的动态监控
4、指定内存区域数据dump
5、获取应用加载DEX信息。
6、获取指定DEX文件加载类信息。
7、dump Dalvik java堆信息。
8、在目标进程动态运行lua脚本。


二、ZjDroid相关命令

1、获取APK当前加载DEX文件信息：
adb shell am broadcast -a com.zjdroid.invoke --ei target pid --es cmd '{"action":"dump_dexinfo"}'

2、获取指定DEX文件包含可加载类名：
adb shell am broadcast -a com.zjdroid.invoke --ei target pid --es cmd '{"action":"dump_class","dexpath":"*****"}'

4、根据Dalvik相关内存指针动态反编译指定DEX，并以文件形式保存。
adb shell am broadcast -a com.zjdroid.invoke --ei target pid --es cmd '{"action":"backsmali","dexpath":"*****"}'

该方式可以脱壳目前大部分流行的加固防护。(由于手机性能问题，运行较忙)
例外情况：
由于ApkProtect特定防修改检测，需要做如下修改即可解固该保护：
（1）在设备上创建特定目录（如/data/local）并 chmod 为777
（2）复制zjdroid.apk到该目录，并修改文件名为zjdroid.jar
 (3) 修改/data/data/de.robv.android.xposed.installer/conf/modules.list 模块代码文件修改为"zjdroid.jar"
从启设备即可。

5、Dump指定DEX内存中的数据并保存到文件（数据为odex格式，可在pc上反编译）。
adb shell am broadcast -a com.zjdroid.invoke --ei target pid --es cmd '{"action":"dump_dex","dexpath":"*****"}'


6、Dump指定内存空间区域数据到文件
adb shell am broadcast -a com.zjdroid.invoke --ei target pid --es cmd '{"action":"dump_mem","start":1234567,"length":123}'

7、Dump Dalvik堆栈信息到文件，文件可以通过java heap分析工具分析处理。
adb shell am broadcast -a com.zjdroid.invoke --ei target pid --es cmd '{"action":"dump_heap"}'

8、运行时动态调用Lua脚本
该功能可以通过Lua脚本动态调用java代码。
使用场景：
可以动态调用解密函数，完成解密。
可以动态触发特定逻辑。
adb shell am broadcast -a com.zjdroid.invoke --ei target pid --es cmd '{"action":"invoke","filepath":"****"}'

luajava相关使用方法：
http://www.keplerproject.org/luajava/

8、敏感API调用监控


三、相关命令执行结果查看：

1、命令执行结果：
adb shell logcat -s zjdroid-shell-{package name}

2、敏感API调用监控输出结果：
adb shell logcat -s zjdroid-apimonitor-{package name}
