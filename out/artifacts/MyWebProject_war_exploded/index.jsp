<%--
  Created by IntelliJ IDEA.
  User: huangzhangyan
  Date: 2021/10/8
  Time: 23:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <style   >
        .login {
            position: absolute;
            left: 63%;
            top: 30%;
        }

        .body{
            background-image: url(img/img2.jpg);
            background-size: auto auto;
            background-repeat: no-repeat;
        }

    </style>
</head>
<body  style="background-image: url(img/img2.jpg); background-size: auto auto ;background-repeat: no-repeat">
<form action="login" method="post" class="login">
    <h2 style="text-align: center">
        欢迎登录
    </h2>
    <table>
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>密 码:</td>
            <td><input type="text" name="password"/></td>
        </tr>
        <tr>
            <td>性 别:</td>
            <td><input type="radio" name="sex" value="male"/>男
                <input type="radio" name="sex" value="female"/>女
            </td>
        </tr>
        <tr>
            <td>出生日期:</td>
            <td>
                <select name="year">
                    <option value="">1</option>
                    <option value="">2</option>
                    <option value="">3</option>
                    <option value="">4</option>
                    <option value="">5</option>
                </select>

                <select name="month">
                    <option value="">1</option>
                    <option value="">2</option>
                    <option value="">3</option>
                    <option value="">4</option>
                    <option value="">5</option>
                </select>

                <select name="day">
                    <option value="">1</option>
                    <option value="">2</option>
                    <option value="">3</option>
                    <option value="">4</option>
                    <option value="">5</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>家庭住址:</td>
            <td><input type="text" name="password"/></td>
        </tr>
        <tr>
            <td>个人简介:</td>
            <td><input type="text" name="password"/></td>
        </tr>
        <tr>
            <td></td>
            <td style="color: red;text-align: right">
                <%
                    String loginMsg = (String) request.getAttribute("LoginMsg");
                    if (loginMsg != null) {
                        out.print(loginMsg);
                    }
                %>
            </td>
        </tr>
        <tr>
            <td align="left">
                <a href="registerform">用户注册</a>
            </td>
            <td align="right"><input type="submit" value="登录"></td>
        </tr>

    </table>
</form>
</body>
</html>
