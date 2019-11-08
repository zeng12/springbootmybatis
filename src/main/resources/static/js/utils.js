/**
 * @author yanglimou
 * @date 2019/1/11 15:10
 * @Description 通用工具
 */

/*datagrid日期列格式化函数*/
dataFormatter = function (value) {
    return dateFtt('yyyy-MM-dd hh:mm:ss', new Date(value))
}
/*datagrid前后台数据转换函数（后台返回对象还包含了一层）*/
loadFilter = function (data) {
    // loginUtils(data);
    return data.data;
}
/*easyui打开tabs，windows通过iframe的方式打开*/
getContent = function (url) {
    return '<iframe scrolling="auto" frameborder="0"  src="' + url + '" style="width:100%;height:100%;"></iframe>';
}

/*datagrid列背景颜色设置*/
function color1() {
    return 'background-color:#ff7fb2';
}

function color2() {
    return 'background-color:#fff34e';
}

function color3() {
    return 'background-color:#93cf5f';
}

function color4() {
    return 'background-color:#00bef4';
}

/*数据统计*/

function calc(t) {
    //转化率
    if (t.click > 0) {
        t.a_zhl = (t.a_num / t.click * 100).toFixed(1) + "%";
        t.a_zhl_valid = (t.a_num_valid / t.click * 100).toFixed(1) + "%";
        t.m_zhl = (t.m_num / t.click * 100).toFixed(1) + "%";
        t.m_zhl_valid = (t.m_num_valid / t.click * 100).toFixed(1) + "%";
    }
    //占比
    if (t.a_num > 0) {
        t.a_zb_valid = (t.a_num_valid / t.a_num * 100).toFixed(1) + "%";
    }
    if (t.m_num > 0) {
        t.m_zb_valid = (t.m_num_valid / t.m_num * 100).toFixed(1) + "%";
    }
    //利润
    if (t.a_profit > 0)
        t.profit_zb = (t.profit / t.a_profit * 100).toFixed(1) + "%";
}

function tj_datagrid(rows) {//
    rows.forEach(function (t) {
        calc(t)
    })
    rows.unshift(tj_summary(rows))
    return rows;
}
function tj_summary(rows) {//统计信息
    var summary = {
        click: 0,
        a_num: 0,
        a_num_valid: 0,
        m_num: 0,
        m_num_valid: 0,
        profit: 0,
        a_profit: 0,
        m_profit: 0,
    };
    rows.forEach(function (t) {
        summary.click += t.click;
        summary.a_num += t.a_num;
        summary.a_num_valid += t.a_num_valid;
        summary.m_num += t.m_num;
        summary.m_num_valid += t.m_num_valid;
        summary.profit += t.profit;
        summary.a_profit += t.a_profit;
        summary.m_profit += t.m_profit;
    })
    calc(summary)
    return summary;
}
/*固定第一行*/
function fixRow1() {
    $(this).datagrid('freezeRow',0);
}

/**
 * @author yanglimou
 * @date 2019/1/11 15:12
 * @Description 时间格式化
 */
function dateFtt(fmt, date) { //author: meizz
    var o = {
        "M+": date.getMonth() + 1,                 //月份
        "d+": date.getDate(),                    //日
        "h+": date.getHours(),                   //小时
        "m+": date.getMinutes(),                 //分
        "s+": date.getSeconds(),                 //秒
        "q+": Math.floor((date.getMonth() + 3) / 3), //季度
        "S": date.getMilliseconds()             //毫秒
    };
    if (/(y+)/.test(fmt))
        fmt = fmt.replace(RegExp.$1, (date.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt))
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
}

/**
 * @author yanglimou
 * @date 2019/1/11 15:12
 * @Description url获取请求参数
 */
function getUrlParams(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);//search,查询？后面的参数，并匹配正则
    if (r != null) return unescape(r[2]);
    return null;
}


/**
 * @author yanglimou
 * @date 2019/1/12 14:01
 * @Description 通用post方法
 */
function http(params) {
    if (params && params.url) {
        $.ajax({
            url: params.url,//请求地址
            async: params.async ? params.async : true,//是否异步，默认一部
            cache: false,//是否缓存，默认不缓存
            data: params.data,
            type: 'post',//post提交
            dataType: 'json',//返回json数据
            success: function (response) {
                // console.log("result："+JSON.stringify(response));
                if (params.success) {
                    params.success(response);
                }
            }
        })
    }
}

/**
 * @author yanglimou
 * @date 2019/1/12 14:33
 * @Description 弹出不消失提示
 */
function showAlert(text, f) {
    $.messager.alert('提示', text, 'info', f);
}

/**
 * @author yanglimou
 * @date 2019/1/15 21:57
 * @Description 弹出消失提示
 */
function showTip(text) {
    top['index'].$.messager.show({
        title: '提示',
        msg: text,
        timeout: 2000,
        showType: 'slide',
        height: 100
    });
}

/**
 * @author yanglimou
 * @date 2019/1/15 21:57
 * @Description
 */
function openWin(options) {
    if ($("#win").length == 0)
        $('<div id="win" style="overflow: hidden"></div>').appendTo($("body"));
    $('#win').window({
        width: options.width ? options.width : 600,
        height: options.height ? options.height : 400,
        modal: true,
        minimizable: false,
        collapsible: false,
        content: getContent(options.html),
        title: options.title,
        onClose:options.onClose,
    });
}

function closeWin() {
    $('#win').window('close');
}
function closeParentWin() {
    self.parent.$('#win').window('close');
}

function loading() {
    $.messager.progress({
        msg: '加载中，请稍候……',
    });
}

function loadingclose() {
    $.messager.progress('close');
}

function confirm(text, f) {
    $.messager.confirm('确认框', text, function (r) {
        if (r) {
            f();
        }
    });
}

function prompt(text, f) {
    $.messager.prompt('提示框', text, function (r) {
        if (r) {
            f(r);
        }
    });
}


function loginUtils(response) {
    if (response && response.code && response.code == 10000) {//未登录需要登陆
        errorAlert("请先登陆！！！")
        location.href = basePath + "/login.html";
    }
}