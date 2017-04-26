<html>
<%--更改jsp文件的字符集--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 引入JQuery -->
<script type="text/javascript"
        src="resources/jquery-easyui-1.5.2/jquery.min.js"></script>
<!-- 引入EasyUI -->
<script type="text/javascript"
        src="resources/jquery-easyui-1.5.2/jquery.easyui.min.js"></script>
<!-- 引入EasyUI的中文国际化js，让EasyUI支持中文 -->
<script type="text/javascript"
        src="resources/jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js"></script>
<!-- 引入EasyUI的样式文件-->
<link rel="stylesheet" href="resources/jquery-easyui-1.5.2/themes/default/easyui.css"
      type="text/css"/>
<!-- 引入EasyUI的图标样式文件-->
<link rel="stylesheet" href="resources/jquery-easyui-1.5.2/themes/icon.css"
      type="text/css"/>
<body>
<table id="readLog" title="阅读记录" class="easyui-datagrid" style="width:400px;height:200px"
       toolbar="#toolbar"
       rownumbers="true" fitColumns="true" singleSelect="true">
    <thead>
    <tr>
        <th field="name" width="100">姓名</th>
        <th field="class" width="100">班级</th>
        <th field="books" width="100">阅读刊物</th>
    </tr>
    </thead>
</table>
<div id="toolbar">
    <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="addLog()">Add</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editLog()">Edit</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="deleteLog()">Delete</a>
</div>
</body>
</html>
<script>
    $(function () {
        var info = [
            {"name": "1", "class": 312, "books": "abc"},
            {"name": "w", "class": 123, "books": "abcdd"},
            {"name": "2", "class": 223, "books": "abcsds"},
        ];
        $('#readLog').datagrid({
            data: info
        });
    });
    function addLog() {

    }
    function deleteLog() {

    }
    function editLog() {

    }
</script>
