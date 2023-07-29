# 基于CentOS7的root权限下进行在线下载与离线安装

## 	root权限下，回到 /root目录下创建一个文件夹：

```bash
mkdir temp
```



## 一、安装Python3的依赖文件：

### 1.先查看python的安装位置

```bash
which python
```

>>/usr/bin/python

### 2.安装依赖包：

```bash
yum -y groupinstall "Development tools"

yum -y install zlib-devel bzip2-devel openssl-devel ncurses-devel sqlite-devel readline-devel tk-devel gdbm-devel db4-devel libpcap-devel xz-devel
```



## 二、下载Python3.9.9安装包

```bash
wget https://www.python.org/ftp/python/3.9.9/Python-3.9.9.tar.xz
```



### 1.新建Python3存放目录

```bash
mkdir /usr/local/python3
```



### 2.安装python3

```bash
 tar -xvJf Python-3.9.9.tar.xz
 
 cd Python-3.9.9
 
 ./configure --prefix=/usr/local/python3
 
 yum install libffi-devel -y
 
 ./configure --enable-optimizations
 
 make && make install
```



### 3.创建软链接

```bash
 ln -s /usr/local/python3/bin/python3 /usr/bin/python3
 
 ln -s /usr/local/python3/bin/pip3 /usr/bin/pip3
```



## 三、输入python3 -V 与 pip3 - V 测试