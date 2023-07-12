# Java概述

## 1.背景介绍

​	计算机语言：人与计算机之间进行信息交流沟通的一种特殊语言

​	Java语言是美国Sun公司（Stanford University Network）在1995年推出的计算机语言

​	Java之父：詹姆斯·高斯林（James Gosling）

​	2009年，Sun公司被[甲骨文公司 ](https://www.oracle.com) 收购

​	java语言的三个版本：

- JavaSE: Java 语言的（标准版），用于桌面应用的开发，是其他两个版本的基础
- JavaME: Java 语言的（小型版），用于嵌入式消费类电子设备

- JavaEE: Java 语言的（企业版），用于 Web 方向的网站开发



## 2.跨平台原理

​	Java程序并非是直接运行的，Java编译器将Java源程序编译成与平台无关的字节码文件(class文件)，然后由Java虚拟机（JVM）对字节码文件解释执行。所以在不同的操作系统下，只需安装不同的Java虚拟机即可实现java程序的跨平台。

![image-20230710093502175](../main/Doc_images/image-20230710093502175.png)



## 3.JRE、JDK、JVM

- JVM（Java Virtual Machine），Java虚拟机
- JRE（Java Runtime Environment），Java运行环境，包含了JVM和Java的核心类库（Java API）
- JDK（Java Development Kit）称为Java开发工具，包含了JRE和开发工具

​	总结：我们只需安装JDK即可，它包含了java的运行环境和虚拟机。

![image-20230710093740268](../main/Doc_images/image-20230710093740268.png)



## 4.下载和安装

[Java JDK 17][https://www.oracle.com/java/technologies/downloads/]

需要配置环境变量

注意：安装路径不要包含中文或者空格等特殊字符（使用纯英文目录）。



环境变量—系统变量—添加与Java有关的变量



## 5.Java程序开发运行流程

​	开发Java程序，需要三个步骤：

1. 编写程序
2. 编译程序
3. 运行程序



### 1.HelloWorld案例

​	HelloWorld案例是指在计算机屏幕上输出“HelloWorld”这行文字。

​	各种计算机语言都习惯使用该案例作为第一个演示案例。

```java
public class HelloWorld {  
  public static void main(String[] args) {   
    System.out.println("HelloWorld");
    }
}
```

![image-20230710094401092](../main/Doc_images/image-20230710094401092.png)



### 2.HelloWorld案例的编译和运行

​	编译：javac 文件名.java

​	范例：javac HelloWorld.java



​	执行：java 类名

​	范例：java HelloWorld



[java “错误：编码GBK 的不可映射字符”](https://blog.csdn.net/Ginny97/article/details/117220201)



## 6.BUG

在电脑系统或程序中，隐藏着的一些未被发现的缺陷或问题统称为bug（漏洞）。



### 	1.**HelloWorld案例常见问题**

1、非法字符问题。Java中的符号都是英文格式的。

2、大小写问题。Java语言对大小写敏感（区分大小写）。

3、在系统中显示文件的扩展名，避免出现HelloWorld.java.txt文件。

4、编译命令后的java文件名需要带文件后缀.java

5、运行命令后的class文件名（类名）不带文件后缀



## 7.Notepad++

​	Notepad++功能比windows中的自带记事本功能强大，除了可以用来制作一般的纯文字说明文件，也十分适合编写计算机程序代码。Notepad++有行号，能够快速定位问题位置，还有语法高亮度显示、代码折叠等功能。而且它是免费的。(也可以考虑 VScode )



## 8.安装Idea

​	IDEA 全称 IntelliJ IDEA，是java编程语言开发的集成环境。IntelliJ在业界被公认为最好的java开发工具，尤其在智能代码助手、代码自动提示、重构、JavaEE支持、各类版本工具(git、svn等)、JUnit、CVS整合、代码分析、 创新的GUI设计等方面的功能可以说是超常的。IDEA是JetBrains公司的产品，这家公司总部位于捷克共和国的首都布拉格，开发人员以严谨著称的东欧程序员为主。它的旗舰版本还支持HTML，CSS，PHP，MySQL，Python等。免费版只支持Java,Kotlin等少数语言。

https://blog.csdn.net/qq_42257666/article/details/112923856

