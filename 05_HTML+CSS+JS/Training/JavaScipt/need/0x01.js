alert("努力，奋斗")

let goods,num,price,total,address,Date
goods=prompt("请输入商品名称")
num=prompt("请输入商品的数量")
price=prompt("请输入商品的价格")
address=prompt("请输入商品的进货地点")
Date=prompt("购买日期")
total=num*price

document.write(`
    <h1 align= "center" >努力，奋斗</h1>
    <hr color = "aqua" width = "800px">
    <table border='1' cellspacing='0' align='center' width='800' height='100' color='pink'>
     <tr>
            <th>商品名称</th>
            <th>价格</th>
            <th>数量</th>
            <th>总价</th>
            <th>进货地址</th>
            <th>进货日期</th>
        </tr>
        <tr>
            <th>${goods}</th>
            <th>${price}</th>
            <th>${num}</th>
            <th>${total}</th>
            <th>${address}</th>
            <th>${Date}</th>
        </tr>
    </table>
`)