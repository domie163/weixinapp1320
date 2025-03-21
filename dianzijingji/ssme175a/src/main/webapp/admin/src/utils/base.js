const base = {
    get() {
                return {
            url : "http://localhost:8080/ssme175a/",
            name: "ssme175a",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssme175a/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "电子竞技信息交流平台小程序"
        } 
    }
}
export default base
