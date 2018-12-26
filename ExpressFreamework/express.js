var express = require('express')
var app = express();
 app.get('/home', function(req, res){
     res.end('Hello World from process')
 })
 app.listen(process.argv[2])