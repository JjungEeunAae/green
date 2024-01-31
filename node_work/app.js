//nodejs_test.js
var http = require('http'); // import 같은것

var content = function(req, res){
    res.end("Welcome Docker Node Container" + "\n");
    //res.writeHead(200);
}
var server = http.createServer(content);    // 서버 만들어서
server.listen(8000);                        // 서버 실행했다.