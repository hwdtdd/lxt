webpackJsonp([1],{"3g3L":function(t,e,i){e=t.exports=i("UTlt")(!1),e.push([t.i,".list-group[data-v-9c6c69d0]{padding-top:15px}",""])},HAb2:function(t,e,i){var n=i("3g3L");"string"==typeof n&&(n=[[t.i,n,""]]),n.locals&&(t.exports=n.locals);i("FIqI")("1cd449e4",n,!0,{})},bEki:function(t,e,i){"use strict";var n=function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("div",{staticStyle:{position:"absolute",background:"#eee",width:"100%",height:"100%"}},[i("mt-header",{attrs:{title:"关于app"}},[i("mt-button",{attrs:{slot:"left",icon:"back"},on:{click:t.back},slot:"left"},[t._v("返回")])],1),t._v(" "),i("div",{staticClass:"list-group"},[i("mt-cell",{attrs:{title:"评分鼓励","is-link":""}}),t._v(" "),i("mt-cell",{attrs:{title:"欢迎页","is-link":""}}),t._v(" "),i("mt-cell",{attrs:{title:"分享推荐","is-link":""}}),t._v(" "),i("mt-cell",{attrs:{title:"客服电话","is-link":""}}),t._v(" "),i("mt-cell",{attrs:{title:"问题反馈","is-link":""}})],1),t._v(" "),i("div",{staticClass:"list-group"},[i("mt-cell",{attrs:{"is-link":""},nativeOn:{click:function(e){t.check()}}},[i("span",{attrs:{slot:"title"},slot:"title"},[t._v("\n  \t\t\t检查更新\n  \t\t\t"),t.latest?i("mt-badge",{attrs:{type:"error",size:"small"}},[t._v("new")]):t._e()],1)])],1)],1)},s=[],a={render:n,staticRenderFns:s};e.a=a},cEc9:function(t,e,i){"use strict";function n(t){i("HAb2")}Object.defineProperty(e,"__esModule",{value:!0});var s=i("xmrf"),a=i("bEki"),o=i("vSla"),l=n,c=o(s.a,a.a,!1,l,"data-v-9c6c69d0",null);e.default=c.exports},xmrf:function(t,e,i){"use strict";i("YtJ0");e.a={name:"about",data:function(){return{latest:!1}},methods:{logout:function(){var t=this;MessageBox.confirm("确定要退出登录吗?","确认退出").then(function(e){t.go("login")},function(t){console.log(t)})},check:function(){utils.version.checkForUpdate()}},mounted:function(){var t=this;utils.version.getServerVersion().then(function(e){Config.nativeVersion!=e.data.nativeVersion?MessageBox.alert("当前版本过低，请安装最新版本！","版本更新").then(function(){window.open(Config.appDownloadUrl)}):Config.appVersion!=e.data.appVersion&&(t.latest=!0)})}}}});