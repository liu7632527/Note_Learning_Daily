## 视窗相关

​	先安装视图

sudo apt-get install screen



screen -S xxx 建立一个新的视窗

screen -r xxx 打开已存在的视窗

Ctrl + A + D 离开视窗 (等同于exit)

直接选中重命名即可



## 位于安装包的位置的情况下安装deb包

sudo apt install -y xxx.deb
sudo dpkg -i xxx.deb



## 卸载的方法

sudo dpkg -r xxx



## 管理员打开文件管理器的方法

sudo nautilus



## 常用命令集：

su [Password]       进入管理员root指令模式
apt-get update 订阅源更新
apt-get upgrade 更新apt
apt-get install xxx 从订阅源处获取并安装xxx包
apt install xxx 同上
apt update



dpkg --list	显示所有所安装的软件



## 卸载软件：

apt-get remove --purge xxx  
apt-get autoremove --purge xxx



## 图形化界面

systemctl set - default multi-user.target #关闭图形界面
systemctl set - default graphical.target #打开图形界面
关闭：在图形界面下 终端输入 sudo service lightdm stop
开启：在命令行输入：sudo service lightdm start
