<!DOCTYPE html>
<html lang="en">
<#include "../common/header.ftl">
<body>
<div id="wrapper" class="toggled">

    <#--边栏sidebar-->
    <#include "../common/nav.ftl">

    <#--主要内容content-->
    <div id="page-content-wrapper">
        <div class="container-fluid">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <table class="table table-bordered table-condensed">
                        <thead>
                        <tr>
                            <th>类目id</th>
                            <th>名字</th>
                            <th>type</th>
                            <th>创建时间</th>
                            <th>修改时间</th>
                            <th colspan="2">操作</th>
                        </tr>
                        </thead>
                        <tbody>

                        <#list productCategoryList as ProductCategory>
                        <tr>
                            <td>${ProductCategory.categoryId}</td>
                            <td>${ProductCategory.categoryName}</td>
                            <td>${ProductCategory.categoryType}</td>
                            <td>${ProductCategory.createTime}</td>
                            <th>${ProductCategory.updateTime}</th>
                            <td><a href="/sell/seller/category/index?categoryId=${ProductCategory.categoryId}">修改</a></td>
                        </tr>
                        </#list>
                        </tbody>
                    </table>
                </div>

            </div>
        </div>

        <div>
</div>

</body>
</html>