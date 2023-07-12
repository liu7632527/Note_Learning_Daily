let price=0,num=0,total=0,adress
price=prompt('请输入商品的价格：')
num=prompt('请输入商品的数量：')
address=prompt('请输入收货地址：')
total=price * num

document.write(`
<table border='1' cellspacing='0' align='center' width='800' height='100' color='pink'>
    <tr>
        <th>商品名称</th>
        <th>商品价格</th>
        <th>商品数量</th>
        <th>总价</th>
        <th>收货地址</th>
    </tr>        
    <tr> 
    <th>小米手机青春PLUS</th>
    <th>${price}元</th>
    <th>${num}</th>
    <th>${total}元</th>
    <th>${address}</th>
    </tr>
</table>
`)