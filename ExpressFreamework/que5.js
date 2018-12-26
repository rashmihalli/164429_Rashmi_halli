var express = require('express');
var app = express();


app.get('/form.html', function (req, res) {
   res.sendFile( __dirname + "/" + "form.html" );
})

app.get('/process_get', function (req, res) {
   // Prepare output in JSON format
   response = {
      username:req.query.username == 'rashmi',
      Password:req.query.password == 'rashmi'
   };
   
   res.end(req.query.username+" "+ req.query.password+" "+JSON.stringify(response));
})

var server = app.listen(3000, function () {
   var host = server.address().address
   var port = server.address().port
});

