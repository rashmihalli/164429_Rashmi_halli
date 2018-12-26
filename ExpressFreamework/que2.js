/*var express = require('express');
var app = express();

app.get('/:age', function(req, res){
   var age = req.params.age;
   var year = 2018-age;
   res.send('you were born in '+year);
});
app.listen(3000);*/

var express = require('express');
var app = express();

app.get('/year', function(req, res){
    var age = req.query.age;
    var date = new Date();
    var get_date = date.getFullYear();
    var year = get_date - age;
    res.send('you were born in '+year);
});
app.listen(3000);