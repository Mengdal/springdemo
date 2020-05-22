
第一个FreeMaker模板页面 by <#if name??>${name}</#if>

url= ${url!"www.baidu.com"}

<br>
介绍： operator：${operator.operator}
内容： ${operator.content}
时间：${date?string("yyyy-MM-dd")}
<br>
html转义函数: ${html?html}
<#assign name="mdh"/>
<#assign age=18/>
页面自定义变量输出：${name},${age}
<br>
遍历list数组
<#list ols as ol>
    name=${ol.operator!""},content=${ol.content}<br>
</#list>
<br>
Map遍历操作
<br>
<#list map?keys as k>
    ${k}----${map[k]}<br>
</#list>
<br>
<#if age lte 10>
童男子
<#elseif age gte 10 && age lte 20>
    青骚年
</#if>
