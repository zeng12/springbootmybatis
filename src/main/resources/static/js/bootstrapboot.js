/**
 * @author yanglimou
 * @date 2019/1/11 15:09
 * @Description easyui_html需要引入的js文件
 */
var bootPATH = __CreateJSPath("bootstrapboot.js");
//easyui
document.write('<link href="' + bootPATH + '../css/bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css" />');
document.write('<link href="' + bootPATH + '../css/bootstrap/font-awesome.min.css" rel="stylesheet" type="text/css" />');
document.write('<link href="' + bootPATH + '../css/bootstrap/animate.min.css" rel="stylesheet" type="text/css" />');
document.write('<link href="' + bootPATH + '../css/bootstrap/style.min.css" rel="stylesheet" type="text/css" />');
document.write('<script src="' + bootPATH + '../js/bootstrap/jquery.min.js" type="text/javascript"></script>');
document.write('<script src="' + bootPATH + '../js/bootstrap/bootstrap.min.js" type="text/javascript"></script>');
document.write('<link href="' + bootPATH + '../easyui/themes/bootstrap/easyui.css" rel="stylesheet" type="text/css" />');
document.write('<script src="' + bootPATH + '../easyui/jquery.easyui.min.js" type="text/javascript" ></script>');
document.write('<script src="' + bootPATH + '../easyui/locale/easyui-lang-zh_CN.js" type="text/javascript" ></script>');

//配置文件
document.write('<script src="' + bootPATH + 'app.js" type="text/javascript" ></script>');
//工具类
document.write('<script src="' + bootPATH + 'utils.js" type="text/javascript" ></script>');
//ajax统一设置
document.write('<script src="' + bootPATH + 'ajaxSetup.js" type="text/javascript" ></script>');






function __CreateJSPath(js) {
    var scripts = document.getElementsByTagName("script");
    var path = "";
    for (var i = 0, l = scripts.length; i < l; i++) {
        var src = scripts[i].src;
        if (src.indexOf(js) != -1) {
            var ss = src.split(js);
            path = ss[0];
            break;
        }
    }
    var href = location.href;
    href = href.split("#")[0];
    href = href.split("?")[0];
    var ss = href.split("/");
    ss.length = ss.length - 1;
    href = ss.join("/");
    if (path.indexOf("https:") == -1 && path.indexOf("http:") == -1 && path.indexOf("file:") == -1 && path.indexOf("\/") != 0) {
        path = href + "/" + path;
    }
    return path;
}

